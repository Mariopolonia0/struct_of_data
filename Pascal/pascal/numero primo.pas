Program Primo; 
uses crt; 
var 
   cont, num, i : integer; 
begin 
   write('Introduce numero '); 
   readln(num); 
   cont:=0; 
   for i:=1 to num do 
      if num mod i = 0 then 
   cont:=cont+1; 
   if cont = 2 then 
      writeln('Es primo...') 
   else 
      writeln('No es primo...'); 
   readln; 
end. 

