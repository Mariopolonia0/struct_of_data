from machine import Pin, SPI, PWM
import mfrc522 
import time

#inicializo la clase de reader rc522
#reader = MFRC522(sck=4,miso=5,mosi=6,cs=7,rst=1)

reader = mfrc522.MFRC522("GP14", "GP16", "GP15", "GP22", "GP17")

#Inicilizo la variable para el motor servo
pwm = PWM(Pin(0))
pwm.freq(50)

CLOSE = 2000000
OPEN = 1200000
pwm.duty_ns(CLOSE)

ledBlue = Pin(21,Pin.OUT)
ledBlue.value(0)

ledRed = Pin(10,Pin.OUT)
ledRed.value(0)

ledWhite = Pin(20,Pin.OUT)
ledWhite.value(1)


while True:
   
    value = reader.getCardValue()
    
    if (value != ""):
        ledWhite.value(0)
        if(value == "0x53283114"):
            print("bienvenido")
            pwm.duty_ns(OPEN)
            ledBlue.value(1)
            time.sleep(3)
            pwm.duty_ns(CLOSE)
            ledBlue.value(0)
        else:
            print("No esta en la lista")
            ledRed.value(1)
            time.sleep(3)
            ledRed.value(0)
     
    ledWhite.value(1) 
    time.sleep(1)
    
