package ejercicio07;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variable donde almacenaremos el número
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos el número y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Imprimimos el mensaje
			System.out.println("El " + num +  (EsPrimo.esPrimo(num) ? " es primo!" : " no es primo..."));
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
