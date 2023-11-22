package ejercicio06;

public class Calculos {

	public static void calculo(int opcion, double radio, double altura) {
		double operacion;
		
		switch (opcion) {
			case 1 -> {
				operacion = 2*Math.PI * radio * (altura+radio);
				System.out.println("El área es " + operacion);
			}
			case 2 -> {
				operacion = Math.PI * Math.pow(radio, 2) * altura; 
				System.out.println("El volumen es " + operacion);
			}
		}
		
	}
	
}
