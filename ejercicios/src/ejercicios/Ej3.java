package ejercicios;

import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		int anio, nacimiento;
		System.out.println("Introduce el año actual.");
		anio = ask.nextInt();
		System.out.print("Ahora introduce tu año de nacimiemto.");
		nacimiento = ask.nextInt();
		System.out.println("Tu edad es " + (anio - nacimiento) + " (a final de año).");
		if(anio - nacimiento < 0){
			System.out.println("¿Seguro que no lo has puesto al revés..?");
		}
		ask.close();
	}
}