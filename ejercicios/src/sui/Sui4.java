package sui;
import java.util.Scanner;
public class Sui4 {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		String x;
		int y = 0;
		for (int i = 0; i < 2; i++) {
			System.out.println("Escribe en letra mayúscula un número obtenido por un dado");
			x = ask.next();
			switch (x) {
			case "UNO": {
				y += 1;
				break;
			}
			case "DOS": {
				y += 2;
				break;
			}
			case "TRES": {
				y += 3;
				break;
			}
			case "CUATRO": {
				y += 4;
				break;
			}
			case "CINCO": {
				y += 5;
				break;
			}
			case "SEIS": {
				y += 6;
				break;
			}
			default:
				System.out.println("Valor inválido introducido: " + x + " se esperaba un valor de cadena del UNO al SEIS como por ejemplo 'CUATRO'");
			}
		}
		System.out.println("La suma de los dados es " + y);
		ask.close();
	}
}