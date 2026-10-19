package ej17;
import java.util.Scanner;
public class Ej17 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta la altura");
		Integer y = ask.nextInt();
		Integer x = 1;
		for (int i = 0; i < y; i++) {
			for (int j = 0; j < x; j++) {
					System.out.print(j+1);
				}
			x += 1;
			System.out.println();
			}
			ask.close();
		}
	}