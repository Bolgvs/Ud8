package Ejercicio1;

public class Persona {
		
		private String nombre;
		
		private int edad;
		
		private String DNI;
		
		private char sexo;
		
		private double peso;
		
		private double altura;
		
		
		// Hacer el sexo constante
		
		final char S = 'H';
		
		// Constructor por defecto (no hace falta ponerlo)
		
		public Persona() {
			
			this.nombre = "";
			
			this.edad = 0;
			
			this.sexo = S;
			
			this.peso = 0.0;
			
			this.altura = 0.0;
			
		}
		
		// Constructor N, E, S
		
		public Persona(String nombre, int edad, char sexo) {
			this.nombre = nombre;
			
			this.edad = edad;
			
			this.sexo = sexo;
			
		}
		
		// Constructor todos los atr.
		
		public Persona(String nombre, int edad, String DNI, char sexo, double peso, double altura) {
			
			super();
			
			this.nombre = nombre;
			
			this.edad = edad;
			
			this.DNI = DNI;
			
			this.sexo = sexo;
			
			this.peso = peso;
			
			this.altura = altura;
			
		}

		// Getters & setters
		
		public String getNombre() {
			
			return nombre;
			
		}

		public void setNombre(String nombre) {
			
			this.nombre = nombre;
			
		}

		public int getEdad() {
			
			return edad;
			
		}

		public void setEdad(int edad) {
			
			this.edad = edad;
			
		}

		public String getDNI() {
			
			return DNI;
			
		}

		public void setDni(String dni) {
			
			this.DNI = dni;
			
		}

		public char getSexo() {
			
			return S;
			
		}

		public void setSexo(char sexo) {
			
			this.setSexo(S);
			
		}

		public double getPeso() {
			
			return peso;
			
		}

		public void setPeso(double peso) {
			
			this.peso = peso;
			
		}

		public double getAltura() {
			
			return altura;
			
		}

		public void setAltura(double altura) {
			
			this.altura = altura;
			
		}
		
		public String toString() {
			
			return "Persona [nombre: " + nombre + ", edad: " + edad + ", DNI: " + DNI + ", sexo: " + sexo 
					+ ", peso: " + peso + ", altura: " + altura + "]";
			
		}
		

}
