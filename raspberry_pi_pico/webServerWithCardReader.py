from machine import Pin, SPI, PWM
import mfrc522 
import time
import network
import socket
import _thread

#inicializo la clase de reader rc522
reader = mfrc522.MFRC522(sck=4,miso=5,mosi=6,cs=7,rst=1)

#Inicilizo la variable para el motor servo
pwm = PWM(Pin(0))
pwm.freq(50)

CLOSE = 2000000
OPEN = 1200000
pwm.duty_ns(CLOSE)

ledBlue = Pin(21,Pin.OUT)
ledBlue.value(0)

ledRed = Pin(10,Pin.OUT)
ledRed.value(0)

ledWhite = Pin(20,Pin.OUT)
ledWhite.value(1)


#configuration wifi 
ssid = 'SpectrumSetup-BA'
password = 'smallshark004'

wlan = network.WLAN(network.STA_IF)
wlan.active(True)
wlan.connect(ssid, password)

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
                <h3>Lock</h3>
                
                <form style="margin: 1% 0%;" action="./lightoff">
                    <button style="font-size: larger;" type="submit" onclick="">Close</button>
                </form>

                <form style="margin: 1% 0%;" action="./lighton">
                    <button style="font-size: larger;" type="submit">Open</button>
                </form>

                <p>Lock state: {state}</p>

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

def read_card():
    while True:
        value = reader.getCardValue()
        
        if (value != ""):
            ledWhite.value(0)
            if(value == "0x53283114"):
                print("bienvenido")
                pwm.duty_ns(OPEN)
                ledBlue.value(1)
                time.sleep(3)
                pwm.duty_ns(CLOSE)
                ledBlue.value(0)
            else:
                print("No esta en la lista")
                ledRed.value(1)
                time.sleep(3)
                ledRed.value(0)
         
        ledWhite.value(1) 
        time.sleep(1)
    
_thread.start_new_thread(read_card,())

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
        if request == '/lighton?':
            print("LED on")
            pwm.duty_ns(OPEN)
            state = "Open"
        elif request == '/lightoff?':
            pwm.duty_ns(CLOSE)
            state = 'Close'

        # Generate HTML response
        response = webpage(state)

        # Send the HTTP response and close the connection
        conn.send('HTTP/1.0 200 OK\r\nContent-type: text/html\r\n\r\n')
        conn.send(response)
        conn.close()

    except OSError as e:
        cl.close()
        print('connection closed')