
Program   calcula_circulo;

Uses crt;

Var 
  a: integer;
  q: integer;

Begin
  Repeat
    clrscr;
    textcolor(15) ;
    gotoxy(15,2);
    writeln('=============================================');
    gotoxy(15,3);
    writeln('   este programa le dirael area del circulo  ');
    gotoxy(15,4);
    writeln('=============================================');

    textcolor(blue) ;
    gotoxy(30,7);
    writeln('indrudusca el radio');
    gotoxy(38,9);
    textcolor(15) ;
    write(' = ');
    read (a);
    a := a**2;
    gotoxy(21,9);
    textcolor(14) ;
    gotoxy(30,12);
    writeln('el area del circulo es ');
    textcolor(15) ;
    gotoxy(38,14);
    write(' = ');
    write (3.14*a:0:2) ;
    gotoxy(15,17);
    textcolor(blue) ;
    write('si quiere volver a buscar otra are de otro circulo precione 1');
    textcolor(14);
    gotoxy(15,19);
    write('si quiere salir presiones otro numero 2  =  ');
    read(q);


  Until  2=q;





End.
