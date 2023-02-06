program area_del_cudrado;
uses crt;

var
a:integer;

begin 
    writeLn ('');
    write ('diga el unos de los lado del cuadrado:');
    readln (a);
    a:= a * a;
    writeLn ('');
    writeln (a, ' cm es el area del cuadrado');
end.
