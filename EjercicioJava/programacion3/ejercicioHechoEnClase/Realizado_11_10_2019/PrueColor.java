import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PrueColor extends Frame{

public static void main(String[] args){
	Mar m= new Mar();
	m.setVisible(true);
}
}

class Mar extends Frame{
	public Mar(){
		addWindowListener(new Cierre());
		setTitle("Pueba de Color");
		setSize(500,500);
		setLocationRelativeTo(null);
		Lamina lam= new Lamina();
		add(lam);
	}
	private class Cierre extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	}

}
class Lamina extends Panel{
	JButton boton;
	public Lamina(){
		boton =new JButton("Azul");

		boton.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				setBackground(Color.BLUE);
			}
		});
		add(boton);
	}
}