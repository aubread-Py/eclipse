package ejerciciosSegundaParte;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		System.out.println("Inserta un número.");
		Scanner ask = new Scanner(System.in);
		int num = ask.nextInt();
		System.out.println("Otro mas.");
		int num2 = ask.nextInt();
		int x = num2 - (num % num2);
		if (x != num2) {
			System.out.println("Al primero le falta " + x + " para ser múltiplo del segundo: " + (num + x));
			ask.close();
		}
		else {
			System.out.println("El primer número ya es múltiplo del segundo");
		}
	} 
}