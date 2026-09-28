package ejercicios;

import java.util.Scanner;

public class Ejc {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		double peras = 1.95;
		double manzanas = 2.35;
		System.out.println("Introduce los kilos de manzana vendidos.");
		System.out.println("Mediante manzanas has ganado un total de " + ask.nextInt() * manzanas + " euros.");
		System.out.println("Introduce los kilos de pera vendidos.");
		System.out.println("Mediante peras has ganado un total de " + ask.nextInt() * peras + " euros.");
		ask.close();
	}
}