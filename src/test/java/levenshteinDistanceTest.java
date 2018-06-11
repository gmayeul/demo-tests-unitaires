public class levenshteinDistanceTest {
	public static void main(String args[]) {
		System.out.println(testAjouterCaractere()?"Réussite":"Echec");
		System.out.println(testRemplacerCaractere()?"Réussite":"Echec");
		System.out.println(testRetirerCaractere()?"Réussite":"Echec");
		System.out.println(testPermutterCaracteres()?"Réussite":"Echec");
	}
	
	public static boolean testAjouterCaractere() {
		return StringUtils.levenshteinDistance("chat", "chats") == 1;
	}
	
	public static boolean testRemplacerCaractere() {
		return StringUtils.levenshteinDistance("machins", "machine") == 1;
	}
	
	public static boolean testRetirerCaractere() {
		return StringUtils.levenshteinDistance("avion", "Jean-Pierre Coffe") == 1;
	}
	
	public static boolean testPermutterCaracteres() {
		return StringUtils.levenshteinDistance("Chien", "Chine") == 2;
	}

}
