package ejerciciosSegundaParte;
import java.util.Scanner;
public class Ej9 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Introduce un número de problema");
		Integer prob = ask.nextInt();
		System.out.println("Pertenece al volúmen " + (int) prob/100);
		ask.close();
	}
}
