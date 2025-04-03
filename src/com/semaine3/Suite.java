package com.semaine3;
import java.util.Scanner;

class Suite {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        int debut;
        do {
            System.out.print("de (>= 1) ? ");
            debut = clavier.nextInt();
        } while (debut < 1);

        int fin;
        do {
            System.out.print("a (>= " + debut + ") ? ");
            fin = clavier.nextInt();
        } while (fin < debut);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        for (int i = debut; i <= fin; i++ ) {
        	int k = 0;
        	int nombre = i;
        	while (nombre != 0) {        		
        		if (nombre % 3 == 0) {
        			nombre += 4;
        			k += 1;
        		} else if (nombre % 4 == 0) {
        			nombre /= 2;
        			k += 1;
        		} else {
        			nombre -= 1;
        			k += 1;
        		}	
        	}
        	System.out.println(i + " -> " + k);
        }
        
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
