package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ej5 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta un numero real positivo");
		Double numero = ask.nextDouble();
		System.out.println("El valor absoluto es "+ Math.abs(numero));
		System.out.println("La raiz cuadrada es "+ Math.sqrt(numero));
		ask.close();
	}
}