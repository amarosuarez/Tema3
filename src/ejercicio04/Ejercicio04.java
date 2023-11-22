package ejercicio04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variables donde se almacenaraá el cáracter
		String caracter;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		try {
			
			// Le pedimos el carácter y lo almacenamos
			System.out.println("Introduzca el carácter");
			caracter = sc.next();
			
			// Imprimimos el mensaje por pantalla
			System.out.println(EsVocal.esVocal(caracter) ? "Correcto! Es vocal" : "Incorrecto... no es vocal");
			
		} catch(InputMismatchException e) {
			System.out.println("Datos erróneos");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
