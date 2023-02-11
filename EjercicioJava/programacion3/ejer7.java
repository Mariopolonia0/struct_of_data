package EjercicioJava.programacion3;

import java.io.*;

public class ejer7 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            float lado1, lado2;
            double Perimetro, Superficie;
            System.out.println("\n\n\t\tEste Programa Busca El Perimetro Y La Superficie De Un Rectangulo");
            System.out.print("\t\tDigite El Lado 1:");
            lado1 = Float.parseFloat(br.readLine());
            System.out.print("\t\tDigite El Lado 2:");
            lado2 = Float.parseFloat(br.readLine());
            Perimetro = (2 * lado1) + (2 * lado2);
            Superficie = lado1 * lado2;
            System.out.println("\t\t\tArea Perimetro:" + Perimetro);
            System.out.println("\t\t\tArea Superficie:" + Superficie);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
