
Program sin_titulo;
        USES CRT;
Var
sexo: String;

Begin
	WriteLn('digite su sexo');
	ReadLn(sexo);
	If sexo='masculino'  Then Begin
		WriteLn('usted es hombre');
     End
	Else Begin
         If sexo='Masculino'  Then Begin
		WriteLn('usted es hombre');
            End
           Else Begin
         If sexo='MASCULINO'  Then Begin
		WriteLn('usted es hombre');
             END
              ELSE
		WriteLn('usted es hembra'); END;
	End;

 READKEY
End.

