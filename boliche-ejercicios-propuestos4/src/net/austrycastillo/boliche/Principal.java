package net.austrycastillo.boliche;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int edad; // declaramos la variable edad
		Scanner entrada = new Scanner(System.in);// instanciamos Scanner
		// Scanner nos permite aceptar datos desde el teclado
		System.out.print("Ingrese su edad: ");
		edad = entrada.nextInt();// nos permite leer desde teclado y guardamos
		if (edad >= 18) {
			System.out.println("Bienvenido al Boliche!!!");
		}

	}

}
