package ejercicio07;

public class EsPrimo {

	public static boolean esPrimo(int n) {
		boolean esPrimo = true;
		
		for(int i=2; i<n ;i++) {
			// Comprueba si es divisible entre cualquier numero que no sea 1 ni el mismo
	        if(n%i==0) return false;
	    }
		
		return esPrimo;
	}
	
}
