package ejercicios;

import java.util.Scanner;

public class Eja {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		boolean par;
		System.out.println("Inserta un número.");
		par = ask.nextInt() % 2 == 0;
		if (par) {
			System.out.println("El número es par.");
		}
		else {
			System.out.println("El número es impar.");
		}
		ask.close();
	}
}