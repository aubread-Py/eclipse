package ejercicios;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		int num;
		System.out.println("Introduce un número.");
		num = ask.nextInt();
		System.out.print(num);
		ask.close();
	}
}