package ejercicios;

import java.util.Scanner;

public class Eje {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		int nota1, nota2, nota3;
		final double decimal = 3;
		System.out.println("Introduce la primera nota.");
		nota1 = ask.nextInt();
		System.out.print("Ahora introduce la segunda nota.");
		nota2 = ask.nextInt();
		System.out.print("Finalmente, introduce la tercera nota.");
		nota3 = ask.nextInt();
		System.out.println("Tu nota del boletín es " + (nota1 + nota2 + nota3)/3 + ".");
		System.out.println("Tu nota del expediente es " + (nota1 + nota2 + nota3)/decimal + ".");
		//No redondea hacia arriba.
		ask.close();
	}
}