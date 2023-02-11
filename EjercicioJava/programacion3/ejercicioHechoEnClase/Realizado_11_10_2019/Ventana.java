import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Ventana extends JFrame{
	private JButton btnNuevo;
	private JButton btnEditar;
	private JButton btnGuardar;
	private JButton btnCancelar;
	private JButton btnImprimir;
	private JButton btnSalir;
	private JPanel panelBotones;

	public Ventana(){
		inicializar();
	}

	private void inicializar(){
		setSize(500, 600);
		setLocationRelativeTo(null);
		setTitle("Eventos");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		btnNuevo = new JButton("Nuevo");
		btnEditar = new JButton("Editar");
		btnGuardar = new JButton("Guardar");
		btnCancelar = new JButton("Cancelar");
		btnImprimir = new JButton("Imprimir");
		btnSalir = new JButton("Salir");
		panelBotones = new JPanel();
		add(panelBotones, "North");
		panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT));
		panelBotones.add(btnNuevo);
		panelBotones.add(btnEditar);
		panelBotones.add(btnGuardar);
		panelBotones.add(btnCancelar);
		panelBotones.add(btnSalir);
		
		btnNuevo.addActionListener(new BtnClick());
		btnEditar.addActionListener(new BtnClick());
		btnGuardar.addActionListener(new BtnClick());
		btnCancelar.addActionListener(new BtnClick());


		btnSalir.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		setVisible(true);
	}

	class BtnClick implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == btnNuevo){
				JOptionPane.showMessageDialog(null, "fue nuevo");	
			}else if(e.getSource() == btnEditar){
				JOptionPane.showMessageDialog(null, "fue editar");	
			}
		}
	}

	public static void main(String[] args) {
		Ventana v = new Ventana();
	}
}