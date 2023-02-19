Program area_circulo;
	uses crt ;
Var
	n1: SIN_TIPO;
	n2: SIN_TIPO;
	n3: SIN_TIPO;
	p: Real;
	r: Real;
Begin
	ReadLn(n1);
	ReadLn(n2);
	ReadLn(n3);
	r := n1+n2+n3;
	p := r/3;
	WriteLn(p,' es el promedio del estudiamte');
End.