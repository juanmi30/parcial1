package procesamiento;

import java.util.ArrayList;

import modelo.Ficha;
import modelo.Peon;

public class Tablero {
	private int nFilas;
	private int nColumnas;
	private String fichaEnJuego;
	
	public Tablero(int nFilas, int nColumnas, String string) {
		this.nFilas = nFilas;
		this.nColumnas = nColumnas;
		this.fichaEnJuego = string;
	}

	public int getnFilas() {
		return nFilas;
	}

	public void setnFilas(int nFilas) {
		this.nFilas = nFilas;
	}

	public int getnColumnas() {
		return nColumnas;
	}

	public void setnColumnas(int nColumnas) {
		this.nColumnas = nColumnas;
	}
	
	public void iniciarJuego(String ficha) {
		boolean jugar = true;
		if (ficha == "peon") {
			Peon peon = new Peon("peon", 0, 0, true);
		while (jugar) {
			peon.moverAdelante();
		}
		
		}

	}
	
}
