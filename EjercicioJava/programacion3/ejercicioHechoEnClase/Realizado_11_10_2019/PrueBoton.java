import java.awt.*;
import java.awt.event.*;

public class PrueBoton extends Frame{
	private Button boton;
	private Label lbNombre,etiqueta;
	private TextField tfNombre;
	private Panel pn;

	public PrueBoton (){
		inicializar();
	}

	public void inicializar(){
		setSize(500,500);
		setTitle("Mi primer boton");
		setLayout(null);
		pn= new Panel();
		pn.setLayout(null);
		pn.setBounds(0,50,getWidth(),300);
		add(pn);
		lbNombre= new Label("ingrese su nombre");
		lbNombre.setBounds(20,5,200,30);
		lbNombre.setFont(new Font("arial",1,15));
		pn.add(lbNombre);

		etiqueta= new Label();
		etiqueta.setFont(new Font("arial",1,15));
		etiqueta.setBounds(83,90,200,22);
		pn.add(etiqueta);
		tfNombre=new TextField();
		tfNombre.setBounds(20,50,200,22);
		pn.add(tfNombre);
		boton= new Button("Pulsa aqui");
		boton.setFont(new Font("arial",1,13));
		boton.setBounds(150,380,80,70);
		add(boton);

		setVisible(true);

		ActionListener al= new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent ae){
				Colors c = new Colors();
				c.setVisible(true);
				//etiqueta.setText("Hola"+tfNombre.getText());
			}
		};
		boton.addActionListener(al);

	}
	public static void main(String[] args){
		PrueBoton b= new PrueBoton();
	}
}