package bucleFor;
import java.util.Scanner;
public class BucleFor {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta un número entero positivo");
		Integer x =ask.nextInt();
		Boolean primo = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0){
				System.out.println("El número no es primo");
				primo = false;
				break;
			}
		}
		if (primo) {
			System.out.println("El número es primo");
		}
		ask.close();
	}
}