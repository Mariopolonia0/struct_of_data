package EjercicioJava.proyecto_ayuda_al_moreno;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

//en esta clase se guardan los datos en personal.dat
class OpcGuardarEstudiante {

    OpcGuardarEstudiante() {
    }

    public boolean guardar(Estudiante estudiantes) {
        try {
            ArrayList<Estudiante> listaestudiante = new ArrayList<Estudiante>();

            File file = new File("estudiante.dat");

            if (file.exists()) {

                //leo la lista que esta guardada en el archivo
                ObjectInputStream cargarp = new ObjectInputStream(new FileInputStream("estudiante.dat"));
                listaestudiante = (ArrayList<Estudiante>) cargarp.readObject();
                cargarp.close();

                //agrego el nuevo objecto a la lista
                listaestudiante.add(estudiantes);

                //guardo la lista en el archivo
                ObjectOutputStream guardarp = new ObjectOutputStream(new FileOutputStream("estudiante.dat"));
                guardarp.writeObject(listaestudiante);
                guardarp.close();
            } else {
                listaestudiante.add(estudiantes);
                ObjectOutputStream guardarp = new ObjectOutputStream(new FileOutputStream("estudiante.dat"));
                guardarp.writeObject(listaestudiante);
                guardarp.close();
            }

        } catch (Exception e) {
            System.out.print("Error:" + e);
            return false;
        }
        return true;
    }
}
