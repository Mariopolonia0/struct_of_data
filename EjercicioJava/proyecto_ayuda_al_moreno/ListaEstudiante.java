package EjercicioJava.proyecto_ayuda_al_moreno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;


public class ListaEstudiante extends JFrame {

    private JTable table;
    private JScrollPane scrollpane;
    JButton opcAgregarEstudiante;
    ArrayList<Estudiante> listaestudiante;
    DefaultTableModel model;

    ListaEstudiante() {
        table = new JTable();
        model = new DefaultTableModel();

        model.addColumn("Matricula");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Fecha Naciminto");
        model.addColumn("Carrera");
        optenerRegistro();
        table.setModel(model);

        table.setBackground(Color.cyan);
        scrollpane = new JScrollPane();
        scrollpane.setBounds(10, 10, 500, 600);
        scrollpane.setViewportView(table);
        add(scrollpane);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 700);
        setTitle("lista Estudiante");
        setLocation(600, 200);
        setLocationRelativeTo(null);
        setLayout(null);
        setVisible(true);

        opcAgregarEstudiante.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                RegistroEstudiantes buscar = new RegistroEstudiantes();
            }
        });

    }


    private void optenerRegistro() {
        try {
            ObjectInputStream cargarp = new ObjectInputStream(new FileInputStream("estudiante.dat"));
            listaestudiante = (ArrayList<Estudiante>) cargarp.readObject();
            cargarp.close();
            llenarlista();
        } catch (Exception e) {
            System.out.print("Eroor:" + e);
        }
    }

    private void llenarlista() {
        for (int i = 0; i < listaestudiante.size(); i++) {
            model.addRow(new String[]{
                    listaestudiante.get(i).getMatricula(),
                    listaestudiante.get(i).getNombre(),
                    listaestudiante.get(i).getApellido(),
                    listaestudiante.get(i).getFechaNacimiento(),
                    listaestudiante.get(i).getCarrera()
            });
        }
    }


}