program proyecto_final_pascal;//hecho por mario peña polonia matricula 2016-0037//  //hecho por mario peña polonia matricula 2016-0037////hecho por mario peña polonia matricula 2016-0037//
    uses crt;
 var
    eq1,j1e1,j2e1,j3e1,j4e1,j5e1:string; aa:integer; //mario peña polonia//
    eq2,j1e2,j2e2,j3e2,j4e2,j5e2:string; a:integer;   //hecho por mario peña polonia matricula 2016-0037//

    dosp1,dosp2,dosp3,dosp4,dosp5:integer;tdos:integer;t1,t2,t3,t4,t5,t6:integer;
    trep1,trep2,trep3,trep4,trep5:integer;ttrep:integer;t12,t22,t32,t42,t52,t62:integer;
    lp1,lp2,lp3,lp4,lp5:integer;tlp:integer;                       //hecho por mario peña polonia matricula 2016-0037//

    dosp12,dosp22,dosp32,dosp42,dosp52:integer; tdos2 :integer;
    trep12,trep22,trep32,trep42,trep52:integer; ttrep2:integer;            //hecho por mario peña polonia matricula 2016-0037//
    lp12,lp22,lp32,lp42,lp52 :integer;           tlp2  :integer;
begin    //hecho por mario peña polonia matricula 2016-0037//
         //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,3);textcolor(7); write('digite nombre de equipo 1 = '); readln(eq1);  textcolor(3);
 gotoxy(10,5); write('digite nombre del jugador numero 1 = '); readln(j1e1);
 gotoxy(10,6); write('digite nombre del jugador numero 2 = '); readln(j2e1);       //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,7); write('digite nombre del jugador numero 3 = '); readln(j3e1);
 gotoxy(10,8); write('digite nombre del jugador numero 4 = '); readln(j4e1);
 gotoxy(10,9); write('digite nombre del jugador numero 5 = '); readln(j5e1);  clrscr;
                                                                                                             //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,3);textcolor(7); write('digite nombre de equipo 2 = '); readln(eq2);textcolor(3);
 gotoxy(10,5); write('digite nombre del jugador numero 1 = '); readln(j1e2);                    //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,6); write('digite nombre del jugador numero 2 = '); readln(j2e2);   //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,7); write('digite nombre del jugador numero 3 = '); readln(j3e2);
 gotoxy(10,8); write('digite nombre del jugador numero 4 = '); readln(j4e2);              //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,9); write('digite nombre del jugador numero 5 = '); readln(j5e2);  clrscr;  //hecho por mario peña polonia matricula 2016-0037//
                                                                                       //hecho por mario peña polonia matricula 2016-0037//
  repeat                                                                             //hecho por mario peña polonia matricula 2016-0037//
 clrscr; textcolor(7);                                                              //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,4); write('EQUIPOS'   ); textcolor(7);                                 //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(24,5); write('DOS PUNTOS'); gotoxy(37,5);write('TRES PUNTOS');              //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(51,5); write('TIRO LIBRE'); gotoxy(64,5);write('TOTAL');                   //hecho por mario peña polonia matricula 2016-0037//
                     textcolor(3);                                                  //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,7);  write('EQUIPO 1;',eq1) ;                                            //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,9); textcolor(3); write('1.',j1e1); gotoxy(33,9) ; write(dosp1); gotoxy(47,9) ; write(trep1);  gotoxy(60,9) ; write(lp1);     gotoxy(68,9) ;textcolor(7); write(t1);
 gotoxy(10,10);textcolor(3); write('2.',j2e1); gotoxy(33,10); write(dosp2); gotoxy(47,10) ; write(trep2);  gotoxy(60,10) ; write(lp2);   gotoxy(68,10) ;textcolor(7); write(t2);
 gotoxy(10,11);textcolor(3); write('3.',j3e1); gotoxy(33,11); write(dosp3); gotoxy(47,11) ; write(trep3);  gotoxy(60,11) ; write(lp3);   gotoxy(68,11) ;textcolor(7); write(t3);
 gotoxy(10,12);textcolor(3); write('4.',j4e1); gotoxy(33,12); write(dosp4); gotoxy(47,12) ; write(trep4);  gotoxy(60,12) ; write(lp4);   gotoxy(68,12) ;textcolor(7); write(t4);
 gotoxy(10,13);textcolor(3); write('5.',j5e1); gotoxy(33,13); write(dosp5); gotoxy(47,13) ; write(trep5);  gotoxy(60,13) ; write(lp5);   gotoxy(68,13) ;textcolor(7); write(t5);
                                                                                 //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,15);textcolor(7); write('TOTAL');   gotoxy(33,15) ; write(tdos); gotoxy(47,15) ; write(ttrep);  gotoxy(60,15) ; write(tlp);   gotoxy(68,15) ; write(t6);
           textcolor(3);                                                         //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,17); write('EQUIPO 2;',eq2);                                          //hecho por mario peña polonia matricula 2016-0037//
 gotoxy(10,19);textcolor(3); write('1.',j1e2); gotoxy(33,19) ; write(dosp12); gotoxy(47,19) ; write(trep12);  gotoxy(60,19) ; write(lp12);  gotoxy(68,19) ; textcolor(7);write(t12);
 gotoxy(10,20);textcolor(3); write('2.',j2e2); gotoxy(33,20) ; write(dosp22); gotoxy(47,20) ; write(trep22);  gotoxy(60,20) ; write(lp22);  gotoxy(68,20) ; textcolor(7); write(t22);
 gotoxy(10,21);textcolor(3);write('3.',j3e2); gotoxy(33,21) ; write(dosp32); gotoxy(47,21) ; write(trep32);  gotoxy(60,21) ; write(lp32);  gotoxy(68,21) ; textcolor(7);write(t32);
 gotoxy(10,22);textcolor(3); write('4.',j4e2); gotoxy(33,22) ; write(dosp42); gotoxy(47,22) ; write(trep42);  gotoxy(60,22) ; write(lp42);  gotoxy(68,22) ; textcolor(7);write(t42);
 gotoxy(10,23);textcolor(3); write('5.',j5e2); gotoxy(33,23) ; write(dosp52); gotoxy(47,23) ; write(trep52);  gotoxy(60,23) ; write(lp52);  gotoxy(68,23) ; textcolor(7);write(t52);
 gotoxy(10,25);textcolor(7); write('TOTAL');   gotoxy(33,25) ; write(tdos2);  gotoxy(47,25) ; write(ttrep2);  gotoxy(60,25) ; write(tlp2);  gotoxy(68,25) ; write(t62);
                                                                                       //hecho por mario peña polonia matricula 2016-0037//
             textcolor(14);                                                             //hecho por mario peña polonia matricula 2016-0037//
