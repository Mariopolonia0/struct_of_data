Algoritmo sin_titulo
	Dimension lista[3]
	lista[1] = 10
	lista[2] = 2
	lista[3] = 3
	sumaImpares = 0
    sumaPares = 0
    suma = 0
	
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		suma = suma + lista[i]
		Si lista[i] % 2 == 0 Entonces
			sumaPares = sumaPares + lista[i]
		SiNo
			sumaImpares = sumaImpares + lista[i]
		Fin Si
	Fin Para
	
	Escribir "suma de los pares:",sumaPares
	Escribir "suma de los impares:",sumaImpares
	Escribir "suma de todos:",suma
FinAlgoritmo
