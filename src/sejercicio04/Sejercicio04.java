package sejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sejercicio04 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números
		int num1;
		// Variable donde se almacenará la cadena de texto
		String cadena;
		
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos los números y los almacenamos
			System.out.println("Introduzca un número entero");
			num1 = sc.nextInt();
			
			// Imprimimos el mensaje por pantalla
			System.out.println(ParseToBoolean.parseToBoolean(num1));
			
			System.out.println("Escriba true o false");
			cadena = sc.next();
			
			// Imprimimos el mensaje por pantalla
			System.out.println(ParseToBoolean.parseToBoolean(cadena));
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
