Program numeros_par;

Var
  p: integer;
  n: integer;
  v: integer;
Begin
  v := 0;
  Repeat

    v := v + 1;
    write('diga numero para decirle si es par = ');
    read(n);
    writeln('');
    If ((n Mod 2 = 0))   Then
    Begin
      p := n;
      writeln(p, ' es un numero par');
      writeln('');
    End
    Else
    Begin
      write('');
      writeln(n, ' no es un numero par');
      writeln('');
    End;
  Until  v >= 50;

  writeln('precione cualquier tecla para terminar');

End.
