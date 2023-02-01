program area_del_cudrado;
            uses crt;

            var
            a,h,b:integer   ;
begin

    writeln ('diga la haltura del triangulo');
    readln (h);
    writeln ('diga la base del triangulo');
    readln (b);
       a:=(b*h)div(2)    ;
       WriteLn('');
       writeln (a,'cm es el area del triangulo');
   readkey

end.
