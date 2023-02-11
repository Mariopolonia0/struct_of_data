package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gregory
 */
public class EstudianteEscolar extends Estudiante {
    private String curso;

    public EstudianteEscolar() {
    }

    public EstudianteEscolar(int matricula, String nombre, String apellido, char sexo) {
        super(matricula, nombre, apellido, sexo);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    @Override
    public String getNombreCompleto()
    {
        return getApellido() + " " +  getNombre();
    }
}
