package sejercicio03;

public class SumaEnteros {

	public static int sumaEnteros(int num1) {
		
		int suma=0;
		
		for (int i=1; i<=num1; i++) {
			suma+=i;
		}
		
		return suma;
	}
	
	public static int sumaEnteros(int num1, int num2) {
		int min = Math.min(num1, num2);
		int max = Math.max(num1, num2);
		
		int suma = 0;
		
		for (int i=min+1; i<max; i++) {
			suma+=i;
		}
		
		return suma;
	}
	
}
