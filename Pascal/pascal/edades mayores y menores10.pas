
Program  edad_mayores_y_edad_menores;

Uses crt;

Var 
  e: integer;
  ma: integer;
  me: integer;
Begin
  ma := 0;
  me := 0;
  WriteLn('1-diga su edad');
  ReadLn(e);
  If e>17 Then
    Begin
      ma := ma+1;
    End
  Else
    Begin
      me := me+1;
    End;
  WriteLn('2-diga su edad');
  ReadLn(e);
  If e>17 Then
    Begin
      ma := ma+1;
    End
  Else
    Begin
      me := me+1;
    End;
  WriteLn('3-diga su edad');
  ReadLn(e);
  If e>17 Then
    Begin
      ma := ma+1;
    End
  Else
    Begin
      me := me+1;
    End;
  WriteLn('4-diga su edad');
  ReadLn(e);
  If e>17 Then
    Begin
      ma := ma+1;
    End
  Else
    Begin
      me := me+1;
    End;
  WriteLn('5-diga su edad');
  readln (e);
  If e>17 Then
    Begin
      ma := ma+1
    End
  Else
    Begin
      me := me+1
    End;
  WriteLn('6-diga su edad');
  readln (e);
  If e>17 Then
    Begin
      ma := ma+1
    End
  Else
    Begin
      me := me+1
    End;
  WriteLn('7-diga su edad');
  readln (e);
  If e>17 Then
    Begin
      ma := ma+1
    End
  Else
    Begin
      me := me+1
    End;
  WriteLn('8-diga su edad');
  readln (e);
  If e>17 Then
    Begin
      ma := ma+1
    End
  Else
    Begin
      me := me+1
    End;
  WriteLn('9-diga su edad');
  readln (e);
  If e>17 Then
    Begin
      ma := ma+1
    End
  Else
    Begin
      me := me+1
    End;
  WriteLn('10-diga su edad');
  readln (e);
  If e>17 Then
    Begin
      ma := ma+1
    End
  Else
    Begin
      me := me+1
    End;
  WriteLn('');
  WriteLn(ma,'  son las edades mayores ');
  WriteLn('');
  WriteLn(me,'  son las edades menores ');
  WriteLn('');
  WriteLn('precione cualquier boton para salir');
  readkey     ;


End.
