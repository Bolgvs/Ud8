package Ejercicio4;

import javax.swing.JOptionPane;

public class Act8_4App {
	
	public static void main(String[] args) {

		Serie S1 = new Serie();
		
		Serie S2 = new Serie("Peaky Blinders", "Netflix");
		
		Serie S3 = new Serie("The Man in the High Castle", 4, "Acción", "Netflix");
		
		JOptionPane.showMessageDialog(null, S1.toString());
		
		JOptionPane.showMessageDialog(null, S2.toString());
		
		JOptionPane.showMessageDialog(null, S3.toString());
		
	}
	
}
