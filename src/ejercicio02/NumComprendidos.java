package ejercicio02;

public class NumComprendidos {
	
	public static void numComprendidos(int num1, int num2) {
		
		int primer = num1<num2 ? num1 : num2;
		int segundo = num2>num1 ? num2 : num1;
		
		System.out.print("Entre el " + primer + " y el " + segundo + " están el ");
		
		for (int i=primer+1; i<segundo; i++) {
			System.out.print(i<segundo-1 ? i+", " : i);
		}
	}
	
}
