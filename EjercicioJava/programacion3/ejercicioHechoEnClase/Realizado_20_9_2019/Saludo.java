package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gregory
 */
public class Saludo {
    public void saludar(){
        System.out.println("Hola ¿que tal?");
    }
    
    public void saludar(int veces)
    {
        for(int x = 0; x < veces; x++)
            System.out.println("Hola ¿que tal?");
    }
    
    public void saludar(String nombre)
    {
        System.out.println("Hola " + nombre + " ¿que tal?");
    }
}
