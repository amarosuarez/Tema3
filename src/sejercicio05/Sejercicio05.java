package sejercicio05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sejercicio05 {

	public static void main(String[] args) {
		// Variables donde se almacenarán los números introducidos
		int cantidad, valorMinimo, valorMaximo;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos los números y los almacenamos
			System.out.println("Introduzca la cantidad de números aleatorios a generar");
			cantidad = sc.nextInt();
			System.out.println("Introduzca el valor mínimo");
			valorMinimo = sc.nextInt();
			System.out.println("Introduzca el valor máximo");
			valorMaximo = sc.nextInt();
			
			// Imprimimos por pantalla
			System.out.println("Solo cantidad");
			NumAleatorios.numAleatorios(cantidad);
			System.out.println("Cantidad y valor máximo");
			NumAleatorios.numAleatorios(cantidad, valorMaximo);
			System.out.println("Cantidad, valor minimo, valor maximo");
			NumAleatorios.numAleatorios(cantidad, valorMinimo, valorMaximo);
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
