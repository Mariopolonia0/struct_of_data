package EjercicioJava.programacion3.ejercicioHechoEnClase.Realizado_20_9_2019;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gregory
 */
public class EjemplosPro3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado();
        try{
        c.setLado(-5);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("El area del cuadrado es: " + c.getArea());
        System.out.print("El perimetro del cuadrado es: " + c.getPerimetro());
        
        Saludo s = new Saludo();
        s.saludar();
    }
    
}
