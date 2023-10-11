package mi_interfaz;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ventanaPrincipal extends JFrame implements ActionListener{

	JPanel miVentana;
	JTextField txtNumero;
	JLabel titulo;
	JButton btnUno,btnDos,btnTres,btnCuatro,btnCinco,btnSeis,btnSiete,btnOcho,btnNueve,btnCero,btnSuma,btnResta,btnMultiplicacion,btnDividicion,btnIgual,btnLimpiar;
	
	calculadora miCalculadora;
	double n;
	double guadon1[]= new double[1];
	String opcion ;
	
	
	public ventanaPrincipal() {
		
		setTitle("Calculadora");
		setSize(400, 600);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
		
	}
	
	
	public void iniciarComponentes() {
		
		miVentana = new JPanel();
		miVentana.setLayout(null);
		miVentana.setBackground(Color.blue);
		
		
		txtNumero = new JTextField();
		txtNumero.setBounds(47, 50, 300, 100);
		txtNumero.setFont(new Font("ROBOT",Font.BOLD,40));
		
		btnUno =new JButton();
		btnUno.setText("1");
		btnUno.setBounds(47, 200, 45, 45);
		btnUno.addActionListener(this);
		
		btnDos =new JButton();
		btnDos.setText("2");
		btnDos.setBounds(135, 200, 45, 45);
		btnDos.addActionListener(this);
		
		btnTres =new JButton();
		btnTres.setText("3");
		btnTres.setBounds(220, 200, 45, 45);
		btnTres.addActionListener(this);
		
		btnDividicion =new JButton();
		btnDividicion.setText("/");
		btnDividicion.setBounds(300, 200, 45, 45);
		btnDividicion.addActionListener(this);
		
		btnCuatro =new JButton();
		btnCuatro.setText("4");
		btnCuatro.setBounds(47, 300, 45, 45);
		btnCuatro.addActionListener(this);
		
		btnCinco =new JButton();
		btnCinco.setText("5");
		btnCinco.setBounds(135, 300, 45, 45);
		btnCinco.addActionListener(this);
		
		
		btnSeis =new JButton();
		btnSeis.setText("6");
		btnSeis.setBounds(220, 300, 45, 45);
		btnSeis.addActionListener(this);
		
		btnMultiplicacion =new JButton();
		btnMultiplicacion.setText("*");
		btnMultiplicacion.setBounds(300, 300, 45, 45);
		btnMultiplicacion.addActionListener(this);
		
		btnSiete =new JButton();
		btnSiete.setText("7");
		btnSiete.setBounds(47, 400, 45, 45);
		btnSiete.addActionListener(this);
		
		btnOcho =new JButton();
		btnOcho.setText("8");
		btnOcho.setBounds(135, 400, 45, 45);
		btnOcho.addActionListener(this);
		
		btnNueve=new JButton();
		btnNueve.setText("9");
		btnNueve.setBounds(220, 400, 45, 45);
		btnNueve.addActionListener(this);
		
		
		
		btnSuma =new JButton();
		btnSuma.setText("+");
		btnSuma.setBounds(300, 400, 45, 45);
		btnSuma.addActionListener(this);
		
		btnIgual =new JButton();
		btnIgual.setText("=");
		btnIgual.setBounds(47, 490, 45, 45);
		
		btnCero =new JButton();
		btnCero.setText("0");
		btnCero.setBounds(135, 490, 45, 45);
		btnCero.addActionListener(this);
		
		btnLimpiar=new JButton();
		btnLimpiar.setText("Clear");
		btnLimpiar.setBounds(200, 490, 90, 45);
		btnLimpiar.addActionListener(this);
		
		
		btnResta =new JButton();
		btnResta.setText("+");
		btnResta.setBounds(300, 490, 45, 45);
		btnResta.addActionListener(this);
		
		
		
		
		
		
		miVentana.add(txtNumero);
		miVentana.add(btnUno);
		miVentana.add(btnDos);
		miVentana.add(btnTres);
		miVentana.add(btnDividicion);
		miVentana.add(btnCuatro);
		miVentana.add(btnCinco);
		miVentana.add(btnSeis);
		miVentana.add(btnMultiplicacion);
		miVentana.add(btnSiete);
		miVentana.add(btnOcho);
		miVentana.add(btnNueve);
		miVentana.add(btnSuma);
		miVentana.add(btnIgual);
		miVentana.add(btnCero);
		miVentana.add(btnLimpiar);
		miVentana.add(btnResta);
		
		
		add(miVentana);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
		if(e.getSource()== btnUno) {
			double n = Double.parseDouble(btnUno.getText());
			txtNumero.setText("1");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnDos) {
			double n = Double.parseDouble(btnDos.getText());
			txtNumero.setText("2");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnTres) {
			double n = Double.parseDouble(btnTres.getText());
			txtNumero.setText("3");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnCuatro) {
			double n = Double.parseDouble(btnCuatro.getText());
			txtNumero.setText("4");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnCinco) {
			double n = Double.parseDouble(btnCinco.getText());
			txtNumero.setText("5");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnSeis) {
			double n = Double.parseDouble(btnSeis.getText());
			txtNumero.setText("6");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnSiete) {
			double n = Double.parseDouble(btnSiete.getText());
			txtNumero.setText("7");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnOcho) {
			double n = Double.parseDouble(btnOcho.getText());
			txtNumero.setText("8");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnNueve) {
			double n = Double.parseDouble(btnNueve.getText());
			txtNumero.setText("9");
			double almacenado = Double.parseDouble(txtNumero.getText());
			double guadon1[]= new double[1];
			guadon1[0]= almacenado;
		}else if(e.getSource()== btnLimpiar) {
			txtNumero.setText("");
			
			
		}else if(e.getSource()== btnCero) {
			double n= Double.parseDouble(btnCero.getText());
			txtNumero.setText("0");
		}else if (e.getSource() == btnSuma) {
		    double almacenado = Double.parseDouble(txtNumero.getText());
		    guadon1[0] = almacenado;
		    txtNumero.setText("");  
		    opcion = "+";  
		} else if (e.getSource() == btnResta) {
		    double almacenado = Double.parseDouble(txtNumero.getText());
		    guadon1[0] = almacenado;
		    txtNumero.setText("");  
		    opcion = "-";  
		} else if (e.getSource() == btnMultiplicacion) {
		    double almacenado = Double.parseDouble(txtNumero.getText());
		    guadon1[0] = almacenado;
		    txtNumero.setText("");  
		    opcion = "*";  
		} else if (e.getSource() == btnDividicion) {
		    double almacenado = Double.parseDouble(txtNumero.getText());
		    guadon1[0] = almacenado;
		    txtNumero.setText(""); 
		    opcion = "/";  
		}

		
		
			
		
	}
	
	
	
	
	
	
	
}
