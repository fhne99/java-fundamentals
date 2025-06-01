package com.semaine4;
import java.util.Scanner;

public class MulMat {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int lignes = 0;
		int colonnes = 0;
		
		System.out.println("Saisie de la 1ère matrice : ");
		
		while (lignes < 1) {
			System.out.print("Nombre de lignes : ");
			lignes = clavier.nextInt();
		}
		
		while (colonnes < 1) {
			System.out.print("Nombre de colonnes : ");
			colonnes = clavier.nextInt();
		}
				
		double[][] mat1 = new double[lignes][colonnes];		
		
		for (int i = 0; i < lignes; i++) {
		    for (int j = 0; j < colonnes; j++) {
		    	System.out.println("M[" + (i + 1) + "," + (j + 1) + "]=");
		    	mat1[i][j] = clavier.nextDouble();
		    }
		}
		
		lignes = 0;
		colonnes = 0;
		
		System.out.println("Saisie de la 2ème matrice : ");
		
		while (lignes < 1) {
			System.out.print("Nombre de lignes : ");
			lignes = clavier.nextInt();
		}
		
		while (colonnes < 1) {
			System.out.print("Nombre de colonnes : ");
			colonnes = clavier.nextInt();
		}
				
		double[][] mat2 = new double[lignes][colonnes];		
		
		for (int i = 0; i < lignes; i++) {
		    for (int j = 0; j < colonnes; j++) {
		    	System.out.println("M[" + (i + 1) + "," + (j + 1) + "]=");
		    	mat2[i][j] = clavier.nextDouble();
		    }
		}
				
		if (mat1[0].length != mat2.length){
			System.out.print("Multiplication de matrices impossible");			
		} else {
			double[][] prod = new double[mat1.length][mat2[0].length];

			for (int row = 0; row < mat1.length; row++) {
				for (int col = 0; col < mat2[0].length; col++) {
					prod[row][col] = 0.0;
					for (int i = 0; i < mat2.length; i++) {
						prod[row][col] += mat1[row][i] * mat2[i][col];
					}
				}
			}

			System.out.println("Résultat :");
			for (int row = 0; row < prod.length; row++) {
				for (int col = 0; col < prod[row].length; col++) {
					System.out.print(prod[row][col] + " ");
				}
			System.out.println();
			}
		}		
		clavier.close();
	}
}