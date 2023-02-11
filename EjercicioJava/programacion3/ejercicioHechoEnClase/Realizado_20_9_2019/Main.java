package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;

public class Main {
    public static void main(String[] args)
    {
        Persona e1 = new EstudianteUniversitario();
        e1.setNombre("Juan");
        e1.setApellido("Perez");
        Persona e2 = new EstudianteEscolar();
        e2.setNombre("Maria");
        e2.setApellido("Perez");
        
        System.out.println(e1.getNombreCompleto());
        System.out.println(e2.getNombreCompleto());
    }
}
