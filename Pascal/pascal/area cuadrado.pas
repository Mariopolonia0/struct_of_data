program area_del_cudrado;
            uses crt;

            var
            a:integer   ;
begin

    writeln ('diga el unos de los lado del cuadrado');
    readln (a);
       a:=a*a;
       WriteLn('');     gotoxy(20,8)   ;
       writeln (a,' cm es el area del cuadrado');
   readkey

end.
