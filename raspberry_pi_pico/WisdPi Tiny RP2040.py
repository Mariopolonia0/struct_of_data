#Codigo WisdPi Tiny RP2040
import machine, neopixel
import utime

pixel_pin = 29
pixel = neopixel.NeoPixel(machine.Pin(pixel_pin), 1)

led = machine.Pin(20,machine.Pin.OUT)
led1 = machine.Pin(19,machine.Pin.OUT)
led2 = machine.Pin(18,machine.Pin.OUT)
led3 = machine.Pin(17,machine.Pin.OUT)

led.low()
led1.low()
led2.low()
led3.low()

while True:
    pixel[0] = (255, 0, 0)
    pixel.write()
    led.toggle()
    utime.sleep_ms(500)
    led.low()

    pixel[0] = (0, 17, 255)
    pixel.write()
    led1.toggle()
    utime.sleep_ms(500)
    led1.low()

    pixel[0] = (43, 255, 0)
    pixel.write()
    led2.toggle()
    utime.sleep_ms(500)
    led2.low()

    pixel[0] = (255, 255, 0)
    pixel.write()
    led3.toggle()
    utime.sleep_ms(500)
    led3.low()
