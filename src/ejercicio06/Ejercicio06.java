package ejercicio06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde se almacenará la opción
		int opcion;
		
		// Variable donde se almacenará el radio
		double radio;
		
		// Variable donde se almcanerá la altura
		double altura;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			do {
				// Le pedimos la opción y la guardamos
				System.out.println("¿Qué deseas hacer? 1 para el área ó 2 para el volumen");
				opcion = sc.nextInt();
				
				// Le pedimos el radio y la altura y la almacenamos
				System.out.println("Introduzca el radio");
				radio = sc.nextDouble();
				System.out.println("Introduzca la altura");
				altura = sc.nextDouble();
				
				// Llamamos a la función
				Calculos.calculo(opcion, radio, altura);
				
			} while(opcion < 1 || opcion > 2);
			
		} catch(InputMismatchException e) {
			System.out.println("Datos incorrectos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
