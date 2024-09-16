from machine import Pin, PWM
import utime

MID = 1500000
MIN = 1000000
MAX = 2000000

led = Pin(0, Pin.OUT)
pwm = PWM(Pin(1))

pwm.freq(50)

pwm.duty_ns(MID)