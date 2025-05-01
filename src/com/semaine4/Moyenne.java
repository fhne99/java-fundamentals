package com.semaine4;
import java.util.Scanner;

class Moyenne {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int nombreEtudiants;
		System.out.print("Donnez le nombre d'etudiants : ");
		nombreEtudiants = scanner.nextInt();
		
		double somme = 0.0;
		double [] notes = new double[nombreEtudiants];	
		
		for(int i = 0; i < nombreEtudiants ; ++i) {
			System.out.print("Note étudiant " + i + " : ");
			notes[i] = scanner.nextDouble();
			somme = somme + notes[i];
		}
		
		double moyenne = somme / nombreEtudiants;
		
		System.out.println("Moyenne de classe : " + moyenne);
		System.out.println(" Etudiant : note (ecart a la moyenne)");
		
		for(int i = 0; i < nombreEtudiants ; ++i) {
			System.out.println( " " + i + " : " + notes[i] + " ("
					+ (notes[i] - moyenne) + ")");			
		}
	}
}
