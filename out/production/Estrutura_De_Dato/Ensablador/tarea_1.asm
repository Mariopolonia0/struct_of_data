;el model indica cuanto es el tam;o de memoria
    
.model small
;para definir la pila de dato                                            
.stack  
;el data reseva el espacio en memoria para las variables
.data 
    ;variable de numeros
    num1 db 0
    num2 db 0 
    resultado db 0 
    ;variable de texto
    bienvenido db 13,10,'  Bienvenido a La Tarea_1 : $' 
    espacio db 13,10,'   $'
    titulosuma db 13,10,'   Operacion sumar : $'  
    tituloresta db 13,10,'   Operacion restar : $'
    titulomultiplicacion db 13,10,'   Operacion multiplicar : $'
    titulodivicion db 13,10,'   Operacion dividir : $'
    mensaje db 13,10,'Digite numero Uno : $'
    mensaje2 db 13,10,'Digite numero Dos : $' 
    Msuma db 13,10,'Resultado Suma: $' 
    Mresta db 13,10,'Resultado Suma: $'
    Mmultiplicacion db 13,10,'Resultado Suma: $'
    Mdivicion db 13,10,'Resultado Suma: $'
    
    

.code 
    inicio:
        
        mov ax, @data  
        mov ds,ax 
        
        mov ah, 9    
        lea dx, bienvenido
        int 21h
        
        mov ah, 9   
        lea dx, espacio
        int 21h
        
        mov ah, 9   
        lea dx, titulosuma
        int 21h
        
        mov ah, 9    
        lea dx, espacio
        int 21h
        
        mov ah, 9   
        lea dx, mensaje
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num1,al 
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje2
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num2,al 
        
        mov al,num1
        add al,num2   ;se suman las dos variable
        mov resultado,al 
        
        mov ah,9
        lea dx,Msuma   
        int 21h
        mov dl,resultado
        add dl,30h
        mov ah,2
        int 21h 
        
        ;OPERACION SUMA
        mov ah, 9    ;introducir dato
        lea dx, espacio
        int 21h
        
        mov ah, 9    ;introducir dato
        lea dx, tituloresta
        int 21h
        
        mov ah, 9    ;introducir dato
        lea dx, espacio
        int 21h
        
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num1,al 
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje2
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num2,al 
        
        mov al,num1
        sub al,num2   ;se restan las dos variable
        mov resultado,al 
        
        mov ah,9
        lea dx,Mresta   
        int 21h
        mov dl,resultado
        add dl,30h
        mov ah,2
        int 21h
        
        
        ;OPERACION MULTIPLICAR
        mov ah, 9    ;introducir dato
        lea dx, espacio
        int 21h
        
        mov ah, 9    ;introducir dato
        lea dx, titulomultiplicacion
        int 21h
        
        mov ah, 9    ;introducir dato
        lea dx, espacio
        int 21h
        
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num1,al 
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje2
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num2,al 
        
        mov al,num1
        mul num2  ;se multiplican las dos variable
        mov resultado,al 
        
        mov ah,9
        lea dx,Mmultiplicacion  
        int 21h
        mov dl,resultado
        add dl,30h
        mov ah,2
        int 21h
       
        ;OPERACION DUVICION
        mov ah, 9    ;introducir dato
        lea dx, espacio
        int 21h
        
        mov ah, 9    ;introducir dato
        lea dx, titulodivicion
        int 21h
        
        mov ah, 9    ;introducir dato
        lea dx, espacio
        int 21h
        
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num1,al 
        
        mov ah, 9    ;introducir dato
        lea dx, mensaje2
        int 21h 
        mov ah,1
        int 21h
        sub al, 30h ;con sub entra los dato
        mov num2,al 
        
        mov al,num1
        div num2  ;se multiplican las dos variable
        mov resultado,al 
        
        mov ah,9
        lea dx,Mdivicion   
        int 21h
        mov dl,resultado
        add dl,30h
        mov ah,2
        int 21h
       
    end inicio         
      
    