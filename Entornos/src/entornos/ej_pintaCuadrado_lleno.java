package entornos;

import java.util.Scanner;

public class ej_pintaCuadrado_lleno {

	public static void main(String[] args) {
		// Dibuja un cuadrado de n elementos de lado utilizando *.
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un n�mero para el lado del cuadrado");
		int lado = entrada.nextInt();
		
		int fila;
		int columna;
		
		
		for (fila=1; fila<=lado; fila++) {
			
			for (columna=1; columna<=lado; columna++)
				System.out.print ("* ");
				System.out.println ("");
		}
		

	}

}
