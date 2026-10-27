package test;

import java.util.ArrayList;
import java.util.List;
import ejercicios.Ejercicios;
import utiles.Utiles;

public class TestEjercicios {

    public static void main(String[] args) {
        //List<Integer> numeros = List.of(2, 4, 3, 6, 5, 28);
    	List<Integer> numeros = new ArrayList<Integer>();
    	numeros.add(2);numeros.add(4);numeros.add(3);
    	numeros.add(6);numeros.add(5);numeros.add(28);
        System.out.println("Lista: " + numeros);

        System.out.println("\n--- SUMAS ---");
        System.out.println("Suma 1 (for-each): " + Ejercicios.suma1(numeros));
        System.out.println("Suma 2 (for):      " + Ejercicios.suma2(numeros));
        System.out.println("Suma 3 (while):    " + Ejercicios.suma3(numeros));

        System.out.println("\n--- CONTADORES ---");
        System.out.println("Cantidad de pares:     " + Ejercicios.contarPares(numeros));
        System.out.println("Cantidad de primos:    " + Ejercicios.contarPrimos(numeros));
        System.out.println("Cantidad de perfectos: " + Ejercicios.contarPerfectos(numeros));

        System.out.println("\n--- MEDIAS ---");
        System.out.println("Media 1 (for-each): " + Ejercicios.media1(numeros));
        System.out.println("Media 2 (for):      " + Ejercicios.media2(numeros));
        System.out.println("Media 3 (while):    " + Ejercicios.media3(numeros));

        System.out.println("\n--- PRUEBAS DE UTILES ---");
        System.out.println("¿7 es primo?       " + Utiles.esPrimo(7));
        System.out.println("¿9 es primo?       " + Utiles.esPrimo(9));
        System.out.println("¿6 es perfecto?    " + Utiles.esPerfecto(6));
        System.out.println("¿28 es perfecto?   " + Utiles.esPerfecto(28));
        System.out.println("¿12 es perfecto?   " + Utiles.esPerfecto(12));
        
        //TODO Seguir haciendo las pruebas de los ejercicios
        System.out.println("\n--- Ej 1 halloween ---");
        System.out.println("Puede entrar con 17 , true , Vampiro?   " + Ejercicios.puedeEntrar(17, true, "Vampiro"));
        System.out.println("Puede entrar con 21 , false , Hombre Lobo?   " + Ejercicios.puedeEntrar(21, false, "Hombre Lobo"));
        
        System.out.println("\n--- Ej 2 halloween ---");
        List<String> lista = List.of("dulce", "ácido", "dulce", "misterioso");
        System.out.println("Cuántos caramelos dulces hay en dulce, ácido, dulce, misterioso " + Ejercicios.cuentaCaramelos(lista, "dulce"));
        lista = List.of("dulce", "amargo", "misterioso");
        System.out.println("Cuántos caramelos amargos hay en dulce, amargo y misterioso " + Ejercicios.cuentaCaramelos(lista, "amargo"));
        
        System.out.println("\n--- Ej 3 halloween ---");
        List<Integer> recorrido = List.of(2, 3, 4, -1, 5);
        System.out.println("En el laberinto 2, 3, 4, -1, 5 los pasos que da el mounstro son en total: " + Ejercicios.pasosLaberinto(recorrido));
        recorrido = List.of(2, 0, 4, -1, 5);
        System.out.println("En el laberinto 2, 0, 4, -1, 5 los pasos que da el mounstro son en total: " + Ejercicios.pasosLaberinto(recorrido));
        recorrido = List.of(2, 3, 4, 1, 5, -3);
        System.out.println("En el laberinto 2, 3, 4, 1, 5, -3 los pasos que da el mounstro son en total: " + Ejercicios.pasosLaberinto(recorrido));
        
        System.out.println("\n--- Ej 4 halloween ---");
        List<Integer> magia = List.of(3,9,7,4,10);
        System.out.println("En la lista de calabazas de magia: 3,9,7,4,10, el promedio de excluyendo las menores de 4 de magia es " + Ejercicios.promedioMagia(magia));
        magia = List.of(1,2,3,4,5,6,7,8,9,11);
        System.out.println("En la lista de calabazas de magia: 1,2,3,4,5,6,7,8,9,11, el promedio de excluyendo las menores de 4 de magia es " + Ejercicios.promedioMagia(magia));
        
        System.out.println("\n--- Ej 5 halloween ---");
        System.out.println("El susto final con el parámetro 4 devuelve");
        Ejercicios.cuentaAtrasSustos(4);
        System.out.println("El susto final con el parámetro 7 devuelve");
        Ejercicios.cuentaAtrasSustos(7);
        
        System.out.println("\n--- Ej 6 halloween ---");
        List<Integer> nums = List.of(1,1,2,4,2,7,0,2,4,3,0,23,5,6,77,6);
        System.out.println("La suma de los números entre los ceros de 1,1,2,4,2,7,0,2,4,3,0,23,5,6,77,6 es " + Ejercicios.sumaEntreCeros(nums));
    }
}