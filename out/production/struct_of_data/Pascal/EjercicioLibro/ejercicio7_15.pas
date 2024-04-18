Program ejercicio7_15;

Var
  i: Integer;
  lista: Array [1..3] Of Real;
  suma: Real;
  sumaimpares: Real;
  sumapares: Real;

Begin
  lista[1] := 10;
  lista[2] := 2;
  lista[3] := 3;

  sumaimpares := 0;
  sumapares := 0;
  suma := 0;

  For i:=1 To 3 Do Begin
    suma := suma+lista[i];

    If lista[i] Mod 2=0 Then Begin
      sumapares := sumapares+lista[i];
    End
    Else Begin
      sumaimpares := sumaimpares+lista[i];
    End;

  End;

  WriteLn('suma de los pares:',sumapares);
  WriteLn('suma de los impares:',sumaimpares);
  WriteLn('suma de todos:',suma);
End.

