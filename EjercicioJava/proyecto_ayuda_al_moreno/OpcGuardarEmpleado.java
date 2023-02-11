package EjercicioJava.proyecto_ayuda_al_moreno;

import java.io.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

class OpcGuardarEmpleado {

    OpcGuardarEmpleado() {
    }

    public boolean guardar(Empleado empleado) {
        try {
            ArrayList<Empleado> listaempleado = new ArrayList<Empleado>();

            File file = new File("empleado.dat");

            if (file.exists()) {

                //leo la lista que esta guardada en el archivo
                ObjectInputStream cargarp = new ObjectInputStream(new FileInputStream("empleado.dat"));
                listaempleado = (ArrayList<Empleado>) cargarp.readObject();
                cargarp.close();

                //agrego el nuevo objecto a la lista
                listaempleado.add(empleado);

                //guardo la lista en el archivo
                ObjectOutputStream guardarp = new ObjectOutputStream(new FileOutputStream("empleado.dat"));
                guardarp.writeObject(listaempleado);
                guardarp.close();
            } else {
                listaempleado.add(empleado);
                ObjectOutputStream guardarp = new ObjectOutputStream(new FileOutputStream("empleado.dat"));
                guardarp.writeObject(listaempleado);
                guardarp.close();
            }

        } catch (Exception e) {
            System.out.print("Error:" + e);
            return false;
        }
        return true;
    }
}
