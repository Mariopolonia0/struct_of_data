package EjercicioJava.programacion3.tarea1;

import java.io.*;

public class ejer2 {
    public void getImprimir() {
        float nu;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            System.out.print("\tdigite un numero para calcular su cuadrado:");
            nu = Float.parseFloat(br.readLine());
            nu = nu * nu;
            System.out.print("\tel cuandrado encotrado es :" + nu);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error");
        }

    }

}
