

Program sin_titulo;
          uses CRT;
Var
	a: integer;
	montoaf: integer;
	montoap: integer;
Begin
	WriteLn('diga numero la factura');
	ReadLn(montoaf);
	WriteLn('diga el monto a pagar');
	ReadLn(montoap);
	If montoap>=montoaf Then Begin
		a := montoap-montoaf;
		WriteLn('tiene debuelta y es ',a);
	End
	Else Begin
		a := montoaf-montoap;
		WriteLn('no tiene debuelta y faltan ',a);
	End;
         readkey
End.

