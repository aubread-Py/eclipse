package ejerciciosSegundisimaParte;
import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
		System.out.println("Introduce un número de segundos");
		Scanner ask = new Scanner(System.in);
	    int x = ask.nextInt();
		System.out.println("Las horas son: " + (x/3600) + " los minutos son: " + ((x%3600)/60) + " los segundos son " + (x%3600)%60);
		ask.close();
	}
} //Copiado dirctamente del 5 de la parte oculta del 1