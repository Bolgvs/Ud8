package Ejercicio1;

import javax.swing.JOptionPane;

public class Act8_1App {
	
	public static void main(String[] args) {
		
		Persona pers1 = new Persona();
		
		Persona pers2 = new Persona("Conchita", 79, 'M');
		
		Persona pers3 = new Persona("Marneus", 40, "12345678X", 'H', 66, 176);
		
		JOptionPane.showMessageDialog(null, pers1.toString());
		
		JOptionPane.showMessageDialog(null, pers2.toString());
		
		JOptionPane.showMessageDialog(null, pers3.toString());
		
	}

}
