package EjercicioJava.programacion3.ejercicioHechoEnClase;

public class Triangulo extends Rectangulo {
    public Triangulo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float getArea() {
        return super.getArea() / 2;
    }
}