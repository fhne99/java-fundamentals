package com.semaine1;
import java.util.Scanner;

public class Permutation {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Entrez x: ");
		int x = scanner.nextInt();
		
		System.out.print("Entrez y: ");
		int y = scanner.nextInt();
		
		System.out.println("Avant permutation: \n x: " + x + "\n y: " + y );
		
		int permutation = x;
		x = y;
		y = permutation;
		
		System.out.println("Après permutation: \n x: " + x + "\n y: " + y );
		
		scanner.close();
	}

}
