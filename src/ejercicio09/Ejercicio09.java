package ejercicio09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números
		double num1, num2;
		// Variable donde se almacenará la opcion
		int opcion;
		
		String opcionElegida;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos los números y los almacenamos
			System.out.println("Introduzca un número");
			num1 = sc.nextDouble();
			System.out.println("Introduzca otro número");
			num2 = sc.nextDouble();
			
			// Le preguntamos que quiere hacer
			System.out.println("¿Qué deseas hacer? 1. Suma 2. Resta 3. Multiplicación 4. División");
			opcion = sc.nextInt();
			
			opcionElegida = switch(opcion) {
				case 1 -> "suma";
				case 2 -> "resta";
				case 3 -> "multiplicación";
				case 4 -> "división";
				default -> "suma";
			};
			
			// Imprimimos los mensajes por pantalla
			
			System.out.println("El resultado de la " + opcionElegida +
					" es " + Calculadora.calculadora(opcion, num1, num2));
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		} catch(ArithmeticException e) {
			System.out.println("No se puede dividir");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
