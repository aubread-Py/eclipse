package ejercicios;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		double radio;
		final double pi = 3.141592;
		System.out.println("Introduce el radio de tu circunferencia.");
		radio = ask.nextInt();
		System.out.println("La longitud de tu circunferencia es de " + (2 * pi * radio) + " unidades y el area es de " + (pi * radio * radio) + " unidades cuadradas.");
		ask.close();
	}
}