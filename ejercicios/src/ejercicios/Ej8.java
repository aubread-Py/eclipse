package ejercicios;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		String nombre;
		int edad;
		System.out.println("¿Cómo te llamas?");
		nombre = ask.next();
		System.out.println("¿Cuántos años tienes?");
		edad = ask.nextInt();
		if (edad < 18) {
			System.out.println("¿Tienes " + edad + " años? ¡Qué jóven eres " + nombre + "!");
		}
		else {
			if (edad < 140) {
				System.out.println("¿Tienes " + edad + " años? ¡Estás hecho todo un adulto " + nombre + "!");
			}
			else {
				System.out.println("¿No crees que " + edad + " años es un poco bastante para un ser humano, " + nombre + "?");
			}
		}
		ask.close();
	}
}