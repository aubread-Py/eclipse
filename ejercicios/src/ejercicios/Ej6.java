package ejercicios;

import java.util.Scanner;

public class Ej6 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		double input1, input2;
		System.out.println("Introduce un número.");
		input1 = ask.nextInt();
		System.out.println("Introduce otro número (este sería el restando o el dividendo en las operaciones correspondientes.");
		input2 = ask.nextInt();
		System.out.println("la suma de los números es " + (input1 + input2) + "\nla resta del primero menos el segundo es " + (input1 - input2) + "\nla multiplicación de los números es " + (input1 * input2) + "\nla división del primero entre el segundo es " + (input1 / input2));
		ask.close();
	}
}