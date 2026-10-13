package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ej1 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Introduce la base");
		Double base = ask.nextDouble();
		System.out.println("Ahora la altura");
		Double altura = ask.nextDouble();
		System.out.println("El perímetro es " + (base*2 + altura*2));
		System.out.println("El área es " + base*altura);
		ask.close();
	}
}