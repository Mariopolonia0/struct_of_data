import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.*;

public class AppEjercicio1 {
    private static JButton jButtonEjercicio1;
    private static JButton jButtonEjercicio2;
    private static JButton jButtonEjercicio3;
    private static JButton jButtonEjercicio4;
    private static JButton jButtonEjercicio5;
    private static JButton jButtonEjercicio6;
    private static JButton jButtonEjercicio7;

    public static void main(String[] args) {
        new ViewEjercicio1_1();
        // JFrame jFrame = new JFrame();
        // jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jFrame.setTitle("Registro Book");
        // jFrame.setLayout(null);
        // jFrame.setBounds(300, 300, 600, 500);
        // jFrame.setContentPane(DibujarPanel());
        // jFrame.setVisible(true);
    }

    private static JPanel DibujarPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(null);
        dibujarButton();
        panel.add(jButtonEjercicio1);
        panel.add(jButtonEjercicio2);
        panel.add(jButtonEjercicio3);
        panel.add(jButtonEjercicio4);
        panel.add(jButtonEjercicio5);
        panel.add(jButtonEjercicio6);
        panel.setBounds(20, 20, 310, 30);
        return panel;
    }

    private static void dibujarButton() {
        jButtonEjercicio1 = new JButton("Ejercicio 1");
        jButtonEjercicio1.setBounds(50, 100, 100, 30);
        jButtonEjercicio1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio1.setVisible(true);

        jButtonEjercicio2 = new JButton("Ejercicio 2");
        jButtonEjercicio2.setBounds(50, 150, 100, 30);
        jButtonEjercicio2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio2.setVisible(true);

        jButtonEjercicio3 = new JButton("Ejercicio 3");
        jButtonEjercicio3.setBounds(50, 200, 100, 30);
        jButtonEjercicio3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio3.setVisible(true);

        jButtonEjercicio4 = new JButton("Ejercicio 4");
        jButtonEjercicio4.setBounds(200, 100, 100, 30);
        jButtonEjercicio4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio4.setVisible(true);

        jButtonEjercicio5 = new JButton("Ejercicio 5");
        jButtonEjercicio5.setBounds(200, 150, 100, 30);
        jButtonEjercicio5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio5.setVisible(true);

        jButtonEjercicio6 = new JButton("Ejercicio 6");
        jButtonEjercicio6.setBounds(200, 200, 100, 30);
        jButtonEjercicio6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio6.setVisible(true);

        jButtonEjercicio7 = new JButton("Ejercicio 7");
        jButtonEjercicio7.setBounds(50, 100, 100, 30);
        jButtonEjercicio7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                new ViewEjercicio1_1();
            }
        });
        jButtonEjercicio7.setVisible(true);
    }
}
