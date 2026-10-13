package ejerciciosSegundisimaParte;
import java.util.Random;
public class Ej7 {
	public static void main(String[] args) {
		Random ran = new Random();
		Integer ent = ran.nextInt(100) + 1;
		Double real = ran.nextDouble();
		Boolean bol = ran.nextBoolean();
		System.out.println("Numero entero aleatorio: " + ent);
		System.out.println("Numero real aleatorio: " + real);
		System.out.println("Booleano aleatorio: " + bol);
	}
}