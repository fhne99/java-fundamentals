package com.semaine3;
import java.util.Scanner;

class Rebonds1 {

	public static void main(String[] args) {
		
        Scanner clavier = new Scanner(System.in);
        
		final double g = 9.81;
		
		double v = 0.0;
		double v1 = 0.0;
		double h = 0.0;
		double h1 = 0.0;
		double H0 = 0.0;
		double eps = 0.0;
		int NBR = 0;
		
		do {
			System.out.print("Coefficient de rebond (0 <= coeff < 1) : ");
			eps = clavier.nextDouble();
		} while ((eps < 0.0) || (eps >= 1.0));
		
		do {
			System.out.print("Hauteur initiale (0 <= H0) : ");
			H0 = clavier.nextDouble();
		} while (H0 < 0.0);
		
		do {
			System.out.print("Nombre de rebonds (0 <= N ) : ");
			NBR = clavier.nextInt();
		} while (NBR < 0);
		
		h = H0;
		
		for (int nombre = 0; nombre < NBR; ++nombre) {	
			v = Math.sqrt(2.0 * h * g);
			v1 = eps * v;
			h1 = (v1 * v1) / (2.0 * g);
			h = h1;
			System.out.println("rebond " + (nombre+1) + " : " + h);
		}
		
		System.out.println("Au " + NBR + "eme rebond, la hauteur sera de " + h );
		clavier.close();
	}
}
