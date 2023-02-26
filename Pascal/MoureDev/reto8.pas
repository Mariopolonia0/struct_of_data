program Mariopolonia0;

uses sysutils;

var
  semilla : integer;
  hasta : integer;
  numero : integer;
  numeroDos : integer;
  contador : integer;

begin
  //StrToInt combierte un string a entero
  //El copy puede copiar desde hasta la posicion deseada
  semilla := StrToInt(Copy(TimeToStr(Time), 7, 8));
  hasta := 0;
  numero := 0;
  numeroDos := 0;
  contador := 0;

  write('Cuanto número aleatorio se imprimirán:');
  readLn(hasta);

  while contador < hasta do
  begin
    numero := (5 * semilla + 7) mod 8;
    numeroDos := numero * 8;

    if (numeroDos > 0) and (numeroDos < 100) then
    begin
      writeln(numeroDos);
      contador := contador + 1;
    end;

    semilla := numero;
  end;
end.