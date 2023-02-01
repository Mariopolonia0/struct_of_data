Program sin_titulo;

           uses crt;
Var
	n1: integer;
	n2: integer;
	n3: integer;

	r: Real;
Begin
         WriteLn('nota numero 1');
	ReadLn(n1);
 WriteLn('nota numero 2 ');
	ReadLn(n2);
 WriteLn('nota numero 3');
	ReadLn(n3);
	r := n1+n2+n3;
            WriteLn('');
	WriteLn((r/3):0:6,' es el promedio del estudiamte');
 readkey
End.


