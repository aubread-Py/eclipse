package ejercicios;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		String nombre, direc, num;
		System.out.println("Introduce un tu nombre.");
		nombre = ask.next();
		System.out.println("Introduce un tu dirección.");
		direc = ask.next();
		System.out.println("Introduce un tu número de teléfono.");
		num = ask.next();
		System.out.println("Nombre: " + nombre + "\nDirección: " + direc + "\nNúmero de teléfono: " + num);
		ask.close();
	}
}