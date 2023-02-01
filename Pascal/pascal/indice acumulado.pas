program indice_acumulado;
                             uses crt ;
   Var
   n1: real;
   n2: real;
   n3: real;
   n4: real;
   n5: real;
   c1: real;
   c2: real;
   c3: real;
   c4:  real;
   c5: real;
   c: real;
   n:  real;
   i: real;
begin
       writeln ('diga la nota 1'); readln(n1); writeln ('diga la nota 2');readln(n2);writeln ('diga la nota 3'); readln(n3);writeln ('diga la nota 4');
       readln(n4); writeln ('diga la nota 5');readln(n5);writeln ('diga la credicto 1'); readln(c1);writeln ('diga la credicto 2');
       readln(c2); writeln ('diga la credicto 3');readln(c3); writeln ('diga la credicto 4');readln(c4);writeln ('diga la credicto 5');
       readln(c5);
       n:=n1+n2+n3+n4+n5;
       c:=c1+c2+c3+c4+c5;
       i:=n/c;  writeln('')  ;
       writeln (i:0:1,'este es el indice acumulado');
                      readkey


end.
