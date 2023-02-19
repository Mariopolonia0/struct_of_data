
Program sin_titulo;

Uses crt;

Var 
  e: integer;
Begin
  WriteLn('digame su edad bestia');
  ReadLn(e);
  If e>17 Then
    Begin
      WriteLn('');
      WriteLn('es mayor ');
      WriteLn('');
      WriteLn('la bestia esta');
    End
  Else
    Begin
      WriteLn('');
      WriteLn('es menor');
      WriteLn('');
      WriteLn('la bestia esta');
    End;
  readkey
End.
