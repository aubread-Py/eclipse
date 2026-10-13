package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ej4 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta un número con decimales");
		Double num = ask.nextDouble();
		System.out.println("Redondeado hacia abajo, el número da " + (int) Math.floor(num) + " redondeado hacia arriba, el número da " + (int) Math.ceil(num) + " redondeado hacia el más próximo, el número da " + Math.round(num));
		ask.close();
	}
}