from machine import Pin,UART

ledUno = machine.Pin(16,Pin.OUT)
ledDos = machine.Pin(17,Pin.OUT)
ledTres = machine.Pin(18,Pin.OUT)
ledWhite = machine.Pin(15,Pin.OUT)

ledUno.value(1)
ledDos.value(1)
ledTres.value(1)
ledWhite.value(1)

uart = UART(0,9600)

while True:
    if uart.any() > 0:
        dato = uart.readline()
        print(dato)
        
        if "1" in dato:
            ledDos.value(1)
            ledTres.value(1)
            ledWhite.value(1)
            ledUno.value(0)
            
        if "2" in dato:
            ledTres.value(1)
            ledUno.value(1)
            ledWhite.value(1)
            ledDos.value(0)
            
        if "3" in dato:
            ledDos.value(1)
            ledUno.value(1)
            ledWhite.value(1)
            ledTres.value(0)
            
        if "4" in dato:
            ledDos.value(1)
            ledUno.value(1)
            ledTres.value(1)
            ledWhite.value(0)
            
        if "5" in dato:
            ledDos.value(1)
            ledUno.value(1)
            ledTres.value(1)
            ledWhite.value(1)
            

"""
video uno de curso para raspberry pi pico

para solo importar clases espisifica de una libreria
from machine import Pin 
"""


"""
ledUno = machine.Pin(16,machine.Pin.OUT)
ledDos = machine.Pin(17,machine.Pin.OUT)
ledTres = machine.Pin(18,machine.Pin.OUT)

leds = [ledUno,ledDos,ledTres]

for i in range(3):
        leds[i].value(1)
    

while True:
    for i in range(3):
        leds[i].value(0)
        utime.sleep_ms(500)
        leds[i].value(1)
        utime.sleep_ms(500)
    
"""


"""
#boton.irq(interrupcion, machine.Pin.IRQ_FALLING)

contador = 0

boton_derecha = machine.Pin(14, machine.Pin.IN, machine.Pin.PULL_UP)
boton_izquierda = machine.Pin(15, machine.Pin.IN, machine.Pin.PULL_UP)

ledUno = machine.Pin(18,machine.Pin.OUT)
ledDos = machine.Pin(19,machine.Pin.OUT)
ledTres = machine.Pin(20,machine.Pin.OUT)
ledCuatros = machine.Pin(21,machine.Pin.OUT)
ledCinco = machine.Pin(22,machine.Pin.OUT)

ledUno.value(1)
ledDos.value(1)
ledTres.value(1)

leds = [ledUno,ledDos,ledTres,ledCuatros,ledCinco]

izquierda = True
derecha   = False

for i in range(5):
    leds[i].value(1)

while True:
    #Si presiona el botón de la izquierda
    if boton_izquierda.value() == 0:
        izquierda = True
        derecha   = False
        
    #Si presiona el botón de la derecha
    if boton_derecha.value() == 1:
        izquierda = False
        derecha   = True

    #Si presiona ambos botones
    if boton_izquierda.value() == 0 and boton_derecha.value() == 0 :
        izquierda = True
        derecha   = True
    
    #Rotación de leds a la izquierda
    if izquierda and not derecha:
        for i in range(5):
            leds[i].on()
            utime.sleep_ms(200)
            leds[i].off()
            utime.sleep_ms(200)
            
    #Rotación de leds a la derecha
    if not izquierda and derecha:
        for i in range(4,-1,-1):
            leds[i].on()
            utime.sleep_ms(200)
            leds[i].off()
            utime.sleep_ms(200)
            
    if izquierda and derecha:
        for i in range(5):
            leds[i].on()


"""


"""
#EJEMPLO DE TIMER PARA EVITAR USAR UN WHILE
def tick(timer):
    global led
    led.toggle()

led = machine.Pin(25,machine.Pin.OUT)
tim = machine.Timer()

tim.init(freq = 2.5, mode = machine.Timer.PERIODIC, callback=tick)

"""


"""
boton = machine.Pin(15,machine.Pin.IN)

while True:
    print(boton.value())
    if boton():
        utime.sleep_ms(200 )
        led.off()
    else:
        led.on() 
       
"""  
"""
while True:
    led.on()
    print('encedido')
    utime.sleep(1)
    led.off()
    print('apagado')
    utime.sleep(1)
"""     