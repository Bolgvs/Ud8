package Ejercicio2;

import javax.swing.JOptionPane;

public class Act8_2App {
	
	public static void main(String[] args) {

		Password pass1 = new Password();
		
		Password pass2 = new Password(14);
		
		JOptionPane.showMessageDialog(null, pass1.toString());
		
		JOptionPane.showMessageDialog(null, pass2.toString());
		
	}

}
