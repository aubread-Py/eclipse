package ej08;
import java.util.Scanner;
public class Ej08 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta la altura");
		Integer y = ask.nextInt();
		Integer x = y*2-1;
		Integer z = y;
		for (int i = 0; i < y; i++) {
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