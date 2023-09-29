package consola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import procesamiento.Tablero;

public class Aplicacion {

	public static String input(String mensaje) {
		try {
			System.out.println(mensaje + ": ");
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			return reader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {

		System.out.println("Simulador tablero de ajedrez");

		String jugar = input("Presione 1 para jugar");
		
		if (Integer.parseInt(jugar) == 1) {
			System.out.println("Escoger pieza para jugar:");
			System.out.println("1. Peon\n2. Rey\n3. Torre");
			String piezaSeleccion = input("seleccione");
			if (Integer.parseInt(piezaSeleccion) == 1) {
				Tablero tablero = new Tablero(8, 8 , "peon");
			} else if (Integer.parseInt(piezaSeleccion)== 2) {
				Tablero tablero = new Tablero(8, 8 , "rey");
			} else if (Integer.parseInt(piezaSeleccion)==3) {
				Tablero tablero = new Tablero(8, 8 , "torre");
			}
		}

	}

}
