
Program sin_titulo;

Uses CRT;

Var 
  sexo: String;

Begin
  WriteLn('digite su sexo');
  ReadLn(sexo);
  If sexo='masculino'  Then
    Begin
      WriteLn('usted es hombre');
    End
  Else
    Begin
      If sexo='Masculino'  Then
        Begin
          WriteLn('usted es hombre');
        End
      Else
        Begin
          If sexo='MASCULINO'  Then
            Begin
              WriteLn('usted es hombre');
            End
          Else
            WriteLn('usted es hembra');
        End;
    End;

  READKEY
End.
