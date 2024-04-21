#Codigo WisdPi Tiny RP2040
import machine, neopixel

pixel_pin = 29
pixel = neopixel.NeoPixel(machine.Pin(pixel_pin), 1)
pixel[0] = (255, 5, 5)
pixel.write()
