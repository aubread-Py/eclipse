package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ej9 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta los litros de agua");
		Double litros = ask.nextDouble();
		System.out.println("Inserta la capacidad de cada botella");
		Double cap = ask.nextDouble();
		System.out.println("Se pueden llenar " + (int) Math.floor(litros/cap) + " botellas enteras");
		ask.close();
	}
}