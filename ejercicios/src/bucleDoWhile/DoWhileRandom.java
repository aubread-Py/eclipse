package bucleDoWhile;
import java.util.Scanner;
public class DoWhileRandom {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		Boolean acierto = false;
		Long min = 1L;
		Long max = 100L;
		Long x;
		String y;
		do {
			x = Math.round((int) (max-min)*Math.random()+min);
			System.out.println("El número es " + x + "? En caso de que no, indica si es mayor escribiendo + o menor escribiendo -.\nEn caso de que si, escribe si.");
			y = ask.next();
			if (y.equals("si")) {
				System.out.println("Ea");
				acierto = true;
			}
			else {
				if (y.equals("+")) {
					min = x;
				}
				else {
					if (y.equals("-")) {
						max = x;
					}
					else {
						System.out.println("Entrada inesperada");
					}
				}
			}
		} while (!acierto);
		ask.close();
	}
}