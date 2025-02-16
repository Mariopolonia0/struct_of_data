#Codigo WisdPi Tiny RP2040
from time import sleep
from machine import Pin,UART
import neopixel

pixel_pin = 29
pixel = neopixel.NeoPixel(machine.Pin(pixel_pin), 1)
pixel[0] = (0, 17, 255)
pixel.write()

# led = machine.Pin(20,machine.Pin.OUT)
# led1 = machine.Pin(19,machine.Pin.OUT)
# led2 = machine.Pin(18,machine.Pin.OUT)
# led3 = machine.Pin(17,machine.Pin.OUT)


leftBack = machine.Pin(20,Pin.OUT)
leftForward = machine.Pin(19,Pin.OUT)

rigthForward = machine.Pin(18,Pin.OUT)
righBack = machine.Pin(17,Pin.OUT)

leftForward.value(0)
leftBack.value(0)

rigthForward.value(0)
righBack.value(0)

uart = UART(0,9600)

while True:
    if uart.any() > 0:
        dato = uart.readline()
        print(dato)
        
        if "0" in dato:
            leftForward.value(0)
            leftBack.value(0)
            rigthForward.value(0)
            righBack.value(0)
            pixel[0] = (0, 0, 0)
            pixel.write()
            
        if "1" in dato:
            leftForward.value(1)
            rigthForward.value(1)
            leftBack.value(0)
            righBack.value(0)
            pixel[0] = (0, 0, 255)
            pixel.write()
            
        if "2" in dato:
            leftBack.value(1)
            righBack.value(1)
            rigthForward.value(0)
            leftForward.value(0)
            pixel[0] = (255, 0, 0)
            pixel.write()
            
            
            
