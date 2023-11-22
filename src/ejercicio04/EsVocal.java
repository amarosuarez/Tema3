package ejercicio04;

public class EsVocal {

	public static boolean esVocal(String s) {
		boolean esVocal = switch (s.toLowerCase()) {
			case "a", "e", "i", "o", "u"  -> true;
			default -> false;
		};
		
		return esVocal;
	}
	
}
