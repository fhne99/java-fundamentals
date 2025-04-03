package com.semaine1;
import java.util.Scanner;

public class Fondue {

	public static void main(String[] args) {
		final int BASE = 4 ;
		double fromage = 800.0 ;
		double eau = 2.0 ;
		double ail = 2.0 ;
		double pain = 400.0 ;
		
		System.out.print("Entrez le nombre de personne(s) conviées à la fondue : ");
		Scanner scanner = new Scanner(System.in);
		int nbConvives = scanner.nextInt();
				
		// Code avant la correction
		// double fromageNecessaire = (fromage * nbConvives / BASE );
		// double eauNecessaire = (eau * nbConvives / BASE );
		// double ailNecessaire = (ail * nbConvives / BASE );
		// double painNecessaire = (pain * nbConvives / BASE );
		
		double ratio = nbConvives;
		
		ratio /= BASE;
		fromage *= ratio;
		eau *= ratio;
		ail *= ratio;		
		
		System.out.println("Pour faire une fondue fribourgeoise pour " + nbConvives + " personnes, il vous faut : \n - "
				+ fromage + " gr de Vacherin frigourgeois \n - "
				+ eau + " dl d'eau \n - "
				+ ail + " gousse(s) d'ail \n - "
				+ pain + " gr de pain \n -"
				+ " du poivre à volonté");
		
		scanner.close();
	}

}
