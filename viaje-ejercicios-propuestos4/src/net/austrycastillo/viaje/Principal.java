package net.austrycastillo.viaje;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		/*
		 * En una universidad se está organizando un viaje de estudios y debemos
		 * determinar cuánto cobrar a cada alumno y cuánto debe pagar a la compañía de
		 * viajes por el servicio. La forma de cobrar es la siguiente: Si son 100
		 * alumnos o más, el costo por cada alumno es de 65 U$D De 50 a 99 alumnos, el
		 * costo es de 70 U$D De 30 a 49 alumnos, el costo es de 95 USD Menos de 30
		 * alumnos, el costo de la renta del autobús es de 4000 U$D, sin importar el
		 * número de alumnos.
		 * 
		 * Realiza un algoritmo que permita determinar el pago a la compañía de
		 * autobuses y lo que debe pagar cada alumno por el viaje.
		 * 
		 */
		Scanner scanner = new Scanner(System.in);
		int numeroAlumnos;
		// Solicitud de datos al usuario
		System.out.print("Número de alumnos: ");
		numeroAlumnos = scanner.nextInt();
		// Realizamos Cálculos y mostramos en pantalla
		if (numeroAlumnos >= 100) {
			System.out.println("El pago a la agencia es de " + numeroAlumnos * 65 + " "
					+ "euros y cada alumno debe pagar 65 euros");
		} else if (numeroAlumnos < 100 && numeroAlumnos >= 50) {
			System.out.println("El pago a la agencia es de " + numeroAlumnos * 70 + " "
					+ "euros y cada alumno debe pagar 70 euros");
		} else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
			System.out.println("El pago a la agencia es de " + numeroAlumnos * 95 + " "
					+ "euros y cada alumno debe pagar 95 euros");
		} else {
			System.out.println("El coste del autobús es de 4000 euros y cada alumno " + "debe pagar "
					+ (4000 / numeroAlumnos) + " euros.");
		}
	}

}
