from machine import Pin, PWM ,RTC
import utime
import network,ntptime
import socket
import time
import struct

#configuration wifi 
ssid = 'SpectrumSetup-BA'
password = 'smallshark004'

wlan = network.WLAN(network.STA_IF)
wlan.active(True)
wlan.connect(ssid, password)

# Wait for Wi-Fi connection
connection_timeout = 10
while connection_timeout > 0:
    if wlan.status() >= 3:
        break
    connection_timeout -= 1
    print('Waiting for Wi-Fi connection...')
    time.sleep(1)

status = wlan.ifconfig()
print( 'ip = ' + status[0] )


ntptime.host = '10.1.1.1'  # Main router running ntpd.
ntptime.settime()


