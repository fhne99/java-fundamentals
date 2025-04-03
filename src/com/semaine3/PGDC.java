package com.semaine3;
import java.util.Scanner;

class PGDC {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Entrez un nombre positif : ");
		int nb1 = clavier.nextInt();
		System.out.print("Entrez un nombre positif : ");
		int nb2 = clavier.nextInt();
		
		int a = nb1;
		int b = nb2;
		
		while (a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		
		System.out.println("Le plus grand diviseur commun de " + nb1 + " et " + nb2 + " est " + a); 
		
		clavier.close();
	}
}