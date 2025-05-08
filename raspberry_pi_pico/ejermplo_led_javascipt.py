
from microdot import Microdot, Response, Request
from machine import Pin

app = Microdot()

estado_led = "Encedido"

led_pin = Pin(21, Pin.OUT)

template = '''
<html>
    <head>
        <title>Ejemplo</title>
    </head>
    <body style="
        background: darkgray;
        display: flex;
        flex-direction: column;
        align-items: center;">
        
        <h1 id="estado_led">Estado del led : {estado_led} </h1>
        
        <label id="text" type="text" id="nombreUsuario" style="font-size: xx-large;margin: 30px;" >solo HTML</label>
        
        <form action="/off_led" method="post">
            <button style="font-size: xx-large;margin: 30px;">Apagar LED</button>
        </form>
        <form action="/on_led" method="post">
            <button style="font-size: xx-large;margin: 30px;">Enceder LED</button>
        </form>
        
        <label style="font-size: xx-large;margin: 30px;" id="text" type="text" id="nombreUsuario" >JavaScript</label>
        <button style="font-size: xx-large;margin: 30px;" type="submit" onclick="apagar_led()">Apagar</button>
        <button style="font-size: xx-large;margin: 30px;" type="submit" onclick="enceder_led()">Enceder</button>
    </body>
    
    <script>
        function apagar_led(){
            document.getElementById("estado_led").innerHTML = "Estado del LED: Apagado";
            fetch('/apagar')
            .then(response => response.json())
            .then(data => alert("Estado: " + data.estado));
        }
        
        function enceder_led(){
            document.getElementById("estado_led").innerHTML = "Estado del LED: Encedido";
            fetch('/enceder')
            .then(response => response.json())
            .then(data => alert("Estado: " + data.estado));
        }
    </script>
    
</html>
'''

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

app.run()
