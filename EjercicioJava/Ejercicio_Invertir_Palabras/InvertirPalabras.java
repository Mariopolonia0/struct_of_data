package EjercicioJava.Ejercicio_Invertir_Palabras;

public class InvertirPalabras {
    private String result = "";

    public InvertirPalabras(String cadena) {

        for (String palabra : cadena.split(" ")) {
            for (int contador = palabra.length() - 1; contador >= 0; contador--) {
                result += palabra.charAt(contador);
            }
            result += " ";
        }
    }

    public String getResult() {
        return result;
    }

    public static void main(String[] args) {

        System.out.println("Las palabras a invertir son : hola mario");
        InvertirPalabras invertirPalabras = new InvertirPalabras("hola mario");
        System.out.println("El resultado es : " + invertirPalabras.result);
    }
}
