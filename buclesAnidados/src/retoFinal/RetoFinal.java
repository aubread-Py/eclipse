package retoFinal;
import java.util.Scanner;
public class RetoFinal {
	public static void main(String[] args) {
		Integer f,c,a,x;
		String res = "";
		Scanner ask = new Scanner(System.in);
		while(!res.equals("salir")) {
			System.out.println("Elije una forma: 'cuadrado' o 'triángulo'. Escribe 'salir' para salir.");
			res = ask.next();
			if (res.equals("cuadrado")) {
				System.out.println("Inserta el número de filas");
				f = ask.nextInt();
				System.out.println("Inserta el número de columnas");
				c = ask.nextInt();
				if (f > 0 && c > 0) {

					for (int j = 0; j < f; j++) {
						for (int k = 0; k < c; k++) {
							System.out.print("*");
						}
						System.out.println();
					}
				}
				else {
					System.out.println("No se admiten números negativos");
				}
			}
			else if (res.equals("triángulo")) {
				System.out.println("Introduce la altura");
				a = ask.nextInt();
				if (a > 0) {
					x = 1;
					for (int l = 0; l < a; l++) {
						for (int m = 0; m < x; m++) {
								System.out.print("*");
							}
						x += 1;
						System.out.println();
						}
				}
				else {
					System.out.println("No se admiten números negativos");
				}
			}
			else {
				if (!res.equals("salir")) {
					System.out.println("Respuesta no esperada");
				}
			}
		}
		ask.close();
	}
}