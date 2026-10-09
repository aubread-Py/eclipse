package ejerciciosSegundaParte;
import java.util.Scanner;
public class Ej4 {
	public static void main(String[] args) {
		System.out.println("Tienes la siguiente expresión y solo te falta la y: y=ax^2+bx+c\nIntroduce el valor de la x");
		Scanner ask = new Scanner(System.in);
		int x = ask.nextInt();
		System.out.println("Ahora el de la a");
		int a = ask.nextInt();
		System.out.println("Ahora el de la b");
		int b = ask.nextInt();
		System.out.println("Ahora el de la c");
		int c = ask.nextInt();
		System.out.println("y dará como resultado: " + (a*x*x+b*x+c));
		ask.close();
	}
}