package sejercicio04;

public class ParseToBoolean {
	public static boolean parseToBoolean(int num1) {
		boolean esUno = false;
		
		if (num1==1) esUno = true;
		
		return esUno;
	}
	
	public static boolean parseToBoolean(String cadena) {
		boolean esUno = false;
		
		if (cadena.toLowerCase().equals("true")) esUno = true;
		
		return esUno;
	}
}
