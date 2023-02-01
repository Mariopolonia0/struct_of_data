program numeros_par;

    uses crt;

 var  p:integer;
     n: integer;
     v:integer ;
 begin
         v:=0;
       Repeat

       v:= v+1;
          write('diga numero para decirle si es par = ') ;
         read(  n) ; writeln('') ;
         if ((n mod 2 = 0))   then   begin
              p:=n  ;
             writeln(p,' es un numero par') ;  writeln('') ;
             end
      else  begin
            write('');
              writeln(n,' no es un numero par');writeln('') ;
               end;
       Until  v>=50  ;



          writeln('precione cualquier tecla para terminar') ;                      readkey
     end.

