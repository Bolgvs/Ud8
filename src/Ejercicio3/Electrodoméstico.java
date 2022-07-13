package Ejercicio3;

public class Electrodoméstico {

	// Variables:
	
	protected int precioBase;
	
	protected String color;
	
	protected char consE;
	
	protected int peso;
	
	// Valores por defecto de las variables:
	
	final int PB = 100;
	
	final String CL = "blanco";
	
	final char CN = 'F';
	
	final int P = 5;
	
	

	// Constructores
	
	public Electrodoméstico () {
		
		super();
		
		this.precioBase = PB;
		
		this.color = CL;
		
		this.consE = CN;
		
		this.peso = P;
		
	}

	public Electrodoméstico (int precioBase, int peso) {
		
		super();
		
		this.precioBase = precioBase;
		
		this.peso = peso;
		
	}
	
	public Electrodoméstico (int precioBase, String color, char consumoEnerg, int peso) {
		
		super();
		
		this.precioBase = precioBase;
		
		this.color = comprobarColor(color);
		
		this.consE = comprobarConsumo(consumoEnerg);
		
		this.peso = peso;
		
	}
	
	// Comprobamos el color
	
	public String comprobarColor (String color) {
		
		String colorC = CL;
		
		if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") ||color.equalsIgnoreCase("rojo")
				
			|| color.equalsIgnoreCase("azul") || color.equalsIgnoreCase("gris")) 
		
		{
			
			colorC = color;
		}
		
		return colorC;
	}
	
	// Para comprobar el cons. energético
	
	public char comprobarConsumo (char consumo) {
		
		switch (consumo) {
		
			case ('A'):
				
				break;
			
			case ('B'):
				
				break;
			
			case ('C'):
				
				break;
			
			case ('D'):
				
				break;
			
			case ('E'):
				
				break;
			
			case ('F'):
				
				break;
			
			default:
				
				consumo = 'F';
		}
		
		return consumo;
	}
	
	// Getters & setters
	
		public int getPrecioBase () {
			
			return precioBase;
			
		}

		public void setPrecioBase (int precioBase) {
			
			this.precioBase = precioBase;
			
		}

		public String getColor () {
			
			return color;
			
		}

		public void setColor (String color) {
			
			this.color = color;
			
		}

		public char getConsumoEnerg () {
			
			return consE;
			
		}

		public void setConsumoEnerg (char consumoEnerg) {
			
			this.consE = consumoEnerg;
			
		}

		public int getPeso () {
			
			return peso;
			
		}

		public void setPeso (int peso) {
			
			this.peso = peso;
			
		}

		public String toString() {
			
			return "Electrodomestico [ El precio son: " + precioBase + "€, el color es: " + color 
					+ ", el consumo energético es de: " + consE + " y su peso es de: " + peso + " kg ]";
		}
	
}