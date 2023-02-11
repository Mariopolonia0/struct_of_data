package EjercicioJava.programacion3;

import java.io.*;

public class ejer5 {
    public static void main(String[] args) {
        ejer2 a = new ejer2();
        a.getImprimir();

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            float lado;
            double Perimetro, Superficie;
            System.out.println("\n\n\t\tEste Programa Busca El Perimetro Y La Superficie De Un Cuadrado");
            System.out.print("\t\tDigite El Lado :");
            lado = Float.parseFloat(br.readLine());
            Superficie = (Math.pow(lado, 2));
            Perimetro = (lado + lado + lado + lado);
            System.out.println("\t\t\tArea Perimetro:" + Perimetro);
            System.out.println("\t\t\tArea Superficie:" + Superficie);

        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
