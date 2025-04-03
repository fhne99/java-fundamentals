package com.semaine1;
import java.util.Scanner;

public class RoseBlanches {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Combien avez-vous reçu d'argent (Frs) ? ");
		int budget = scanner.nextInt();
		
		int budgetLivres = budget * 3 / 4;		
		int resteBudget = budget - budgetLivres;
		
		int autre = resteBudget / 3;
			
		int nbCafes = autre / 2;
		int nbFlash = autre / 4;
		int nbBillets = autre / 3;
		
		int reste = autre % 2 + autre % 4 + autre % 3 + resteBudget % 3;
		
		System.out.println("Livre et Fournitures: " + budgetLivres + " Frs");		
		System.out.println("Il vous reste : " + resteBudget + " Frs");
		System.out.println("Vous pouvez ensuite acheter :");
		System.out.println(nbCafes + " cafés");
		System.out.println(nbFlash + " numéros du Flash Informatique");
		System.out.println(nbBillets + " billets de métro");
		System.out.println("et il vous restera " + reste + " Frs pour les roses blanches.");
		
		scanner.close();
	}

}
