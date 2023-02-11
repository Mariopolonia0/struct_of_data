package EjercicioJava.programacion3;

import java.io.*;

public class ejer9 {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            double cate1, cate2, hipotenusa;
            System.out.println("\n\n\t\tEste Programa Busca Hipotenusa De Un Triangulo Rectangulo ");
            System.out.print("\t\tDigite El Cateto 1:");
            cate1 = Float.parseFloat(br.readLine());
            System.out.print("\t\tDigite El Cateto 2:");
            cate2 = Float.parseFloat(br.readLine());
            cate1 = Math.pow(cate1, 2);
            cate2 = (Math.pow(cate2, 2));
            hipotenusa = cate1 + cate2;
            hipotenusa = Math.sqrt(hipotenusa);
            System.out.println("\t\t\tArea Hipotenusa:" + hipotenusa);
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
