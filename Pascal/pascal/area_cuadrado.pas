
Program area_cuadrado;

Uses crt;

Var 
  a: integer;

Begin
  writeLn ('');
  write ('diga el unos de los lado del cuadrado:');
  readln (a);
  a := a * a;
  writeLn ('');
  writeln (a, ' cm es el area del cuadrado');
End.
