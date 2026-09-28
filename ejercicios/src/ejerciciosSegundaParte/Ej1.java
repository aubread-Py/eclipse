package ejerciciosSegundaParte;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta un número con decimales. (Usa . para separar los decimales)");
		String x = ask.next();
		System.out.print("Redondeado, el número da: ");
		int pos = x.indexOf(".");
		int y = Character.getNumericValue(x.charAt(pos + 1));
		char z = (char) (x.charAt(pos-1)+1);
		if (y < 5){
			for (int i = 0; i < pos; i++) {
				System.out.print(x.charAt(i));
			}
		}
		else {
			for (int j = 0; j < (pos-1); j++) {
				System.out.print(x.charAt(j));
		}
			System.out.print(z);
		}
		ask.close();
	}
}