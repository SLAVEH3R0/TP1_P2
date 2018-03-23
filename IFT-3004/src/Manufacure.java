import java.util.Scanner;

public class Manufacure {

	public static void main(String[] args) {
		
		int nbBocaux = -1;
		int nbValves = -1;
		int nbEtiqueteuses = -1;
		String ext;
		Scanner reader = new Scanner(System.in);
		
		//Décision du nombre de bocaux de chaque type donc nbBocaux de chaques type
		System.out.println ("Entrer le nombre de Bocaux de chaque type : ");
		nbBocaux = reader.nextInt();
		
		//Décision du nombre de valves de la manufacture
		System.out.println ("Entrer le nombre de valves : ");
		nbValves = reader.nextInt();
		
		//Décision du nombre d'etiqueteusse de la manufacture
		System.out.println ("Entrer le nombre d'étiquetteuses : ");
		nbEtiqueteuses = reader.nextInt();

		System.out.println ("Manufacture avec : " + nbBocaux*2 + " Bocaux, " + nbValves + " Valves et " + nbEtiqueteuses + " Etiqueteusses.");
		
		//Création Bocaux
		for(int b = 0; b <= nbBocaux ; b++) {
			BocalR bocalA = new BocalR("a",b);
			BocalR bocalB = new BocalR("b",b);
		}
	
		//Création valves
		/*for(int b = 0; b <= nbBocaux ; b++) {
			BocalR String.join(Integer.toString(b) + ".a.bocal") = new BocalR("a");
		}

		//Création etiquetteuses
		for(int b = 0; b <= nb ; b++) {
			BocalR String.join(Integer.toString(b) + ".a.bocal") = new BocalR("a");
		}*/
	
	}
}
