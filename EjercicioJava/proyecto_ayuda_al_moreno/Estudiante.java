package EjercicioJava.proyecto_ayuda_al_moreno;

import java.io.*;

class Estudiante implements Serializable {

    private String matricula;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String carrera;

    Estudiante() {
        matricula = "";
        nombre = "";
        apellido = "";
        fechaNacimiento = "";
        carrera = "";
    }

    void setMatricula(String _matricula) {
        this.matricula = _matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    void setNombre(String a) {
        this.nombre = a;
    }

    String getNombre() {
        return this.nombre;
    }

    void setApellido(String a) {
        this.apellido = a;
    }

    String getApellido() {
        return this.apellido;
    }

    void setFechaNacimiento(String a) {
        this.fechaNacimiento = a;
    }

    String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    void setCarrera(String _carrera) {
        this.carrera = _carrera;
    }

    String getCarrera() {
        return this.carrera;
    }


}