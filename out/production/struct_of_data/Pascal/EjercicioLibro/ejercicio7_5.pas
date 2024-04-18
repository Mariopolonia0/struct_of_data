program ejercicio7_5;

{ Cálculo de la suma de todos los elementos de un vector, así como la media aritmética  }

var 
    arrayEntero : array[0..8] of integer;
    contador: integer;
    suma: integer;
begin
   
    For contador:= 0 to 8 do
    begin
        arrayEntero[contador] := random(10); {esto generará Nº de 0 a 10}
    end;
    
    For contador:= 0 to 8 do
    begin
        suma := suma + arrayEntero[contador];
        Writeln(arrayEntero[contador]);
    end;
    
    Writeln('la suma es: ',suma,' y la media aritmética es :',suma/8);
  
end.

