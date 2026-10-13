package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ej8 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta el numero de productos");
		Integer productos = ask.nextInt();
		System.out.println("Inserta la capacidad de las cajas");
		Integer capacidad = ask.nextInt();
		Integer cajas = (int) Math.ceil((double) productos/capacidad);
		System.out.println("Necesitas "+cajas+" cajas");
		ask.close();
	}
}