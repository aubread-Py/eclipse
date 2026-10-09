package ejerciciosSegundaParte;
import java.util.Scanner;
public class Ej8 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Introduce en metros la distancia recorrida");
		double dis = ask.nextDouble();
		System.out.println("El recorrido en centímetros es " + (int) dis/100 + " y no redondea hacia arriba.");
		ask.close();
	}
}