package Ejercicio4;

public class Serie {

	// Atributos:
	
	private String título;
	
	private int númeroTempos;
	
	private boolean entregado;
	
	private String genero;
	
	private String creador;

	// Constructores
	
	public Serie() {
		
		this.númeroTempos = 3;
		
		this.entregado = false;
		
	}

	public Serie(String titulo, String creador) {
		
		super();
		
		this.título = titulo;
		
		this.creador = creador;
		
	}
	
	public Serie(String titulo, int númeroTempos, String genero, String creador) {
		
		super();
		
		this.título = titulo;
		
		this.númeroTempos = númeroTempos;
		
		this.genero = genero;
		
		this.creador = creador;
		
	}
	
	// Getters i setters
	
		public String getTitulo() {
			
			return título;
			
		}

		public void setTitulo(String titulo) {
			
			this.título = titulo;
			
		}

		public int getNumTemps() {
			
			return númeroTempos;
			
		}

		public void setNumTemps(int númeroTempos) {
			
			this.númeroTempos = númeroTempos;
			
		}

		public boolean isEntregado() {
			
			return entregado;
			
		}

		public void setEntregado(boolean entregado) {
			
			this.entregado = entregado;
			
		}

		public String getGenero() {
			
			return genero;
			
		}

		public void setGenero(String genero) {
			
			this.genero = genero;
			
		}

		public String getCreador() {
			
			return creador;
			
		}

		public void setCreador(String creador) {
			
			this.creador = creador;
			
		}
		
		
		public String toString() {
			
			return "La serie tiene cómo título=" + título + ", su número de temporadas es:" + númeroTempos 
					+ ", se hizo la entrega el año: " + entregado + ", su género es: " + genero + "y su creador=" 
					+ creador + "]";
		}
	
}