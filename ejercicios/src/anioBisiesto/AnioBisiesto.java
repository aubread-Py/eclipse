package anioBisiesto;

import java.util.Scanner;

public class AnioBisiesto {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		int anio;
		boolean bisiesto;
		System.out.println("Introduce un año.");
		anio = ask.nextInt();
		bisiesto = (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
		if (bisiesto) {
			System.out.print("El año es bisiesto.");
		}
		else {
			System.out.println("El año no es bisiesto.");
		}
		ask.close();
	}
}