package sejercicio05;

import java.util.Random;

public class NumAleatorios {

	public static void numAleatorios(int cantidad) {
		for (int i=0; i<cantidad; i++) {
			Random random = new Random();
			int num = random.nextInt(0,2);
			System.out.println(num);
		}
	}
	
	public static void numAleatorios(int cantidad, int valorMaximo) {
		for (int i=0; i<cantidad; i++) {
			Random random = new Random();
			int num = random.nextInt(0,valorMaximo+1);
			System.out.println(num);
		}
	}
	
	public static void numAleatorios(int cantidad, int valorMinimo, int valorMaximo) {
		for (int i=0; i<cantidad; i++) {
			Random random = new Random();
			int num = random.nextInt(valorMinimo,valorMaximo+1);
			System.out.println(num);
		}
	}
	
}
