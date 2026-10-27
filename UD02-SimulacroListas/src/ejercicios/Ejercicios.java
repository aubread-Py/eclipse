package ejercicios;

import java.util.List;
import utiles.Utiles;

public class Ejercicios {

    // 1. Sumar una lista mediante for-each.
    public static Integer suma1(List<Integer> numeros) {
        Integer suma = 0;

        for (Integer numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    // 2. Sumar una lista mediante for clásico (con índice).
    public static Integer suma2(List<Integer> numeros) {
        Integer suma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return suma;
    }

    // 3. Sumar una lista mediante while.
    public static Integer suma3(List<Integer> numeros) {
        Integer suma = 0;
        int i = 0;

        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return suma;
    }

    // 4. Contar los números pares, incluido el 0.
    public static Integer contarPares(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                contador++;
            }
        }

        return contador;
    }

    // 5. Contar los números primos mediante la clase Utiles.
    public static Integer contarPrimos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPrimo(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 6. Contar los números perfectos mediante la clase Utiles.
    public static Integer contarPerfectos(List<Integer> numeros) {
        Integer contador = 0;

        for (Integer numero : numeros) {
            if (Utiles.esPerfecto(numero)) {
                contador++;
            }
        }

        return contador;
    }

    // 7. Calcular la media mediante for-each.
    public static Double media1(List<Integer> numeros) {
     
        Integer suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }

        return (double) suma / numeros.size();
    }

    // 8. Calcular la media mediante for clásico.
    public static Double media2(List<Integer> numeros) {

        Integer suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            suma += numeros.get(i);
        }

        return (double) suma / numeros.size();
    }

    // 9. Calcular la media mediante while.
    public static Double media3(List<Integer> numeros) {

        Integer suma = 0;
        int i = 0;
        while (i < numeros.size()) {
            suma += numeros.get(i);
            i++;
        }

        return (double) suma / numeros.size();
    }
    
    //TODO Hacer aquí los ejercicios del examen 
    //los haremos con distintos bucles
    //1
    public static boolean puedeEntrar(Integer edad, Boolean acompanado,String criatura){
		return criatura.equals("Vampiro") || edad >= 18 || acompanado;
	}
    //2
    public static Integer cuentaCaramelos(List<String> caramelos, String tipo){
    	Integer total = 0;
    	for (int i = 0; i < caramelos.size(); i++) {
			if (caramelos.get(i).equals(tipo)) {
				total += 1;
			}
		}
    	return total;
    }
    //3
    public static Integer pasosLaberinto(List<Integer> pasos){
    	Integer avance = 0;
    	Integer suma = 0;
    	while (pasos.get(avance) >= 0) {
			suma += pasos.get(avance);
			avance += 1;
    	}
    	return suma;
    }
    //4
    public static Double promedioMagia(List<Integer> niveles) {
    	Double suma = 0.0;
    	Double divisor = 0.0;
    	for (int i = 0; i < niveles.size(); i++) {
			if (niveles.get(i) >= 5) {
				suma += niveles.get(i);
				divisor += 1;
			}
		}
    	return suma/divisor;
    }
    //5
    public static void cuentaAtrasSustos(Integer n){
    	if (n > 0) {
    		System.out.println("boo" + n);
    		n -= 1;
    		cuentaAtrasSustos(n);
		}
    	else {
			System.out.println("Susto final");
		}
    }
    //6
    public static Integer sumaEntreCeros(List<Integer> numeros){
    	Integer sum = 0;
    	for (int i = numeros.indexOf(0) + 1; i < numeros.size(); i++) {
			sum += numeros.get(i);
			if (numeros.get(i) == 0){
				break;
			}
		}
    	return sum;
    }
}