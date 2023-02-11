package EjercicioJava.proyecto_ayuda_al_moreno;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RegistroEmpleado extends JFrame {

    private JPanel panel;
    private JLabel bienvenidaLabel;

    private JLabel labelCedula;
    private JTextField cedulaTextField;

    private JLabel labelNombre;
    private JTextField nombreTextField;

    private JLabel labelApellido;
    private JTextField apellidoTextField;

    private JLabel labelDireccion;
    private JTextField direccionTextField;

    private JLabel labelTelefono;
    private JTextField telefonoTextField;

    private JLabel labelFechaEntrada;
    private JTextField fechaEntradaTextField;


    private JLabel labelSalario;
    private JTextField salarioTextField;

    private JButton guardar;


    RegistroEmpleado() {

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(800, 700);
        setTitle("Agregar Empleado");
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

        JLabel nitido = new JLabel("Se guardo el empleado");
        nitido.setFont(new Font("arial", 1, 25));
        nitido.setForeground(Color.BLUE);

        JLabel error = new JLabel("No se guardo el empleado");
        error.setFont(new Font("arial", 1, 25));
        error.setForeground(Color.BLUE);

        OpcGuardarEmpleado guardar = new OpcGuardarEmpleado();

        if (guardar.guardar(llenarempleado()) == true) {
            JOptionPane seguro = new JOptionPane();
            seguro.showConfirmDialog(panel, nitido, "Nitido", 1, 1);
        } else {
            JOptionPane seguro = new JOptionPane();
            seguro.showConfirmDialog(panel, error, "Error", 1, 1);
        }
    }

    private Empleado llenarempleado() {

        Empleado empleado = new Empleado();
        empleado.setCedula(cedulaTextField.getText());
        empleado.setNombre(nombreTextField.getText());
        empleado.setApellido(apellidoTextField.getText());
        empleado.setDireccion(direccionTextField.getText());
        empleado.setTelefono(telefonoTextField.getText());
        empleado.setFechaEntrada(fechaEntradaTextField.getText());
        empleado.setSalario(salarioTextField.getText());

        return empleado;
    }

    public void dibujarpanel() {

        guardar = new JButton("Guardar");
        guardar.setBounds(50, 420, 100, 30);
        guardar.setVisible(true);
        add(guardar);

        panel = new JPanel();
        bienvenidaLabel = new JLabel("Ingrese los datos del empleado", SwingConstants.CENTER);

        bienvenidaLabel.setFont(new Font("arial", 1, 20));
        bienvenidaLabel.setBounds(0, 0, 800, 50);
        bienvenidaLabel.setOpaque(true);

        labelCedula = new JLabel("Cedula");
        cedulaTextField = new JTextField("");

        labelNombre = new JLabel("Nombre");
        nombreTextField = new JTextField("");

        labelApellido = new JLabel("Apellido");
        apellidoTextField = new JTextField("");

        labelDireccion = new JLabel("Direccion");
        direccionTextField = new JTextField("");

        labelTelefono = new JLabel("Telefono");
        telefonoTextField = new JTextField("");

        labelFechaEntrada = new JLabel("Fecha Entrada");
        fechaEntradaTextField = new JTextField("");

        labelSalario = new JLabel("Salario");
        salarioTextField = new JTextField("");

        labelCedula.setForeground(Color.BLACK);
        cedulaTextField.setForeground(Color.BLACK);
        labelCedula.setFont(new Font("arial", 1, 18));
        cedulaTextField.setFont(new Font("arial", 1, 20));
        labelCedula.setBounds(50, 50, 150, 30);
        cedulaTextField.setBounds(150, 55, 150, 23);

        labelNombre.setForeground(Color.BLACK);
        nombreTextField.setForeground(Color.BLACK);
        labelNombre.setFont(new Font("arial", 1, 18));
        nombreTextField.setFont(new Font("arial", 1, 20));
        labelNombre.setBounds(50, 100, 250, 30);
        nombreTextField.setBounds(150, 105, 150, 23);

        labelApellido.setForeground(Color.BLACK);
        apellidoTextField.setForeground(Color.BLACK);
        labelApellido.setFont(new Font("arial", 1, 18));
        apellidoTextField.setFont(new Font("arial", 1, 20));
        labelApellido.setBounds(50, 150, 300, 30);
        apellidoTextField.setBounds(150, 155, 150, 23);


        labelDireccion.setForeground(Color.BLACK);
        direccionTextField.setForeground(Color.BLACK);
        labelDireccion.setFont(new Font("arial", 1, 18));
        direccionTextField.setFont(new Font("arial", 1, 20));
        labelDireccion.setBounds(50, 200, 350, 30);
        direccionTextField.setBounds(150, 205, 250, 23);


        labelTelefono.setForeground(Color.BLACK);
        telefonoTextField.setForeground(Color.BLACK);
        labelTelefono.setFont(new Font("arial", 1, 18));
        telefonoTextField.setFont(new Font("arial", 1, 20));
        labelTelefono.setBounds(50, 250, 400, 30);
        telefonoTextField.setBounds(150, 255, 200, 23);

        labelFechaEntrada.setForeground(Color.BLACK);
        fechaEntradaTextField.setForeground(Color.BLACK);
        labelFechaEntrada.setFont(new Font("arial", 1, 18));
        fechaEntradaTextField.setFont(new Font("arial", 1, 20));
        labelFechaEntrada.setBounds(50, 300, 350, 30);
        fechaEntradaTextField.setBounds(200, 305, 150, 23);

        labelSalario.setForeground(Color.BLACK);
        salarioTextField.setForeground(Color.BLACK);
        labelSalario.setFont(new Font("arial", 1, 18));
        salarioTextField.setFont(new Font("arial", 1, 20));
        labelSalario.setBounds(50, 350, 400, 30);
        salarioTextField.setBounds(150, 355, 150, 23);

        panel.add(labelCedula);
        panel.add(cedulaTextField);

        panel.add(labelNombre);
        panel.add(nombreTextField);

        panel.add(labelApellido);
        panel.add(apellidoTextField);


        panel.add(labelDireccion);
        panel.add(direccionTextField);

        panel.add(labelTelefono);
        panel.add(telefonoTextField);

        panel.add(labelFechaEntrada);
        panel.add(fechaEntradaTextField);

        panel.add(labelSalario);
        panel.add(salarioTextField);

        panel.add(bienvenidaLabel, "North");
        panel.setBounds(10, 10, 790, 690);
        panel.setVisible(true);
        panel.setLayout(null);
        add(panel);
    }

}