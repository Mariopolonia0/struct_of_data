package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Gregory
 */
public class Cuadrado {
    private float lado;

    public Cuadrado() {
        lado = 1;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) throws Exception {
        if (lado > 0)
            this.lado = lado;
        else {
            throw new Exception("Lado no valido");
        }
    }

    float getArea() {
        return lado * lado;
    }

    float getPerimetro() {
        return lado * 4;
    }
}
