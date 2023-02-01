program pedir_50_numero_y_decir_el_mayor ;
uses crt;
var
     n : integer;
     m : integer;
     v : integer;
      c: integer;
 begin
       writeln('a continuacion le pediremos 50 numeros y le diremos el mayor ');
         writeln('');
         v:=0;
         c  :=0;
      repeat
           c:=c+1 ;
          writeln('diga numero ',c);
          read(n);
          v:=v+1;
             if n>m then
               m:=n
        until  v=50; writeln('');
            writeln(m,' es el numero mayor de los 50') ;  writeln('');
        write('presione cualquier tecla para terminar')    ;
             readkey
        end.

