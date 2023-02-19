
Program sin_titulo;

Uses crt;

Var 
  adivinar: integer;
  diga: integer;
Begin
  adivinar := '*';

  WriteLn('DIGA EL NUMERO A ADIVINAR');
  ReadLn(adivinar);
  WriteLn('DIGA EL NUMERO');
  ReadLn(diga);
  If (diga)=(adivinar) Then
    Begin
      WriteLn('ES EL NUMERO A ADIVINAR');
      WriteLn('USTED GANO');
    End
  Else
    Begin
      WriteLn('NO ES EL NUMERO A ADIVINAR');
      WriteLn('DIGA EL NUMERO');
      ReadLn(diga);
      If (diga)=(adivinar) Then
        Begin
          WriteLn('ESE ES EL NEMERO A ADIVINAR');
          WriteLn('USTED GANO');
        End
      Else
        Begin
          WriteLn('NO ES EL NUMERO A ADIVINAR ');
          WriteLn('DIGA EL NUMERO');
          ReadLn(diga);
          If (diga)=(adivinar) Then
            Begin
              WriteLn('ESE ES EL NEMERO A ADIVINAR');
              WriteLn('USTED GANO');
            End
          Else
            Begin
              WriteLn('NO ES EL NUMERO A ADIVINAR ');
              WriteLn('USTED PERDIO BESTIA ');
            End;
        End;
    End;
  readkey

End.
