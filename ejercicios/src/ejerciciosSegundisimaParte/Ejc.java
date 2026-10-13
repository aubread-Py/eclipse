package ejerciciosSegundisimaParte;

import java.util.Scanner;

public class Ejc {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta tu edad");
		Integer edad = ask.nextInt();
		System.out.println("El precio de la entrada es " + (edad<18 ? 6.50 : 9.50) + " euros");
		ask.close();
	}
}