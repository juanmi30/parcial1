package modelo;


public class Torre extends Ficha{

	public Torre(String tipo, int fila, int columna) {
		super(tipo, fila, columna);
		// TODO Auto-generated constructor stub
	}

	

	public void moverHorizontal(int direccion, int nCasillas) {
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
	
	public void moverVertical(int direccion, int nCasillas) {
		//1 Arriba
		//2 Abajo
		int columna = getColumna();
		if (direccion == 1) {
			columna += nCasillas;
		} else {
			columna -= nCasillas;
		}
		
		setColumna(columna);
	}
}
