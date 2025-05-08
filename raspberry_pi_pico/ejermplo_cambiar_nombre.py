
from microdot import Microdot, Response, Request

app = Microdot()

nombre = 'Juan'

template = '''
<html>
    <head>
        <title>Ejemplo</title>
    </head>
    <body>
        <h1>Hola, mi nombre es {nombre}</h1>
        <form action="/cambiar_nombre" method="post">
            <input type="text" name="nuevo_nombre" placeholder="Ingrese el nuevo nombre">
            <input type="submit" value="Cambiar nombre">
        </form>
    </body>
</html>
'''

@app.route('/')
def index(request):
    return template.replace('{nombre}', nombre)

@app.route('/cambiar_nombre', methods=['POST'])
def cambiar_nombre(request: Request):
    global nombre
    nuevo_nombre = request.form.get('nuevo_nombre')
    if nuevo_nombre:
        nombre = nuevo_nombre
    return Response.redirect('/')

app.run()