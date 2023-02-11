package EjercicioJava.proyecto_ayuda_al_moreno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class ListaEmpleado extends JFrame {

    private JTable table;
    private JScrollPane scrollpane;
    JButton opcAgregarEmpleado;
    ArrayList<Empleado> listaempleado;
    DefaultTableModel model;

    ListaEmpleado() {
        table = new JTable();
        model = new DefaultTableModel();

        model.addColumn("Cedula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Direccion");
        model.addColumn("Telefono");
        model.addColumn("Fecha Entrada");
        model.addColumn("Salario");

        optenerRegistro();
        table.setModel(model);

        table.setBackground(Color.cyan);
        scrollpane = new JScrollPane();
        scrollpane.setBounds(10, 10, 700, 500);
        scrollpane.setViewportView(table);
        add(scrollpane);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(750, 600);
        setTitle("lista Empleado");
        setLocation(600, 200);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        opcAgregarEmpleado.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                RegistroEmpleado buscar = new RegistroEmpleado();
            }
        });
    }


    private void optenerRegistro() {
        try {
            ObjectInputStream cargarp = new ObjectInputStream(new FileInputStream("empleado.dat"));
            listaempleado = (ArrayList<Empleado>) cargarp.readObject();
            cargarp.close();
            llenarlista();
        } catch (Exception e) {
            System.out.print("Eroor:" + e);
        }
    }

    private void llenarlista() {
        for (int i = 0; i < listaempleado.size(); i++) {
            model.addRow(new String[]{
                    listaempleado.get(i).getCedula(),
                    listaempleado.get(i).getNombre(),
                    listaempleado.get(i).getApellido(),
                    listaempleado.get(i).getDireccion(),
                    listaempleado.get(i).getTelefono(),
                    listaempleado.get(i).getFechaEntrada(),
                    listaempleado.get(i).getSalario()
            });
        }
    }
}