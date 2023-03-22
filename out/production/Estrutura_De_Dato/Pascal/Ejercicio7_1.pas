
Program Ejercicio7_1;

Var 
   (* un array del 1 al 10 *)
  arrayEnteros: array [1..10] Of integer;
  i, j: integer;

Begin
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
End.
