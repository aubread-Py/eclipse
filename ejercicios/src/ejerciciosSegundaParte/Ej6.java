package ejerciciosSegundaParte;
import java.util.Scanner;
public class Ej6 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Introduce una distancia en miímetros");
		Double mil = ask.nextDouble();
		System.out.println("Ahora otra en centímetros");
		Double cen = ask.nextDouble();
		System.out.println("Y finalmente, otra en metros");
		Double met = ask.nextDouble();
		System.out.println("La distancia en centímetros equivale a: " + (mil*0.1+cen+met*100));
		ask.close();
	}
}