import java.util.Scanner;

public class Manufacure {

	public static void main(String[] args) {
		
		int nbBocaux = -1;
		int nbValves = -1;
		int nbEtiqueteuses = -1;
		String ext;
		Scanner reader = new Scanner(System.in);
		
		//D�cision du nombre de bocaux de chaque type donc nbBocaux de chaques type
		System.out.println ("Entrer le nombre de Bocaux de chaque type : ");
		nbBocaux = reader.nextInt();
		
		//D�cision du nombre de valves de la manufacture
		System.out.println ("Entrer le nombre de valves : ");
		nbValves = reader.nextInt();
		
		//D�cision du nombre d'etiqueteusse de la manufacture
		System.out.println ("Entrer le nombre d'�tiquetteuses : ");
		nbEtiqueteuses = reader.nextInt();

		System.out.println ("Manufacture avec : " + nbBocaux*2 + " Bocaux, " + nbValves + " Valves et " + nbEtiqueteuses + " Etiqueteusses.");
		
		//Cr�ation Bocaux
		for(int b = 0; b <= nbBocaux ; b++) {
			BocalR bocalA = new BocalR("a",b);
			BocalR bocalB = new BocalR("b",b);
		}
	
		//Cr�ation valves
		/*for(int b = 0; b <= nbBocaux ; b++) {
			BocalR String.join(Integer.toString(b) + ".a.bocal") = new BocalR("a");
		}

		//Cr�ation etiquetteuses
		for(int b = 0; b <= nb ; b++) {
			BocalR String.join(Integer.toString(b) + ".a.bocal") = new BocalR("a");
		}*/
	
	}
}
