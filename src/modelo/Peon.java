package modelo;


public class Peon extends Ficha{

	private boolean esPosicionInicial;
	


	public Peon(String tipo, int fila, int columna, boolean esPosicionInicial) {
		super(tipo, fila, columna);
		this.esPosicionInicial = esPosicionInicial;
	}


	public void moverAdelante() {
		int columna = getColumna();
		if (this.esPosicionInicial) {
			columna +=2;
		} else {
			columna +=1;
		}
		
		setColumna(columna);
	}

}
