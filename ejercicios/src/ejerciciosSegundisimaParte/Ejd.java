package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ejd {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta la cantidad de dinero");
		double dinero = ask.nextDouble();
		Integer euros = (int) dinero;
		Integer centimos = (int) Math.round((dinero-euros)*100);
	    Double euros2 = (double) euros + ((double)centimos)/100;
		System.out.println("Tienes " + euros2 + " euros y " + centimos + " centimos");
		ask.close();
	}
}