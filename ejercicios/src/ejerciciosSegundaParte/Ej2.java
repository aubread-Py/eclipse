package ejerciciosSegundaParte;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		System.out.println("Inserta un número.");
		Scanner ask = new Scanner(System.in);
		int num = ask.nextInt();
		int x = 7 - (num % 7);
		if (x != 7) {
			System.out.println("Le falta " + x + " para ser múltiplo de 7: " + (num + x));
			ask.close();
		}
		else {
			System.out.println("Ya es múltiplo de 7");
		}
	} 
}