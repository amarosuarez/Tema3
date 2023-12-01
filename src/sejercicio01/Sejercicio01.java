package sejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

import sejercicio02.Media;

public class Sejercicio01 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números
		int num1, num2;
		double num1d, num2d;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			// Le pedimos al usuario los números  y lo almacenamos
			System.out.println("Introduce un número entero");
			num1 = sc.nextInt();
			
			System.out.println("Introduce otro número entero");
			num2 = sc.nextInt();
			
			System.out.println("Introduce un número con decimales");
			num1d = sc.nextDouble();
			
			System.out.println("Introduce otro número con decimales");
			num2d = sc.nextDouble();
			
			// Imprimimos los mensajes por pantalla
			System.out.println("El resultado de la media de enteros es " + Suma.suma(num1, num2));
			
			System.out.println("El resultado de la media de números con decimales es " + Suma.suma(num1d, num2d));
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
