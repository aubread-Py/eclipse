package ej06;
import java.util.Scanner;
public class Ej06 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta la altura");
		Integer y = ask.nextInt();
		Integer x = y;
		for (int i = 0; i < y; i++) {
			for (int k = 0; k < (y-x); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < x; j++) {
				System.out.print("*");
				}
			x -= 1;
			System.out.println();
			}
			ask.close();
		}
	}