package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ej3 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta el precio inicial");
		Double precio = ask.nextDouble();
		System.out.println("El precio final será de " + (precio*0.605+precio*0.425));
		ask.close();
	}
}