from microdot import Microdot, Response, Request
from machine import Pin, PWM
import mfrc522
import _thread
import time

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
        
def read_card():
    while True:
        value = reader.getCardValue()
        
        if (value != ""):
            
            if(value == "0x53283114"):
                pwm.duty_ns(OPEN)
                ledWhite.value(0)
                ledBlue.value(1)
                time.sleep(3)
                pwm.duty_ns(CLOSE)
                ledBlue.value(0)
                ledWhite.value(1)
            else:
                ledWhite.value(0)
                ledRed.value(1)
                time.sleep(3)
                ledRed.value(0)
                ledWhite.value(1)
                
#mandamos la funcion que leer el card a segundo hilo
_thread.start_new_thread(read_card,())

app = Microdot()

cerradura = "Close"

led_pin = Pin(21, Pin.OUT)

class Persona:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

# Crear lista de objetos
lista_personas = [
    Persona('Juan', 30),
    Persona('María', 25),
    Persona('Pedro', 40)
]

def render_template(template_name, **context):
    with open(template_name, 'r') as f:
        template = f.read()
    lista_html = ''
    for persona in context['lista_personas']:
        lista_html += f'<li>{persona.nombre}, {persona.edad} años</li>'
    return template.replace('{{ lista }}', lista_html)

@app.route('/')
def index(request):
    return Response(render_template('index.html', lista_personas=lista_personas),200, {'Content-Type': 'text/html'})

@app.route('/open')
def apagar_led(request):
    pwm.duty_ns(OPEN)
    return {'estado': 'Open'}

@app.route('/close')
def apagar_led(request):
    pwm.duty_ns(CLOSE)
    return {'estado': 'Close'}

app.run(port=8000)
