package com.semaine1;
import java.util.Scanner;

class Age {

	public static void main(String[] args) {
		final int ANNEE_COURANTE = 2025;
		
		System.out.println("Donnez votre âge : ");		
		
		Scanner scanner = new Scanner(System.in);
		
		int age = scanner.nextInt();
		
		int annee = ANNEE_COURANTE - age;
		
		System.out.println("Votre année de naissance est : " + annee);
	
		scanner.close();
	}
}
