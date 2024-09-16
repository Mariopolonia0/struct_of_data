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

led = Pin(0, Pin.OUT)
pwm = PWM(Pin(1))

pwm.freq(50)

pwm.duty_ns(positionNormal)

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
                    
                <h1>Raspberry Pi Pico Web Server</h1>
                <h2>Apagar Interruptor</h2>
                
                <form action="./lightoff">
                    <input style="
                        font-size: 20px;
                        line-height: 50px;
                        text-align: center;
                        width: 100px;
                        height: 50px;" type="submit" value="Light off" />
                </form>
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
            pass
        
        # Process the request and update variables
        if request == '/lightoff?':
            led.value(1)
            pwm.duty_ns(positionApagar)
            utime.sleep(1)
            led.value(0)
            pwm.duty_ns(positionNormal)
            
        # Generate HTML response
        response = webpage(state)

        # Send the HTTP response and close the connection
        conn.send('HTTP/1.0 200 OK\r\nContent-type: text/html\r\n\r\n')
        conn.send(response)
        conn.close()

    except OSError as e:
        cl.close()
        print('connection closed')
