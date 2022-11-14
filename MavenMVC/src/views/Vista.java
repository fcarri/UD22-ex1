package views;

import javax.swing.*;


public class Vista extends JFrame {
	
	private JPanel contentPane;	
	public JButton boton1, boton2;
	public JLabel etiqueta1, jNombre, jApellidos, jDireccion, jDNI, jFecha;
	public JTextField fNombre, fApellidos, fDireccion, fDNI, fFecha;
	
	
	
	public Vista() {
				
		//DateTimeFormatter.ofPattern("dd/MM/uu");
		
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		etiqueta1 = new JLabel("INTRODUCIR DATOS");
		etiqueta1.setBounds(40, 20, 300, 20);
		contentPane.add(etiqueta1);
		
		jNombre = new JLabel("Nombre: ");
		jNombre.setBounds(40, 60, 200, 25);
		contentPane.add(jNombre);
		
		jApellidos = new JLabel("Apellidos: ");
		jApellidos.setBounds(40, 140, 200, 25);
		contentPane.add(jApellidos);
		
		jDireccion = new JLabel("Dirección: ");
		jDireccion.setBounds(40, 220, 200, 25);
		contentPane.add(jDireccion);
		
		jDNI = new JLabel("DNI: ");
		jDNI.setBounds(40, 300, 200, 25);
		contentPane.add(jDNI);
		
		jFecha = new JLabel("Fecha (yyyy-mm-dd): ");
		jFecha.setBounds(40, 380, 200, 25);
		contentPane.add(jFecha);
		
		fNombre = new JTextField();
		fNombre.setBounds(40,100,200,25);
		contentPane.add(fNombre);	
						
		fApellidos = new JTextField();
		fApellidos.setBounds(40,180,350,25);
		contentPane.add(fApellidos);	
		
		fDireccion = new JTextField();
		fDireccion.setBounds(40,260,350,25);
		contentPane.add(fDireccion);

		fDNI = new JTextField();
		fDNI.setBounds(40,340,80,25);
		contentPane.add(fDNI);
		
		fFecha = new JTextField();
		fFecha.setBounds(40,410,80,25);
		contentPane.add(fFecha);
		
		boton1 = new JButton("Introducir datos");
		boton1.setBounds(120,490,200,23);
		contentPane.add(boton1);	
		
		boton2 = new JButton("Finalizar");
		boton2.setBounds(120,550,200,23);
		contentPane.add(boton2);	
		  							
	}
		
	
}
