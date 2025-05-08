from microdot import Microdot

app = Microdot()

html = '''<!DOCTYPE html>
<html>
    <head>
        <title>Microdot Example Page</title>
        <meta charset="UTF-8">
    </head>
    <body>
        <div>
            <h1>Microdot Example Page</h1>
            <p>Hello from Microdot!</p>
             <img src="https://i.ibb.co/TLyLgy4/SPIcon.png"
                    alt="SPIcon"
                    border="0"
                    style=" width: 30%;">
            <p><a href="/shutdown">Click to shutdown the server</a></p>
        </div>
            <label id="text" type="text" id="nombreUsuario" class="labelTitulo">Hola</label>
            <button style="font-size: larger;" type="submit" onclick="cambiar()">Cambiar</button>
    </body>
    <script>
    function cambiar(){
        document.getElementById("text").innerHTML = "New text!";
    }
    
</script>
</html>
'''


@app.route('/')
async def hello(request):
    return html, 200, {'Content-Type': 'text/html'}


@app.route('/shutdown')
async def shutdown(request):
    request.app.shutdown()
    return 'The server is shutting down...'


app.run(debug=True)
