package Ejercicio2;

public class Password {
	
	// Atributos
	
	private int longitud;
	
	private String contraseña;
	
	// Contructores
	
	public Password() {
		
		
		this.longitud = 8;
		
		this.contraseña = generarContraseñaAleat(longitud);
		
	}
	
	public Password(int longitud) {
		
		this.longitud = longitud;
		
		this.contraseña = generarContraseñaAleat(longitud);
		
	}
	
	public String toString() {
		
		return "Password [ La longitud es de: " + longitud + " carácteres y la contraseña es: " + contraseña + " ]";
		
	}

	// Metodo para generar contraseña aleatoria
	
	public String generarContraseñaAleat (int longitud) {
		
		
		
		String contraseña = "";
		
		// For para cada uno de los caracteres
		
		for (int bucle = 0; bucle < longitud; bucle++) {
			
			int random = (int) (Math.random()*56) + 24;
			
			char caracter = (char) random;
			
			contraseña += caracter;
			
		}
		
		return contraseña;
		
	}
	
	// Getters y setters
	
		public int getLongitud() {
			
			return longitud;
			
		}

		public void setLongitud(int longitud) {
			
			this.longitud = longitud;
			
		}

		public String getContraseña() {
			
			return contraseña;
			
		}

		public void setContraseña(String contraseña) {
			
			this.contraseña = contraseña;
			
		}

}
