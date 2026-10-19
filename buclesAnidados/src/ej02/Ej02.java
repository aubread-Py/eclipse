package ej02;
import java.util.Scanner;
public class Ej02 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta el número de filas");
		Integer y = ask.nextInt();
		System.out.println("Inserta el número de columnas");
		Integer x = ask.nextInt();
		for (int i = 0; i < y; i++) {
			System.out.print("*");
			for (int j = 0; j < (x-2); j++) {
					System.out.print(i == 0 || i == (y-1)?"*":" ");
				}
			System.out.println("*");
			}
			ask.close();
		}
	}