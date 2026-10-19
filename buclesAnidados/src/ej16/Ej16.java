package ej16;
import java.util.Scanner;
public class Ej16 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta el número de filas");
		Integer y = ask.nextInt();
		Integer x = y-1;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(j==i||j==x?"#":".");
			}
			x -=1;
			System.out.println();
		}
		ask.close();
	}
}