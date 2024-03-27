package EjercicioJava.tareaDomesticas.ui;

import javax.swing.*;
import java.awt.*;

public class registroTareaDometicas extends JFrame {
    public registroTareaDometicas() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("Registro Tarea Domestica");
        this.setLayout(null);
        this.setBounds(500, 200, 450, 450);
        this.setContentPane(panelPricipal());
        this.setVisible(true);
    }

    private JPanel panelPricipal() {
        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel label = texto("Book ID ");
        label.setBounds(25, 10, 100, 30);
        panel.add(label);

        /*bookIdTextField = textField();
        bookIdTextField.setBounds(90, 10, 190, 30);
        panel.add(bookIdTextField);

        nombreTextField = textField();
        panel.add(panel("Nombre ", 25, 60, nombreTextField, new BorderLayout()));

        NombreAutorTextField = textField();
        panel.add(panel("Nombre Autor ", 25, 110, NombreAutorTextField, new BorderLayout()));

        EdiccionTextField = textField();
        panel.add(panel("Ediccion ", 25, 160, EdiccionTextField, new BorderLayout()));

        precioTextField = textField();
        panel.add(panel("Precio ", 25, 210, precioTextField, new BorderLayout()));

        panelButton();
        panel.add(guardar);
        panel.add(buscar);
        panel.add(nuevo);
        panel.add(eliminar);*/
        return panel;
    }

    private JLabel texto(String _texto) {
        JLabel texto = new JLabel(_texto);
        texto.setForeground(Color.BLACK);
        texto.setFont(new Font("arial", 1, 16));
        return texto;
    }
}
