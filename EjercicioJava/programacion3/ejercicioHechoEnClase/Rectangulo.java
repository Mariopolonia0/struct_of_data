package EjercicioJava.programacion3.ejercicioHechoEnClase;

public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public float getArea() {
        return base * altura;
    }

}
