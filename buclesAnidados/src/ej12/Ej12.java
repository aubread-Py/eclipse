package ej12;
import java.util.Scanner;
public class Ej12 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta el número de filas");
		Integer y = ask.nextInt();
		System.out.println("Inserta el número de columnas");
		Integer x = ask.nextInt();
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print((i+j)%2==0?"*":"#");
			}
			System.out.println();
		}
		ask.close();
	}
}