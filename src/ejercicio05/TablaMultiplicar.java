package ejercicio05;

public class TablaMultiplicar {

	public static void tabla(int num) {
		System.out.println("La tabla del " + num + " es: ");
		for (int i=0; i<=10; i++) {
			System.out.println(num +" * " + i + " = " + i*num);
		}
	}
	
}
