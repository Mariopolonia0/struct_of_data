Program sin_titulo;
         uses crt;
Var
	nu: integer;
	total: integer;
	v: integer;
     lis:integer;
Begin
    lis :=0;
	v := 0;
	Repeat
       lis:= lis+1;
       writeln ('diga numero ',lis);
		ReadLn(nu);
		total := total+nu;
		v := v+1;
	Until v=10;      writeln ('');
              writeln ('precione caulquier tecla para teminar ');
            readkey

End.