gotoxy(11,28);writeln('1.-DOS PUNTOS / 2.-TRES PUNTOS / 3.-TIRO LIBRE / 4.-SALIR') ;gotoxy(30,30);textcolor(12); write('SELECCIONA LA OPCION = '); read(aa);
    Case aa Of
  1: begin  textcolor(12); gotoxy(30,32); write('SELECCIONA EL EQUIPO = ') ; read(aa);        //hecho por mario peña polonia matricula 2016-0037//
            Case aa Of
               1: begin gotoxy(23,34);   write('SELECIONA EL # DEL JUGADOR QUE ANOTO = ') ; read(a);
                   Case a Of
                   1:  begin textcolor(3); gotoxy(33,9) ; read(dosp1); end;
                   2:  begin textcolor(3); gotoxy(33,10); read(dosp2); end;        //hecho por mario peña polonia matricula 2016-0037//
                   3:  begin textcolor(3); gotoxy(33,11); read(dosp3); end;
                   4:  begin textcolor(3); gotoxy(33,12); read(dosp4); end;         //hecho por mario peña polonia matricula 2016-0037//
                   5:  begin textcolor(3); gotoxy(33,13); read(dosp5); end;  end; end;
               2: begin gotoxy(20,34);   write('SELECIONA EL # DEL JUGADOR QUE ANOTO = ') ; read(a);
                   Case a Of                                                                                //hecho por mario peña polonia matricula 2016-0037////hecho por mario peña polonia matricula 2016-0037//
                   1:  begin textcolor(3); gotoxy(33,19); read(dosp12); end;
                   2:  begin textcolor(3); gotoxy(33,20); read(dosp22); end;
                   3:  begin textcolor(3); gotoxy(33,21); read(dosp32); end;       //hecho por mario peña polonia matricula 2016-0037//
                   4:  begin textcolor(3); gotoxy(33,22); read(dosp42); end;
                   5:  begin textcolor(3); gotoxy(33,23); read(dosp52); end; end; end; End; end;

   2: begin   gotoxy(30,32); write('SELECCIONA EL EQUIPO = ') ; read(aa);         //hecho por mario peña polonia matricula 2016-0037//
            Case aa Of
               1: begin gotoxy(23,34);   write('SELECIONA EL # DEL JUGADOR QUE ANOTO = ') ; read(a);
                   Case a Of
                   1:  begin textcolor(3); gotoxy(47,9);  read(trep1); end;
                   2:  begin textcolor(3); gotoxy(47,10); read(trep2); end;      //hecho por mario peña polonia matricula 2016-0037//
                   3:  begin textcolor(3); gotoxy(47,11); read(trep3); end;
                   4:  begin textcolor(3); gotoxy(47,12); read(trep4); end;
                   5:  begin textcolor(3); gotoxy(47,13); read(trep5); end;  end; end;
               2: begin gotoxy(20,34);   write('SELECIONA EL # DEL JUGADOR QUE ANOTO = ') ; read(a);
                   Case a Of
                   1:  begin textcolor(3); gotoxy(47,19); read(trep12); end;                                                                  //hecho por mario peña polonia matricula 2016-0037////hecho por mario peña polonia matricula 2016-0037//
                   2:  begin textcolor(3); gotoxy(47,20); read(trep22); end;     //hecho por mario peña polonia matricula 2016-0037//
                   3:  begin textcolor(3); gotoxy(47,21); read(trep32); end;
                   4:  begin textcolor(3); gotoxy(47,22); read(trep42); end;
                   5:  begin textcolor(3); gotoxy(47,23); read(trep52); end; end; end; End; end;

   3: begin   gotoxy(30,32); write('SELECCIONA EL EQUIPO = ') ; read(aa);       //hecho por mario peña polonia matricula 2016-0037//
            Case aa Of
               1: begin gotoxy(23,34);   write('SELECIONA EL # DEL JUGADOR QUE ANOTO = ') ; read(a);
                   Case a Of
                   1:  begin textcolor(3); gotoxy(60,9);  read(lp1); end;
                   2:  begin textcolor(3); gotoxy(60,10); read(lp2); end;
                   3:  begin textcolor(3); gotoxy(60,11); read(lp3); end;        //hecho por mario peña polonia matricula 2016-0037//
                   4:  begin textcolor(3); gotoxy(60,12); read(lp4); end;
                   5:  begin textcolor(3); gotoxy(60,13); read(lp5); end;  end; end;
               2: begin gotoxy(20,34);   write('SELECIONA EL # DEL JUGADOR QUE ANOTO = ') ; read(a);
                   Case a Of
                   1:  begin textcolor(3); gotoxy(60,19); read(lp12); end;      //hecho por mario peña polonia matricula 2016-0037//
                   2:  begin textcolor(3); gotoxy(60,20); read(lp22); end;
                   3:  begin textcolor(3); gotoxy(60,21); read(lp32); end;
                   4:  begin textcolor(3); gotoxy(60,22); read(lp42); end;
                   5:  begin textcolor(3); gotoxy(60,23); read(lp52); end; end; end; End; end;
  end;
  //aqui se hacen los calculos //
   tdos  :=dosp1+dosp2+dosp3+dosp4+dosp5;
   tdos2 :=dosp12+dosp22+dosp32+dosp42+dosp52;
   ttrep :=trep1+trep2+trep3+trep4+trep5;
   ttrep2:=trep12+trep22+trep32+trep42+trep52;             //hecho por mario peña polonia matricula 2016-0037//
   tlp   :=lp1+lp2+lp3+lp4+lp5;
   tlp2  :=lp12+lp22+lp32+lp42+lp52;
                                                   //hecho por mario peña polonia matricula 2016-0037//
    t1:=(dosp1*2)+(trep1*3)+lp1;
    t2:=(dosp2*2)+(trep2*3)+lp2;
    t3:=(dosp3*2)+(trep3*3)+lp3;
    t4:=(dosp4*2)+(trep4*3)+lp4;                 //hecho por mario peña polonia matricula 2016-0037//
    t5:=(dosp5*2)+(trep5*3)+lp5;
    t6:=t1+t2+t3+t4+t5;

    t12:=(dosp12*2)+(trep12*3)+lp12;             //hecho por mario peña polonia matricula 2016-0037//
    t22:=(dosp22*2)+(trep22*3)+lp22;
    t32:=(dosp32*2)+(trep32*3)+lp32;
    t42:=(dosp42*2)+(trep42*3)+lp42;
    t52:=(dosp52*2)+(trep52*3)+lp52;          //hecho por mario peña polonia matricula 2016-0037//
    t62:=t12+t22+t32+t42+t52;
until (aa=4);
   //hecho por mario peña polonia matricula 2016-0037//
  //hecho por mario peña polonia matricula 2016-0037//
  //hecho por mario peña polonia matricula 2016-0037//
end.
