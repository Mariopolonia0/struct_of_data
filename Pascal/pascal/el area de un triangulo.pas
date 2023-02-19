
Program area_del_cudrado;

Uses crt;

Var 
  a,h,b: integer   ;
Begin

  writeln ('diga la haltura del triangulo');
  readln (h);
  writeln ('diga la base del triangulo');
  readln (b);
  a := (b*h)Div(2)    ;
  WriteLn('');
  writeln (a,'cm es el area del triangulo');
  readkey

End.
