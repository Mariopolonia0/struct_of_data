from microdot import Microdot, Request, Response

app = Microdot()

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

@app.route('/')
def index(request):
    html = '''
    <html>
    <body>
    <h1>Lista de personas</h1>
    <ul>
    '''
    for persona in lista_personas:
        html += f'<li>{persona.nombre}, {persona.edad} años</li>'
    html += '''
    </ul>
    <form action="/agregar" method="post">
        <input type="text" name="nombre" placeholder="Nombre">
        <input type="number" name="edad" placeholder="Edad">
        <input type="submit" value="Agregar">
    </form>
    </body>
    </html>
    '''
    return Response(html,200, {'Content-Type': 'text/html'})

@app.route('/agregar', methods=['POST'])
def agregar(request):
    nombre = request.form.get('nombre')
    edad = int(request.form.get('edad'))
    lista_personas.append(Persona(nombre, edad))
    return Response.redirect('/')


app.run(port=8000)