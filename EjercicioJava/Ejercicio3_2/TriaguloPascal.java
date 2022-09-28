package EjercicioJava.Ejercicio3_2;

public class TriaguloPascal {

    public static void main(String[] args) {
        int numeroPiso = 10;
        
        int[] arreglo = new int[1];

        for (int i = 1; i < numeroPiso; i++) {

            int[] pascal = new int[i];
            for (int j = numeroPiso; i <= j; j--) {
                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {
                if (k == 0 || k == (i - 1)) {
                    pascal[k] = 1;
                } else {
                    pascal[k] = arreglo[k] + arreglo[k - 1];
                }
                System.out.print("[" + pascal[k] + "]");
            }
            arreglo = pascal;
            System.out.println(" ");
        }
    }
}