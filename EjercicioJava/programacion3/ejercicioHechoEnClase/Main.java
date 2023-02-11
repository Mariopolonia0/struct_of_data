package EjercicioJava.programacion3.ejercicioHechoEnClase;

public class Main {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado();
        System.out.println("Dibujo del cuadrado");
        c.setLado(5);
        c.dibujar();
        Rectangulo r = new Rectangulo(10f, 20f);
        System.out.println("Area del rectangulo: " + r.getArea());
        Triangulo t = new Triangulo(10f, 20f);
        System.out.println("Area del Triangulo: " + t.getArea());
    }
}