Program sin_titulo;
    uses CRT;

Var
	ma,me,n1,n2,n3,n4 : integer;

              


Begin
	WriteLn('diga numero 1');
	ReadLn(n1);
	WriteLn('diga numero 2');
	ReadLn(n2);
	WriteLn('diga numero 3');
	ReadLn(n3);
	WriteLn('diga numero 4');
    ReadLn(n4);

	If n1>n2 Then Begin
		ma := n1;
		me := n2;
		If n3>ma Then Begin
			ma := n3;
			If n4>ma Then Begin
				ma := n4;
			End
			Else Begin
				If n4>me Then Begin
					me := n4;
				End;
			End;
		End
		Else Begin
			If n3<me Then Begin
				me := n3;
			End;
		End;
	End
	Else Begin
		ma := n2;
		me := n1;
		If n3>ma Then Begin
			ma := n3;
			If n4>ma Then Begin
				ma := n4;
			End
			Else Begin
				If n4<me Then Begin
					me := n4;
				End;
			End;
		End
		Else Begin
			If n3<me Then Begin
				me := n3;
			End;
		End;
	End;
     WriteLn(' ');
	WriteLn(ma,' es el numero mayor');
	WriteLn(' '); WriteLn(' ');
	WriteLn(me,' es numero es el menor');

   readkey

End.

