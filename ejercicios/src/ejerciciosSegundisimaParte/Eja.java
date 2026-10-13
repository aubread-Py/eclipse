package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Eja {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("introduce un año");
		Integer anio = ask.nextInt();
		Boolean bisiesto = (anio % 400 == 0) || ((anio % 4 == 0) && (anio % 100 != 0));
		System.out.println("Es bisiesto? " + bisiesto);
		ask.close();
	}
}