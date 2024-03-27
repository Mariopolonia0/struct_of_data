package EjercicioJava.tareaDomesticas.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class listTareaDometicas extends JFrame {
    JScrollPane scrollPane = new JScrollPane();

    private JButton agregar;
    private JButton eliminar;

    public listTareaDometicas() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Lista De Tarea Domesticas");
        this.setLayout(null);
        this.setBounds(600, 200, 480, 500);
        this.setContentPane(PanelPrincipal());
        this.setVisible(true);
    }


    private JPanel PanelPrincipal() {
        JPanel panel = new JPanel();
        ConfigurarButton();
       // llenarLista();
        panel.setLayout(null);
        panel.add(scrollPane);
        panel.add(agregar);
        panel.add(eliminar);
        return panel;
    }

    private void ConfigurarButton() {
        agregar = new JButton("");
        ImageIcon icono = new ImageIcon("EjercicioJava/tareaDomesticas/ui/resources/AgregarIcono.png");
        agregar.setIcon(new ImageIcon(icono.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        agregar.setBounds(350, 10, 75, 30);
        agregar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                OpcionAgregar();
            }
        });

        eliminar = new JButton("");
        icono = new ImageIcon("EjercicioJava/tareaDomesticas/ui/resources/EliminarIcono.png");
        eliminar.setIcon(new ImageIcon(icono.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        eliminar.setBounds(350, 50, 75, 30);
        eliminar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                //OpcionEliminar();
            }
        });
    }
    private void OpcionAgregar() {
        new registroTareaDometicas();
    }
}
