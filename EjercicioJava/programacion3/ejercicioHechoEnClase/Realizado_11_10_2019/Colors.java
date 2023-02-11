import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Colors extends JFrame implements ActionListener {
    private JMenuBar barra;
    private JMenu menu1;
    private JMenuItem c1, c2, c3;

    public Colors() {
        setLayout(null);
        barra = new JMenuBar();
        setJMenuBar(barra);

        menu1 = new JMenu("Colores");
        barra.add(menu1);

        c1 = new JMenuItem("Rojo");
        c1.addActionListener(this);
        menu1.add(c1);

        c2 = new JMenuItem("Rosadita");
        c2.addActionListener(this);
        menu1.add(c2);

        c3 = new JMenuItem("Morado Verdoso");
        c3.addActionListener(this);
        menu1.add(c3);

    }

    public void actionPerformed(ActionEvent e) {
        Container fondo = this.getContentPane();

        if (e.getSource() == c1) {
            fondo.setBackground(Color.RED);

        }

        if (e.getSource() == c2) {
            fondo.setBackground(Color.PINK);

        }


        if (e.getSource() == c3) {
            fondo.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        Colors c = new Colors();
        c.setBounds(500, 500, 400, 300);
        c.setVisible(true);

    }
}