package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ejb {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta tu edad");
		Integer edad = ask.nextInt();
		System.out.println("Tienes permiso de conducir? (responde con 'true' o 'false')");
		Boolean permiso = ask.nextBoolean();
		System.out.println("Tienes una sanción que te impida conducir? (responde con 'true' o 'false' de nuevo)");
		Boolean sancion = ask.nextBoolean();
		System.out.println("Puedes alquilar? " + (edad>=18 && permiso && !sancion));
		ask.close();
	}
}