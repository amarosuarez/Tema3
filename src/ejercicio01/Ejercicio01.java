package ejercicio01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Comprobamos que introduzca el valor correctamente
		try {
			// Le pedimos un número y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Mostramos el mensaje por pantalla
			Eco.eco(num);
		} catch (InputMismatchException e) {
			System.out.println("Valor mal introducido");
			sc.nextLine();
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
