package EjercicioJava.programacion3;

import java.io.*;

public class ejer3 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        try {
            Float b, p;
            Double r;
            System.out.print("\n\n\t\tEste programa calcula la potecia");
            System.out.print("\n\n\t\t\tDigite La Base     :");
            b = Float.parseFloat(br.readLine());
            System.out.print("\n\t\t\tDigite El Exponente:");
            p = Float.parseFloat(br.readLine());
            r = Math.pow(b, p);
            System.out.print("\n\t\t\testa es la potencia :" + r + "\n\n");


        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
