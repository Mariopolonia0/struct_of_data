from machine import Pin, PWM
import utime
import network
import socket
import time

#configuration wifi 
ssid = 'SpectrumSetup-BA'
password = 'smallshark004'

wlan = network.WLAN(network.STA_IF)
wlan.active(True)
wlan.connect(ssid, password)

#500000  posicion inicial del motor donde esta ubicado
#1570000 posicion para apagar el interrutor

positionNormal = 1300000 #donde esta el motor en descanso
positionApagar = 1570000 #donde el motor apaga el interrutor

positionNormalTwo = 1900000 #donde esta el motor en descanso
positionEnceder = 1600000 #donde el motor apaga el interrutor

led = Pin(0, Pin.OUT)
ledError = Pin(3, Pin.OUT)
pwm = PWM(Pin(1))
pwmTwo = PWM(Pin(2))

pwm.freq(50)
pwmTwo.freq(50)
ledError.value(0)

pwm.duty_ns(positionNormal)
pwmTwo.duty_ns(positionNormalTwo)

# HTML template for the webpage
def webpage(state):
    html = f"""
            <!DOCTYPE html>
            <html>

            <head>
                <title>Pico Web Server</title>
                <meta name="viewport" content="width=device-width, initial-scale=1">
            </head>

            <body style="
                    background: darkgray;
                    display: flex;display: flex;
                    flex-direction: column;
                    align-items: center;">

                <h2>Web Server</h2>
                <img src="https://i.ibb.co/TLyLgy4/SPIcon.png"
                    alt="SPIcon"
                    border="0"
                    style=" width: 30%;">
                <h3>Interruptor</h3>
                
               
                
                <form style="margin: 1% 0%;" action="./lightoff">
                    <button style="font-size: larger;" type="submit" onclick="">Light off</button>
                </form>

                <form style="margin: 1% 0%;" action="./lighton">
                    <button style="font-size: larger;" type="submit">Light on</button>
                </form>

                <p>Switch state: {state}</p>

                <h3>Raspberry Pi Pico</h3>
            </body>

            </html>
        """
    return str(html)

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

# Set up socket and start listening
addr = socket.getaddrinfo('0.0.0.0', 80)[0][-1]
s = socket.socket()
s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
s.bind(addr)
s.listen()

print('listening on', addr)

# Initialize variables
state = "OFF"

# Listen for connections
while True:
    try:
        conn, addr = s.accept()
        print('Got a connection from', addr)
        
        # Receive and parse the request
        request = conn.recv(1024)
        request = str(request)
        print('Request content = %s' % request)

        try:
            request = request.split()[1]
            print('Request:', request)
            
        except IndexError:
            ledError.value(1)
            utime.sleep(1)
            ledError.value(0)
            pass
        
        # Process the request and update variables
        if request == '/lightoff?':
            led.value(1)
            pwm.duty_ns(positionApagar)
            utime.sleep(1)
            led.value(0)
            state = "OFF"
            pwm.duty_ns(positionNormal)
            
        # Process the request and update variables
        #positionNormal = 1300000 #donde esta el motor en descanso
        #positionApagar = 1570000 #donde el motor apaga el interrutor
        if request == '/lighton?':
            led.value(1)
            pwmTwo.duty_ns(positionEnceder)
            utime.sleep(1)
            led.value(0)
            state = "ON"
            pwmTwo.duty_ns(positionNormalTwo)
        
        # Generate HTML response
        response = webpage(state)

        # Send the HTTP response and close the connection
        conn.send('HTTP/1.0 200 OK\r\nContent-type: text/html\r\n\r\n')
        conn.send(response)
        conn.close()

    except OSError as e:
        cl.close()
        ledError.value(1)
        print('-----------connection closed---------------')
