package ejerciciosSegundisimaParte;
import java.util.Scanner;
public class Ejf {
	public static void main(String[] args) {
		Scanner ask = new Scanner(System.in);
		System.out.println("Inserta a");
		Integer a = ask.nextInt();
		System.out.println("Inserta b");
		Integer b = ask.nextInt();
		System.out.println("Inserta c");
		Integer c = ask.nextInt();
		System.out.println("La primera expresión da: " + (a+b*c) + "\nY la segunda da: " + ((a+b)*c));
		//El resultado será diferente por que el criterio de java para elejir que operaciones se realizan primero da prioridad a la multiplicación antes de la suma
		ask.close();
	}
}