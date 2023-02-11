package EjercicioJava.programacion3.tarea1;

import java.io.*;

public class ejer4 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            Float radio, altura;
            Double volumen, Abase, Ala, Atotal;
            System.out.println("\n\n\t\tEste programa calcula el área y volumen de un cilindro");
            System.out.print("\t\tDigite El Radio :");
            radio = Float.parseFloat(br.readLine());
            System.out.print("\t\tDigite La Altura:");
            altura = Float.parseFloat(br.readLine());
            Abase = 3.14 * (Math.pow(radio, 2));
            System.out.println("\t\t\tArea Base:" + Abase);
            Ala = 2 * 3.14 * (radio * altura);
            System.out.println("\t\t\tArea Lateral:" + Ala);
            Atotal = Abase + Ala;
            System.out.println("\t\t\tArea Total:" + Atotal);
            volumen = 3.14 * (Math.pow(radio, 2)) * altura;
            System.out.println("\t\t\tVolumen:" + Atotal);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
