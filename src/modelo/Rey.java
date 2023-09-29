package modelo;


public class Rey extends Ficha{

	public Rey(String tipo, int fila, int columna) {
		super(tipo, fila, columna);
	}
	
	public void moverHorizontal(int direccion) {
		//1 derecha
		//2 izquierda
		int fila = getFila();	
		if (direccion == 1) {
			fila +=1;
		} else {
			fila -=1;
		}
		
		setFila(fila);
	}
	
	public void moverVertical(int direccion) {
		//1 Arriba
		//2 Abajo
		int columna = getColumna();
		if (direccion == 1) {
			columna +=1;
		} else {
			columna -=1;
		}
		
		setColumna(columna);
	}

	

}
