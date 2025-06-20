
from microdot import Microdot, Response, Request
from machine import Pin

app = Microdot()

estado_led = "Encedido"

led_pin = Pin(21, Pin.OUT)

with open('index.html', 'r') as archivo:
    template = archivo.read()

@app.route('/')
def index(request):
    return template.replace('{estado_led}', estado_led),200, {'Content-Type': 'text/html'}

@app.route('/apagar')
def apagar_led(request):
    led_pin.value(0)
    return {'estado': 'Apagado'}

@app.route('/enceder')
def apagar_led(request):
    led_pin.value(1)
    return {'estado': 'Encedido'}

@app.route('/off_led', methods=['POST'])
def cambiar_nombre(request: Request):
    led_pin.value(0)
    global estado_led
    estado_led = "Apagado"
    return Response.redirect('/')

@app.route('/on_led', methods=['POST'])
def cambiar_nombre(request: Request):
    led_pin.value(1)
    global estado_led
    estado_led = "Encedidio"
    return Response.redirect('/')

app.run(port=8080)
