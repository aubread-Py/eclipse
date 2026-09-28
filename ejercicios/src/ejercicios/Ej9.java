package ejercicios;

import java.util.Scanner;

public class Ej9 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		boolean mayor;
		int edad;
		System.out.println("¿Cuántos años tienes?");
		edad = ask.nextInt();
		mayor = edad >= 18;
		if (mayor) {
			System.out.println("Eres mayor de edad.");
		}
		else {
			System.out.println("Eres menor de edad.");
		}
		ask.close();
	}
}