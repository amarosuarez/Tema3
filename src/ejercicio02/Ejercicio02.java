package ejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	public static void main(String[] args) {
		// Variables donde se almacenan los números
		int num1, num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Le pedimos los números y los guardamos
			System.out.println("Introduzca el primer número:");
			num1 = sc.nextInt();
			System.out.println("Introduzca el segundo número:");
			num2 = sc.nextInt();
			
			// Llamamos a la función
			NumComprendidos.numComprendidos(num1, num2);
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
