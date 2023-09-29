package modelo;


public abstract class Ficha {
	private String tipo;
	private int fila;
	private int columna;
	
	public Ficha(String tipo, int fila, int columna) {
		this.tipo = tipo;
		this.fila = fila;
		this.columna = columna;
	}

	public String getTipo() {
		return tipo;
	}

	public int getFila() {
		return fila;
	}

	public int getColumna() {
		return columna;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setFila(int fila) {
		this.fila = fila;
	}

	public void setColumna(int columna) {
		this.columna = columna;
	}
	

	
	
}
