package ejercicio06;

public class Calculos {

	public static double calculo(int opcion, double radio, double altura) {
		double operacion=0;
		
		switch (opcion) {
			case 1 -> {
				operacion = 2*Math.PI * radio * (altura+radio);
			}
			case 2 -> {
				operacion = Math.PI * Math.pow(radio, 2) * altura; 
			}
		}
		
		return operacion;
		
	}
	
}
