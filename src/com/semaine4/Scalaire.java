package com.semaine4;
import java.util.Scanner;

public class Scalaire {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int nMax = 10;		
		int n = 0;
		
        while (n < 1 || n > nMax) {
        	System.out.print("Entrez la taille effective des vecteurs (entre 1 et " + nMax + ") : ");
            n = clavier.nextInt();
        }  
        
        double[] v1 = new double[nMax];
		double[] v2 = new double[nMax];
        
        for (int i = 0; i < n; i++) {
        	System.out.print("v1[" + i + "] = ");
            v1[i] = clavier.nextDouble();           
        }
        
        for (int i = 0; i < n; i++) {
        	System.out.print("v2[" + i + "] = ");
            v2[i] = clavier.nextDouble();
        }        
        
        double produitScalaire = 0.0;
        
        for (int i = 0; i < v1.length; i++) {
        	produitScalaire += v1[i] * v2[i];
        }
        
        System.out.println("Le produit scalaire de v1 par v2 vaut " + produitScalaire);        
        
        clavier.close();
	}
}
