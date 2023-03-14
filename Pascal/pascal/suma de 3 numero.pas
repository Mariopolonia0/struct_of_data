Program esMayor;

Var
	n1: Real;
	n2: Real;
	n3: Real;
	r: Real;
Begin
	WriteLn('diga numero 1');
	ReadLn(n1);
	WriteLn('diga numero 2');
	ReadLn(n2);
	WriteLn('diga numero 3');
	ReadLn(n3);
	r := n1+n2;
	If r=n3 Then Begin
		WriteLn('numero 1 y numero 2 = a numero 3');
	End
	Else Begin
		r := n3+n2;
		If r=n1 Then Begin
			WriteLn('numero 2 y numero 3 = numero1');
		End
		Else Begin
			r := n1+n3;
			If r=n2 Then Begin
				WriteLn('numero 1 y numero 3 es la suma de numero 2');
			End
			Else Begin
				WriteLn('no hay suma de ningun numero');
			End;
		End;
	End;
End.

