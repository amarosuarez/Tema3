package sejercicio02;

import java.util.InputMismatchException;
import java.util.Scanner;

import sejercicio01.Suma;

public class Sejercicio02 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números introducidos por el usuario
		int num1, num2;
		double num1d, num2d;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos los números y lo almacenamos
			System.out.println("Introduce un número entero");
			num1 = sc.nextInt();
			
			System.out.println("Introduce otro número entero");
			num2 = sc.nextInt();
			
			System.out.println("Introduce un número con decimales");
			num1d = sc.nextDouble();
			
			System.out.println("Introduce otro número con decimales");
			num2d = sc.nextDouble();
			
			
			System.out.println("El resultado de la suma de enteros es " + Suma.suma(num1, num2));
			
			System.out.println("El resultado de la suma de números con decimales es " + Suma.suma(num1d, num2d));
			
			
		} catch (InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
