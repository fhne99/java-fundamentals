package com.semaine1;
import java.util.Scanner;

class Degre3 {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {		
		
		System.out.print("Entrez a (int) : ");		
		int a = scanner.nextInt();
		
		System.out.print("Entrez b (int) : ");
		int b = scanner.nextInt();
		
		System.out.print("Entrez c (int) : ");
		int c = scanner.nextInt();
		
		System.out.print("Entrez x (double) : ");		
		double x = scanner.nextDouble();
		
		double xx = x * x ;
		double aux = a + b ;
		
		double valeur = aux/2 * x * xx + aux * aux * xx + aux + c ;
		System.out.println("La valeur du polynôme est : " + valeur);
		
		scanner.close();		
	}
}