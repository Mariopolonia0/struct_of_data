import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ViewEjercicio1_1 extends JFrame {

    private JTextField unoTextField;
    private JTextField dosTextField;
    private JButton jButtonCalcular;
    private JButton jButtonLimpiar;
    private JPanel panel;
    private JLabel resultadoLabel;
    private JLabel resultadoCero;
    private JLabel resultadoSucesor;
    private JLabel resultadoIgual;
    private JLabel resultadoSuma;
    private JLabel resultadoAntecesor;
    private JLabel resultadoDiferente;
    private JLabel resultadoMenor;

    public ViewEjercicio1_1() {
        this.setTitle("Ejercicio 1 de 1");
        this.setLayout(null);
        this.setBounds(300, 300, 600, 500);
        this.setContentPane(GetPanel());
        this.setVisible(true);
    }

    private JPanel GetPanel() {
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(texto("TAD natural para representar a los números naturales", 50, 15));
        panel.add(texto("Numero 1", 20, 53));
        unoTextField = textField(100, 55);
        panel.add(unoTextField);
        panel.add(texto("Numero 2", 210, 53));
        dosTextField = textField(290, 55);
        dibujarButton();
        panel.add(jButtonCalcular);
        panel.add(jButtonLimpiar);
        panel.add(dosTextField);
        agregarResultado();
        panel.setBounds(20, 20, 600, 30);
        return panel;
    }

    private void agregarResultado() {
        resultadoLabel = texto("Resultado ", 100, 100);
        resultadoLabel.setVisible(false);
        panel.add(resultadoLabel);

        resultadoCero = texto("Cero ", 100, 120);
        resultadoCero.setVisible(false);
        panel.add(resultadoCero);

        resultadoSucesor = texto("Sucesor ", 100, 140);
        resultadoSucesor.setVisible(false);
        panel.add(resultadoSucesor);

        resultadoIgual = texto("Igual ", 100, 160);
        resultadoIgual.setVisible(false);
        panel.add(resultadoIgual);

        resultadoSuma = texto("Suma ", 100, 180);
        resultadoSuma.setVisible(false);
        panel.add(resultadoSuma);

        resultadoAntecesor = texto("Antecesor ", 100, 200);
        resultadoAntecesor.setVisible(false);
        panel.add(resultadoAntecesor);

        resultadoDiferente = texto("Diferente ", 100, 220);
        resultadoDiferente.setVisible(false);
        panel.add(resultadoDiferente);

        resultadoMenor = texto("Menor ", 100, 240);
        resultadoMenor.setVisible(false);
        panel.add(resultadoMenor);

    }

    private void dibujarButton() {
        jButtonCalcular = new JButton("");
        ImageIcon icono = new ImageIcon("Resources/CalcularIcon.png");
        jButtonCalcular.setIcon(new ImageIcon(icono.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        jButtonCalcular.setBounds(400, 52, 50, 30);
        jButtonCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                PintarResultado();
            }
        });
        jButtonCalcular.setVisible(true);

        jButtonLimpiar = new JButton("");
        icono = new ImageIcon("Resources/NuevoIcono.png");
        jButtonLimpiar.setIcon(new ImageIcon(icono.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH)));
        jButtonLimpiar.setBounds(460, 52, 50, 30);
        jButtonLimpiar.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                LimpiarResultado();
            }
        });
        jButtonLimpiar.setVisible(true);
    }

    private void LimpiarResultado() {
        resultadoLabel.setVisible(false);
        resultadoCero.setVisible(false);
        resultadoSucesor.setVisible(false);
        resultadoIgual.setVisible(false);
        resultadoSuma.setVisible(false);
        resultadoAntecesor.setVisible(false);
        resultadoDiferente.setVisible(false);
        resultadoMenor.setVisible(false);
        unoTextField.setText("");
        dosTextField.setText("");
    }

    private void PintarResultado() {

        int numeroUno = 0;
        int numeroDos = 0;
        TapNumero tapNumero = new TapNumero();

        try {
            numeroUno = Integer.parseInt(unoTextField.getText());
            numeroDos = Integer.parseInt(dosTextField.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this, "Tiene que digital un numero", "Info", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        tapNumero.setNumeroUno(numeroUno);
        tapNumero.setNumeroDos(numeroDos);
        
        resultadoCero.setVisible(true);
        resultadoCero.setText("Es Cero : " + tapNumero.EsCero());

        resultadoSucesor.setVisible(true);
        resultadoSucesor.setText("Sucesor : " + tapNumero.Sucesor());

        resultadoIgual.setVisible(true);
        resultadoIgual.setText("Igual : " + tapNumero.Igual());

        resultadoSuma.setVisible(true);
        resultadoSuma.setText("Suma: " + tapNumero.Suma());

        resultadoAntecesor.setVisible(true);
        resultadoAntecesor.setText("Antecesor: " + tapNumero.Antecesor());

        resultadoDiferente.setVisible(true);
        resultadoDiferente.setText("Diferente: " + tapNumero.Diferecia());
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
