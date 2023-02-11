package EjercicioJava.programacion3.tarea1;

import java.io.*;

public class ejer6 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        float radio;
        double Superficie;

        try {
            System.out.println("\n\n\t\tEste Programa Busca La Superficie De Un Circulo");
            System.out.print("\t\tDigite El Radio :");
            radio = Float.parseFloat(br.readLine());
            Superficie = 3.14 * (Math.pow(radio, 2));
            System.out.println("\t\t\tArea Superficie:" + Superficie);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
