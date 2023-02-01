
Program sin_titulo;
              uses CRT;
Var
	v: Real;
Begin
      WriteLn('diga la velocidad');
	ReadLn(v);
	v := v*1000/3600;
	WriteLn('esa es la velocidad en k/h');
	WriteLn(v);
           readkey
End.

