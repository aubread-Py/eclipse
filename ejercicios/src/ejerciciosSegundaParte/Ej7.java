package ejerciciosSegundaParte;
import java.util.Scanner;
public class Ej7 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserte el número de entradas infantiles que ha comprado");
		Double inf = ask.nextDouble();
		System.out.println("Y ahora nserte el número de entradas para adultos que ha comprado");
		Double adul = ask.nextDouble();
		ask.close();
		Double coste = inf*15.5 + adul*20;
		System.out.println("El coste total será " + (coste>=100?coste:coste*0.95));
	}
}