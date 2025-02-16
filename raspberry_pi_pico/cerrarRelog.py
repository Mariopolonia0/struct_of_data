from machine import Pin, PWM
import utime
import network
import socket

#500000  posicion inicial del motor donde esta ubicado
#1570000 posicion para apagar el interrutor

EstadoCerrado = 2585300  #donde esta el motor en descanso
EstadoAbierto = 500000 #donde el motor apaga el interrutor

led = Pin(0, Pin.OUT)
ledError = Pin(3, Pin.OUT)
pwm = PWM(Pin(1))

pwm.freq(50)
ledError.value(0)

pwm.duty_ns(EstadoCerrado)

# Initialize variables
state = "Cerrado" #Apagado

# Listen for connections
while True:
    hora_actual = utime.localtime()
    hora = hora_actual[3]
    minuto = hora_actual[4]
    minuto_before = 0
    
    if minuto_before == minuto:
        print("hora "+f"{hora:02d}:{minuto:02d}")
    else:
        
        
    if hora == "21" and minuto == 04:
        led.value(1)
        pwm.duty_ns(EstadoAbierto)
        utime.sleep(1)
        led.value(0)
        state = "Abierto"
        
    if minuto == 07:
        ledError.value(1)
        pwm.duty_ns(EstadoCerrado)
        utime.sleep(1)
        ledError.value(0)
        state = "Cerrado"
        
        utime.sleep(10)
