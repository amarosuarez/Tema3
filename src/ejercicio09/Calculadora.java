package ejercicio09;

public class Calculadora {

	public static double calculadora(int opcion, double num1, double num2) {
		double resultado = 0.0;
		
		
		resultado = switch(opcion) {
			case 1 -> num1 + num2;
			case 2 -> num1 - num2;
			case 3 -> num1 * num2;
			case 4 -> num1 / num2;
			default -> num1 + num2;
		};
		
		return resultado;
	}
	
}
