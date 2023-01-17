program Ejercicio7_1;

var
    (* un array del 1 al 10 *)
   arrayEnteros: array [1..10] of integer;   
   i, j: integer;

begin
    i := 1;
    j := 2;
    
    arrayEnteros[i] := j;
    arrayEnteros[j] := i;
    writeln (arrayEnteros[i]);
    writeln (arrayEnteros[j]);
    
    arrayEnteros[j+i] := i+j;
    i := arrayEnteros[i] + arrayEnteros[j];
    writeln ('------');
    writeln (arrayEnteros[i]);
    writeln (arrayEnteros[j]);
    
    arrayEnteros[3] := 5;
    j := arrayEnteros[i] - arrayEnteros[j];
    writeln ('------');
    writeln (arrayEnteros[i]);
    writeln (arrayEnteros[j]);
end.