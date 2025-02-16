from machine import Pin
import network
import ntptime
import utime

led = Pin(0, Pin.OUT)
ledError = Pin(3, Pin.OUT)
ledBlue = Pin(2, Pin.OUT)
button = Pin(21, Pin.IN, Pin.PULL_DOWN)
buttonTwo = Pin(20, Pin.IN, Pin.PULL_DOWN)
relay = Pin(1,Pin.OUT)  #relay = Pin(relay_pin, Pin.OUT)/

led.value(0)
ledError.value(0)
ledBlue.value(0)

#configuration wifi 
ssid = 'SpectrumSetup-BA'
password = 'smallshark004'

wlan = network.WLAN(network.STA_IF)
wlan.active(True)
wlan.connect(ssid, password)

while not wlan.isconnected():
    pass

print("Conexión WiFi establecida:", wlan.ifconfig())

# Obtener la hora desde un servidor NTP
try:
    ntptime.host = 'pool.ntp.org'
    ntptime.settime()
except OSError as e:
    ledError.value(1)
    print('Caught OSError: [Errno12]')

# Convertir UTC a tu zona horaria (por ejemplo, UTC-5)
utc_offset = -5 * 3600

relay.value(0)#relay is on (se enciende el relog)

# Mostrar la hora ajustada
while True:
    try:
        local_time = utime.localtime(utime.time() + utc_offset)

        if local_time[3] == 00 and local_time[4] == 00:
            relay.value(0)#relay is on (se apaga el relog)
            utime.sleep(1)
            
        if local_time[3] == 06 and local_time[4] == 30:
            relay.value(1)#relay is off (se enciede el relog)
            utime.sleep(1)
        
        if button.value() == 1:
            relay.value(0)#relay is on (se apaga el relog)
            utime.sleep(1)

        if buttonTwo.value() == 1:
            relay.value(1)#relay is off (se enciede el relog)
            utime.sleep(1)

    except OSError as e:
        led.value(1)
