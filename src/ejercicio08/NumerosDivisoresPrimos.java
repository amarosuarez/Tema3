package ejercicio08;

import ejercicio07.EsPrimo;

public class NumerosDivisoresPrimos {

	public static int numerosDivisoresPrimos(int num) {
		int contador=0;
		
		for(int i=2; i<num ;i++) {
			// Comprueba si es divisible entre cualquier numero que no sea 1 ni el mismo
	        if(num%i==0 && EsPrimo.esPrimo(i)) {
	        	contador++;
	        }
	    }
		
		return contador;
	}
	
}
