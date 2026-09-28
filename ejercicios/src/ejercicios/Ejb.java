package ejercicios;

import java.util.Scanner;

public class Ejb {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		double conversion = 166;
		System.out.println("Introduce el número de pesetas que posee.");
		System.out.println("Pasando a pesetas, tienes un valor total de " + ask.nextInt() / conversion + " euros.");
		ask.close();
	}
}