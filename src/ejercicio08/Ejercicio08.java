package ejercicio08;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número
		int num;
		
		// Variable donde se almacena el número de divisores
		int contador;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos el número al usuario y lo almacenamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Inicializamos la variable contador
			contador = NumerosDivisoresPrimos.numerosDivisoresPrimos(num);
			
			// Imprimimos el mensaje
			System.out.println("El " +  num + " tiene " + 
					contador + (contador>1 ? " números primos" : " número primo"));
			
		} catch (InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
