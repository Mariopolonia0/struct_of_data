package EjercicioJava.ejercicio5_13;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

//Se pretende leer todos los empleados de una empresa
//situados en un archivo EMPRESA— y a la terminación
//de la lectura del archivo se debe visualizar
//un mensaje «existen trabajadores mayores de 65
//años en un número de ...» y el número de trabajadores mayores de 65 años.
public class Ejercicio5_13 {
    private final JFrame jFrame = new JFrame();
    private JLabel totalEmpleadoJLabel;
    private JLabel totalMayoresJLabel;
    private int totalMayores = 0;
    private int totalEmpleado = 0;
    private DefaultTableModel model;
    private JButton jButtonAgregar;
    private JTextField jTextFieldNombre;
    private JTextField jTextFieldEdad;

    public Ejercicio5_13() {
        PintarVentada();
    }

    public static void main(String[] args) {
        new Ejercicio5_13();
    }

    private void PintarVentada() {
        jFrame.setTitle("Lista De Empleados");
        jFrame.setLayout(null);
        jFrame.setBounds(300, 300, 600, 500);
        jFrame.add(texto("Nombre:", 10, 10));
        jTextFieldNombre = textField(80, 13);
        jFrame.add(jTextFieldNombre);
        jFrame.add(texto("Edad:", 200, 10));
        jTextFieldEdad = textField(250, 13);
        jFrame.add(jTextFieldEdad);
        AgregarButton();
        PintarLista();
        jFrame.add(PanelResultado());
        jFrame.add(jButtonAgregar);
        jFrame.setVisible(true);
    }

    private JPanel PanelResultado() {
        JPanel jPanel = new JPanel();
        Border raisedbevel = BorderFactory.createRaisedBevelBorder();
        Border loweredbevel = BorderFactory.createLoweredBevelBorder();
        Border redline = BorderFactory.createCompoundBorder(
                raisedbevel, loweredbevel);
        jPanel.setBorder(redline);
        jPanel.setBounds(250, 50, 320, 400);
        jPanel.add(texto("Total de Empleado:", 10, 10));
        totalEmpleadoJLabel = texto("0", 160, 10);
        jPanel.add(totalEmpleadoJLabel);
        jPanel.add(texto("Total de Empleado Mayores a 65:", 10, 40));
        totalMayoresJLabel = texto("0", 265, 40);
        jPanel.add(totalMayoresJLabel);
        jPanel.setBackground(Color.orange);
        jPanel.setVisible(true);
        jPanel.setLayout(null);
        return jPanel;
    }

    private void PintarLista() {
        JTable table = new JTable();
        model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Edad");
        table.setModel(model);
        JScrollPane scrollpane = new JScrollPane();
        scrollpane.setBounds(10, 50, 230, 400);
        scrollpane.setViewportView(table);
        jFrame.add(scrollpane);
    }

    private void AgregarButton() {
        jButtonAgregar = new JButton("");
        ImageIcon icono = new ImageIcon("Resources/AgregarIcon.png");
        jButtonAgregar.setIcon(new ImageIcon(icono.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        jButtonAgregar.setBounds(360, 10, 50, 30);
        jButtonAgregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                AgregarDato();
            }
        });
        jButtonAgregar.setVisible(true);
    }

    private void AgregarDato() {
        if (!Validar()) {
            return;
        }

        PintarAgregado();

        model.addRow(new String[]{
                jTextFieldNombre.getText(),
                jTextFieldEdad.getText()
        });

        jTextFieldNombre.setText("");
        jTextFieldEdad.setText("");
        jTextFieldNombre.requestFocus();
    }

    private void PintarAgregado() {
        int edad = Integer.parseInt(jTextFieldEdad.getText());

        if (edad > 65)
            totalMayores++;
        totalEmpleado++;

        totalEmpleadoJLabel.setText(String.valueOf(totalEmpleado));
        totalMayoresJLabel.setText(String.valueOf(totalMayores));
    }

    private boolean Validar() {
        if (jTextFieldNombre.getText().length() < 3) {
            Mensajes("El Nombre Esta Vacío");
            return false;
        }

        try {
            Integer.parseInt(jTextFieldEdad.getText());
        } catch (Exception exception) {
            Mensajes("La edad tiene que se un numero entero");
            return false;
        }
        return true;
    }

    private void Mensajes(String mensaje) {
        JLabel pintarMensaje = new JLabel(mensaje);
        pintarMensaje.setFont(new Font("arial", 1, 20));
        pintarMensaje.setForeground(Color.BLUE);

        JOptionPane.showConfirmDialog(
                jFrame,
                pintarMensaje,
                "Error",
                -1,
                0
        );
    }

    private JLabel texto(String _texto, int x, int y) {
        JLabel texto = new JLabel(_texto);
        texto.setForeground(Color.BLACK);
        texto.setBounds(x, y, 450, 30);
        texto.setFont(new Font("arial", 1, 16));
        return texto;
    }

    private JTextField textField(int x, int y) {
        JTextField jTextField = new JTextField();
        jTextField.setForeground(Color.BLACK);
        jTextField.setFont(new Font("arial", 1, 16));
        jTextField.setBounds(x, y, 100, 25);
        return jTextField;
    }
}