//Proyecto que permite mostrar en pantalla 4 distintos patrones, según el tamaño ingresado por el usuario
package cl.desafiolatam;

import java.util.Scanner;

public class PatronesAnidados {
	public static void main(String[] args) {
		Scanner tecla = new Scanner(System.in);  //Inicialización objeto 

		// Patrón 1
		System.out.print("Ingrese el tamaño del lado para dibujar el Patrón 1: ");
		int lado = tecla.nextInt();
		dibujarCuadrado(lado);

		// Patrón 2
		System.out.print("Ingrese el tamaño para dibujar la Zeta: ");
		int tamanoZ = tecla.nextInt();
		dibujarZeta(tamanoZ);

		// Patrón 3
		System.out.print("Ingrese el tamaño para dibujar la X: ");
		int tamanoX = tecla.nextInt();
		dibujarX(tamanoX);

		// Patrón 4
		System.out.print("Ingrese el tamaño para dibujar el Patrón 4: ");
		int tamanoP4 = tecla.nextInt();
		dibujarPatron4(tamanoP4);

		tecla.close();
	}

	public static void dibujarCuadrado(int lado) {
		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				if (i == 1 || i == lado || j == 1 || j == lado) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	}

	public static void dibujarZeta(int tamanoZ) {
		for (int i = 1; i <= tamanoZ; i++) {
			for (int j = 1; j <= tamanoZ; j++) {
				if (i == 1 || i == tamanoZ || i + j == tamanoZ + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void dibujarX(int tamanoX) {
		for (int i = 1; i <= tamanoX; i++) {
			for (int j = 1; j <= tamanoX; j++) {
				if (i == j || i + j == tamanoX + 1) {
					System.out.print("x ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

	public static void dibujarPatron4(int tamanoP4) {

		int longitudPrimeraLinea = tamanoP4 - 1; // longitud de la primera línea
		int longitudUltimaLinea = tamanoP4 == 1 ? 1 : longitudPrimeraLinea; // longitud de la última línea

		// Dibujar primera línea
		if (tamanoP4 == 1) {
			System.out.println("*");
		}

		else {
			for (int i = 1; i <= longitudPrimeraLinea; i++) {
				System.out.print("*");
			}
			System.out.println();

			// Dibujar líneas intermedias
			for (int i = 3; i <= tamanoP4; i++) {

				for (int j = 1; j <= tamanoP4; j++) {
					if (j == 1 || j == tamanoP4) {
						System.out.print(" "); // espacios
					} else {
						System.out.print("*");
					}
				}

				System.out.println(); // saltar a la siguiente línea
			}

			// Dibujar última línea si altura > 1
			if (tamanoP4 > 1) {
				for (int i = 1; i <= longitudUltimaLinea; i++) {
					if (i == 1) {
						System.out.print(" *");
					} else {
						System.out.print("*");
					}
				}
				System.out.println();
			}

		}
	}

}
