package com.semaine3;
import java.util.Scanner;

public class Rebonds2 {
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		final double g = 9.81;

		double v = 0.0;
		double v1 = 0.0;

		double h = 0.0;
		double h1 = 0.0;
		double h0 = 0.0;
		double eps = 0.0;
		double h_fin = 0.0;

		do {
			System.out.print("Coefficient de rebond (0 <= coeff < 1) : ");
			eps = clavier.nextDouble();
		} while ((eps < 0.0) || (eps >= 1.0));

		do {
			System.out.print("Hauteur initiale (0 <= H0) : ");
			h0 = clavier.nextDouble();
		} while (h0 < 0.0);

		do {
			System.out.println("Hauteur finale (0 <= h_fin ) : ");
			h_fin = clavier.nextDouble();
		} while (h_fin < 0.0 || h_fin > h0);

		
		h = h0;
		int count = 0;

		do {
			v = Math.sqrt(2.0 * g * h);
			v1 = eps * v;
			count++;
			h1 = (v1 * v1) / (2.0 * g);
			h = h1;
			System.out.println("rebond " + count + " : " + h );
		} while (h1 > h_fin);

		System.out.println("Nombre de rebonds :" + count);
		clavier.close();
	}
}