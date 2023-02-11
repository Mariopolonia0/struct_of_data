package EjercicioJava.programacion3.ejercicioHechoEnClase;

public class Cuadrado {
    private float lado;

    public Cuadrado() {
        lado = 0;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public float getPerimetro() {
        return 4 * lado;
    }

    public void dibujar() {
        for (int x = 0; x < lado; x++) {
            for (int y = 0; y < lado; y++)
                System.out.print("*");
            System.out.println();
        }
    }
}