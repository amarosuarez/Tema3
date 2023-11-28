package sejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sejercicio03 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números introducidos por el usuario
		int num1, num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos los números y los almacenamos
			System.out.println("Introduzca un número entero");
			num1 = sc.nextInt();
			
			System.out.println("Introduzca otro número entero");
			num2 = sc.nextInt();
			
			System.out.println("La suma de los números desde 1 a " + num1 + " es " + SumaEnteros.sumaEnteros(num1));
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
