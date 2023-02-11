package EjercicioJava.proyecto_ayuda_al_moreno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RegistroEstudiantes extends JFrame {

    private JPanel panel;
    private JLabel bienvenidaLabel;
    private JLabel labelMatricula;
    private JTextField matricualTextField;

    private JLabel labelNombre;
    private JTextField nombreTextField;

    private JLabel labelApellido;
    private JTextField apellidoTextField;

    private JLabel labelFechaNacimiento;
    private JTextField fechaNacimientoTextField;

    private JLabel labelCarrera;
    private JTextField carreraTextField;

    private JButton guardar;


    RegistroEstudiantes() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 700);
        setTitle("Agegar Estudiante");
        setLocation(600, 200);
        setLocationRelativeTo(null);
        setBackground(Color.cyan);
        setLayout(null);
        dibujarpanel();

        guardar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                opcionGuardar();
            }
        });

        setVisible(true);

    }

    public void opcionGuardar() {

        JLabel nitido = new JLabel("Se guardo el estudiante");
        nitido.setFont(new Font("arial", 1, 25));
        nitido.setForeground(Color.BLUE);

        JLabel error = new JLabel("No se guardo el estudiante");
        error.setFont(new Font("arial", 1, 25));
        error.setForeground(Color.BLUE);

        OpcGuardarEstudiante guardar = new OpcGuardarEstudiante();

        if (guardar.guardar(llenarestudiante()) == true) {
            JOptionPane seguro = new JOptionPane();
            seguro.showConfirmDialog(panel, nitido, "Nitido", 1, 2);
        } else {
            JOptionPane seguro = new JOptionPane();
            seguro.showConfirmDialog(panel, error, "Error", 1, 2);
        }
    }

    private Estudiante llenarestudiante() {
        Estudiante estudiantes = new Estudiante();
        estudiantes.setMatricula(matricualTextField.getText());
        estudiantes.setNombre(nombreTextField.getText());
        estudiantes.setApellido(apellidoTextField.getText());
        estudiantes.setFechaNacimiento(fechaNacimientoTextField.getText());
        estudiantes.setCarrera(carreraTextField.getText());
        return estudiantes;
    }

    public void dibujarpanel() {

        guardar = new JButton("Guardar");
        guardar.setBounds(50, 400, 100, 30);
        guardar.setVisible(true);
        add(guardar);

        panel = new JPanel();
        bienvenidaLabel = new JLabel("Registre el estudiante", SwingConstants.CENTER);

        bienvenidaLabel.setFont(new Font("arial", 1, 20));
        bienvenidaLabel.setBounds(0, 0, 800, 50);
        bienvenidaLabel.setOpaque(true);

        labelMatricula = new JLabel("Matricula");
        matricualTextField = new JTextField("");

        labelNombre = new JLabel("Nombre");
        nombreTextField = new JTextField("");

        labelApellido = new JLabel("Apellido");
        apellidoTextField = new JTextField("");

        labelFechaNacimiento = new JLabel("Fecha Nacimiento");
        fechaNacimientoTextField = new JTextField("");

        labelCarrera = new JLabel("Carrera");
        carreraTextField = new JTextField("");

        labelMatricula.setForeground(Color.BLACK);
        matricualTextField.setForeground(Color.BLACK);
        labelMatricula.setFont(new Font("arial", 1, 18));
        matricualTextField.setFont(new Font("arial", 1, 20));
        labelMatricula.setBounds(50, 50, 150, 30);
        matricualTextField.setBounds(150, 55, 150, 23);

        labelNombre.setForeground(Color.BLACK);
        nombreTextField.setForeground(Color.BLACK);
        labelNombre.setFont(new Font("arial", 1, 18));
        nombreTextField.setFont(new Font("arial", 1, 20));
        labelNombre.setBounds(50, 100, 150, 30);
        nombreTextField.setBounds(150, 105, 150, 23);

        labelApellido.setForeground(Color.BLACK);
        apellidoTextField.setForeground(Color.BLACK);
        labelApellido.setFont(new Font("arial", 1, 18));
        apellidoTextField.setFont(new Font("arial", 1, 20));
        labelApellido.setBounds(50, 150, 200, 30);
        apellidoTextField.setBounds(150, 155, 150, 23);

        labelFechaNacimiento.setForeground(Color.BLACK);
        fechaNacimientoTextField.setForeground(Color.BLACK);
        labelFechaNacimiento.setFont(new Font("arial", 1, 18));
        fechaNacimientoTextField.setFont(new Font("arial", 1, 20));
        labelFechaNacimiento.setBounds(50, 200, 250, 30);
        fechaNacimientoTextField.setBounds(230, 205, 150, 23);

        labelCarrera.setForeground(Color.BLACK);
        carreraTextField.setForeground(Color.BLACK);
        labelCarrera.setFont(new Font("arial", 1, 18));
        carreraTextField.setFont(new Font("arial", 1, 20));
        labelCarrera.setBounds(50, 250, 150, 30);
        carreraTextField.setBounds(150, 255, 150, 23);

        panel.add(labelMatricula);
        panel.add(matricualTextField);

        panel.add(labelNombre);
        panel.add(nombreTextField);

        panel.add(labelApellido);
        panel.add(apellidoTextField);

        panel.add(labelFechaNacimiento);
        panel.add(fechaNacimientoTextField);

        panel.add(labelCarrera);
        panel.add(carreraTextField);

        panel.add(bienvenidaLabel, "North");
        panel.setBounds(10, 10, 790, 690);
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);
    }

}