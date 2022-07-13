package Ejercicio3;

import javax.swing.JOptionPane;

public class Act8_3App {
	
	public static void main(String[] args) {

		Electrodoméstico elec1 = new Electrodoméstico ();
		
		Electrodoméstico elec2 = new Electrodoméstico (200, "blanco", 'P', 5);
		
		JOptionPane.showMessageDialog(null, elec1.toString());
		
		JOptionPane.showMessageDialog(null, elec2.toString());
		
	}

}
