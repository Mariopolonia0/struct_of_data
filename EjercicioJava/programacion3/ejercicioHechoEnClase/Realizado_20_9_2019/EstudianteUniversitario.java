package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gregory
 */
public class EstudianteUniversitario extends Estudiante {
    private String carrera;

    public EstudianteUniversitario() {
    }

    public EstudianteUniversitario(int matricula, String nombre, String apellido, char sexo) {
        super(matricula, nombre, apellido, sexo);
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    
}
