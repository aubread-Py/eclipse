package ejercicios;

import java.util.Scanner;

public class Ejf {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		double precio;
		final double IVA = 1.21; //Suponemos que es 21%
		System.out.println("Introduce un precio.");
		precio = ask.nextDouble();
		System.out.println("Aplicando el IVA, el precio total sería de " + IVA * precio + " euros.");
		ask.close();
	}
}