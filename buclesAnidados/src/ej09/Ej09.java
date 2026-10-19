package ej09;
import java.util.Scanner;
public class Ej09 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta la altura del triángulo superior");
		Integer y = ask.nextInt();
		Integer x = 1;
		Integer z = 1;
		for (int i = 0; i < y; i++) {
			for (int k = 0; k < (y-z); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < x; j++) {
				System.out.print("*");
				}
			x += 2;
			z += 1;
			System.out.println();
			}
		x -= 4;
		z -= 2;
		for (int i = 1; i < y; i++) {
			for (int k = 0; k < (y-z); k++) {
				System.out.print(" ");
			}
			for (int j = 0; j < x; j++) {
				System.out.print("*");
				}
			x -= 2;
			z -= 1;
			System.out.println();
			}
			ask.close();
		}
	}