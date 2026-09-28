package ejercicios;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		int num;
		System.out.println("Introduce tu edad.");
		num = ask.nextInt();
		System.out.print("El siguiente año tendrás " + (num + 1) + " años.");
		ask.close();
	}
}