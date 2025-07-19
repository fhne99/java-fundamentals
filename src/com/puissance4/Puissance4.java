package com.puissance4;
import java.util.Scanner;

public class Puissance4 {
	
	private final static int VIDE = 0;
	private final static int JAUNE = 1;
	private final static int ROUGE = 2;
	private static Scanner clavier = new Scanner(System.in);
	
	// Valeur VIDE occupe toutes les cases de la grille au départ
	static void initialise(int [][] grille) 
	{
		for(int i = 0; i < grille.length; ++i) {
			for(int j = 0; j < grille[0].length; ++j) {
				grille[i][j] = VIDE;
			}
		}						
	}
			
	// Affiche 0 pour case rouge, X pour une case jaune		
	static void affiche(int [][] grille) 
	{
		System.out.println();
		for(int[] ligne : grille) {			
			System.out.print(" |");
			for(int cellule : ligne) {
				if (cellule == VIDE) {			
					System.out.print(' ');
				} else if (cellule == ROUGE) {
					System.out.print('0');
				} else {
					System.out.print('X');
				}
				System.out.print('|');
			}
			System.out.println();
		}
		// Affichage numéro de colonne
		System.out.print('=');
		for(int i = 1; i <= grille[0].length; ++i) {
			System.out.print("=" + i);
		}
		System.out.println("==\n");
	}
	
	// Vérifier si le coup est valide -> retourne true ou false
	static boolean joue(int [][] grille, int colonne, int couleur)
	{
//		// on parcourt la colonne en partant du bas jusqu'à trouver une case vide :
//		// ou jusqu'en haut de la colonne si la colonne est pleine :
//		int ligne = grille.length - 1;
//		
//		// pour éviter de dépasser du tableau
//		while ((ligne >= 0) && (grille[ligne][colonne] != VIDE)){
//			--ligne;		
//		}
//		
//		// si on n'est pas arrivé jusqu'en haut de la colonne, on remplit la case vide trouvée,
//		// sinon c'est que la colonne est pleine et le coup n'est pas validé
//		if (ligne >= 0) {
//			grille[ligne][colonne] = couleur;
//			return true;
//		} else {
//			return false;
//		}	
		
		// ALTERNATIVE
		// si le numéro de colonne n'est pas valide, le coup n'est pas valide :
		if(colonne >= grille[0].length) {
			return false;			
		}
		// si la colonne est pleine, le coup n'est pas valide
		if(grille[0][colonne]!= VIDE) {
			return false;
		}
		
		// on parcourt la colonne en partant du bas jusqu'à trouver une case vide
		int ligne = grille.length - 1;
		while (grille[ligne][colonne] != VIDE) {
			--ligne;
		}
		// on remplit la case vide trouvée
		grille[ligne][colonne] = couleur;
		return true;
	}
	
	static void demandeEtJoue(int[][] grille, int couleurJoueur)
	{
		boolean valide;
		do {
			System.out.print("Joueur ");
			if (couleurJoueur == JAUNE) {
				System.out.print("X");
			} else {
				System.out.print("0");
			}
			System.out.print(" : entrez un numéro de colonne ");
			
			int colonne = clavier.nextInt();
			// les indices des tableaux commencent par 0
			-- colonne;
			valide = joue(grille, colonne, couleurJoueur);
			if (!valide) {
				System.out.println(" > Ce coup n'est pas valide");
			}	
		} while(!valide);
	}
	
	static int compte(int[][] grille, int ligneDepart, int colonneDepart, int dirLigne, int dirColonne)
	{
		int compteur = 0;
		int ligne = ligneDepart;
		int colonne = colonneDepart;
		
		while(grille[ligne][colonne] == grille[ligneDepart][colonneDepart] &&
				ligne >= 0 && ligne < grille.length &&
				colonne >= 0 && colonne < grille[ligne].length) {
			++compteur;
			ligne = ligne + dirLigne;
			colonne = colonne + dirColonne;
		}
		return compteur;
	}
	
	static boolean estCeGagne(int[][] grille, int couleurJoueur)
	{
		for(int ligne = 0; ligne < grille.length; ++ligne) {
			for(int colonne = 0; colonne < grille[ligne].length; ++colonne) {
				int couleurCase = grille[ligne][colonne];
				if (couleurCase == couleurJoueur) {
					final int ligneMax = grille.length - 4;
					final int colonneMax = grille[ligne].length - 4;
					if (
							(ligne >=3 && colonne <= colonneMax && compte(grille, ligne, colonne, -1, +1) >= 4) ||
							(colonne <= colonneMax && compte(grille, ligne, colonne, 0, +1) >= 4) ||
							(ligne <= ligneMax && colonne <= colonneMax && compte(grille, ligne, colonne, +1, +1) >= 4) ||
							(ligne <= ligneMax && compte(grille, ligne, colonne, +1, 0) >= 4)
					) {
						return true;
					}
				}
			}
		}
		
		return false;		
	}
	
	static boolean plein(int[][] grille)
	{
		// Si on trouve une case vide sur la première ligne, la grille n'est pas pleine
		for(int cellule : grille[0]) {
			if(cellule == VIDE) {
				return false;
			}
		}
		// Sinon la grille est pleine
		return true;
	}
	
	public static void main(String[] args) {		
		// Tableau à 2 dimensions pour représenter la grille
		int [][] grille = new int[6][7];
		initialise(grille);
		affiche(grille);
		
		boolean gagne;		
		int couleurJoueur = JAUNE;
		do {
			demandeEtJoue(grille, couleurJoueur);
			
			affiche(grille);
			
			gagne = estCeGagne(grille, couleurJoueur);
			// on change la couleur pour la couleur de l'autre
			if (couleurJoueur == JAUNE) {
				couleurJoueur = ROUGE;					
			} else {
				couleurJoueur = JAUNE;
			}
		} while(!gagne && !plein(grille));
		
		if (gagne) {
			if(couleurJoueur == JAUNE) {
				System.out.println("Le joueur 0 a gagné!");
			} else {
				System.out.println("Le joueur X a gagné!");
			}			
		} else {
			System.out.println("Match nul!");
		}
		
	}
}
