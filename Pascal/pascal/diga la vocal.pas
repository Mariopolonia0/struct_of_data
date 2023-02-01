Program sin_titulo;

Var
	v: String;
Begin
	ReadLn(v);
	If v='a' Or v='A' Then Begin
		WriteLn('es vocal');
	End
	Else Begin
		If v='e' Or v='E' Then Begin
			WriteLn('es vocal');
		End
		Else Begin
			If v='i' Or v='I' Then Begin
				WriteLn('es vocal');
			End
			Else Begin
				WriteLn('no es vocal');
			End;
		End;
	End;
End.

