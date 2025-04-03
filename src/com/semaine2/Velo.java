package com.semaine2;
import java.util.Scanner;

public class Velo {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.print("Donnez l'heure de début de la location (un entier) : ");
        int debut = clavier.nextInt();
        System.out.print("Donnez l'heure de fin de la location (un entier) : ");
        int fin = clavier.nextInt();

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        if ((debut < 0 || debut > 24) || (fin < 0 || fin > 24)) {
            System.out.println("Les heures doivent être comprises entre 0 et 24 !");
        } else if (debut == fin) {
            System.out.println("Bizarre, vous n'avez pas loué votre vélo bien longtemps !");
        } else if (debut > fin) {
            System.out.println("Bizarre, le début de la location est après la fin ...");
        } else {
        	int duree1 = 0;
        	int duree2 = 0;
            double heuresTarif1 = 1.0;
            double heuresTarif2 = 2.0;
            if (0 <= debut && debut <= 7){
            	if (0 <= fin && fin <= 7){
            		duree1 = fin - debut;
            	} else if(7 < fin && fin <= 17){
            		duree1 = 7 - debut;
            		duree2 = fin - 7;
            	} else {
            		duree1 = 7 - debut + fin - 17;
            		duree2 = 10;
            	}
            } else if(7 < debut && debut <= 17){
            	if(7 < fin && fin<= 17){
            		duree2 = fin - debut;
            	} else {
            		duree2 = 17 - debut;
            		duree1 = fin - 17;
            	}
            } else {
            	duree1 = fin - debut;
            }
            	 
            System.out.println("Vous avez loué votre vélo pendant");
            if (duree1 != 0){
            	System.out.println(duree1 + " heure(s) au tarif horaire de " + heuresTarif1 + " franc(s)");
            }
            if (duree2 != 0){
            	System.out.println(duree2 + " heure(s) au tarif horaire de " + heuresTarif2 + " franc(s)");
            }
            System.out.println("Le montant total à payer est de " + ((duree1*heuresTarif1) + (duree2*heuresTarif2)) + " franc(s).");
        }
   
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

        clavier.close();
    }
}
