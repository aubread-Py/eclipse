package ejercicios;

import java.util.Scanner;

public class Ejd {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		boolean lluvia, deberes, biblioteca, salir;
		System.out.println("Escribe los siguientes datos en el orden correspondiente con True (si) o False (no) (cuando termines de escribir uno pulsa enter para ir con el siguiente): ¿Está lloviendo? ¿Has terminado de hacer los deberes? ¿Tienes que ir a la biblioteca?");
		lluvia = ask.nextBoolean();
		deberes = ask.nextBoolean();
		biblioteca = ask.nextBoolean();
		salir = biblioteca || (!lluvia && deberes);
		if (salir) {
			System.out.println("Puedes salir a la calle.");
		}
		else {
			System.out.println("No puedes salir a la calle.");
		}
		ask.close();
	}
}