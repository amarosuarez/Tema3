package ejercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números
		int num1, num2;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Le pedimos los números y los guardamos
			System.out.println("Introduzca el primer número");
			num1 = sc.nextInt();
			System.out.println("Introduzca el segundo número");
			num2 = sc.nextInt();
			
			// Imprimimos el mensaje por pantalla
			System.out.println("El máximo entre " + num1 + " y " + num2 + " es " + MaxNum.maxNum(num1, num2));
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
