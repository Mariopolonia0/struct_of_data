Program pedir_50_numero_y_decir_el_mayor;

Uses crt;

Var 
  n : integer;
  m : integer;
  v : integer;
  c: integer;
Begin
  writeln('a continuacion le pediremos 50 numeros y le diremos el mayor ');
  writeln('');
  v := 0;
  c  := 0;
  Repeat
    c := c+1 ;
    writeln('diga numero ',c);
    read(n);
    v := v+1;
    If n>m Then
      m := n
  Until  v=50;
  writeln('');
  writeln(m,' es el numero mayor de los 50') ;
  writeln('');
  write('presione cualquier tecla para terminar')    ;
  readkey
End.
