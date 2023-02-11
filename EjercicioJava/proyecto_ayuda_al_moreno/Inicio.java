package EjercicioJava.proyecto_ayuda_al_moreno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

public class Inicio extends JFrame {

    JMenuBar barra = new JMenuBar();
    JMenu menuEstudiante;
    JMenu menuEmpleado;
    JMenuItem editarEstudiante;
    JMenuItem listaEstudiante;
    JMenuItem editarEmpleado;
    JMenuItem listaEmpleado;
    JLabel imagenLabel;
    Font formato = new Font("arial", 1, 14);

    Inicio() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 300);
        setTitle("Inicio");
        setLocation(600, 200);
        setLocationRelativeTo(null);
        setLayout(null);

        menuEstudiante = new JMenu("Estudiante", false);
        menuEmpleado = new JMenu("Empleado", false);
        menuEstudiante.setFont(formato);
        menuEmpleado.setBounds(10, 10, 150, 30);
        menuEmpleado.setFont(formato);
        editarEstudiante = new JMenuItem("Editar");
        editarEstudiante.setFont(formato);
        listaEstudiante = new JMenuItem("listar");
        listaEstudiante.setFont(formato);
        editarEmpleado = new JMenuItem("Editar");
        editarEmpleado.setFont(formato);
        listaEmpleado = new JMenuItem("listar");
        listaEmpleado.setFont(formato);

        menuEstudiante.add(editarEstudiante);
        menuEstudiante.add(listaEstudiante);
        menuEmpleado.add(editarEmpleado);
        menuEmpleado.add(listaEmpleado);

        barra.add(menuEstudiante);
        barra.add(menuEmpleado);

        imagenLabel = new JLabel(new ImageIcon("EjercicioJava/proyecto_ayuda_al_moreno/images.jfif"));
        imagenLabel.setBounds(5, 5, 300, 200);
        imagenLabel.setVisible(true);
        add(imagenLabel);

        setJMenuBar(barra);
        //add(barra);

        editarEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroEstudiantes registroEstudiante = new RegistroEstudiantes();
            }
        });

        listaEstudiante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaEstudiante listaEstudiante = new ListaEstudiante();
            }
        });
        setVisible(true);

        editarEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroEmpleado registroEmpleado = new RegistroEmpleado();
            }
        });

        listaEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListaEmpleado listaEmpleado = new ListaEmpleado();
            }
        });

        setVisible(true);
    }
}