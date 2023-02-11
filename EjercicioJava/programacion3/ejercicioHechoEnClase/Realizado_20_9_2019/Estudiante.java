package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019.Persona;

/**
 *
 * @author Gregory
 */
public abstract class Estudiante extends Persona {
    private int matricula;

    public Estudiante() {
    }

    public Estudiante(int matricula, String nombre, String apellido, char sexo) {
        super(nombre, apellido, sexo);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
}
