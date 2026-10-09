package ejerciciosSegundaParte;
import java.util.Scanner;
public class EjFinal {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Introduce un año");
		 double anio = ask.nextDouble();
		System.out.println("El siglo es " + ((int) (anio-1)/100 + 1));
		ask.close();
	}
}