package ejercicios;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		double nota1, nota2;
		System.out.println("Introduce la primera nota.");
		nota1 = ask.nextInt();
		System.out.print("Ahora introduce la segunda nota.");
		nota2 = ask.nextInt();
		System.out.println("Tu nota media es " + (nota1 + nota2)/2 + ".");
		if((nota1 + nota2)/2 < 5){
			System.out.println("Cosa mala.");
		}
		ask.close();
	}
}