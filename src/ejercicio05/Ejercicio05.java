package ejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número introducido
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos el número al usuario y lo almacenamos
			System.out.println("Introduzca un número:");
			num = sc.nextInt();
			
			// Imprimimos el mensaje
			TablaMultiplicar.tabla(num);
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
