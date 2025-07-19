package com.semaine4;

class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        
        int[] tabResult =  new int[taille];
        
        for (int i = 0; i < taille ; i++) {
        	int x = tab1[i];
        	int count = 0;

            for (int j = 0; j < taille; j++) {
            	if (tab1[j] == x) {
            		count++;
            	}      
            }
            tabResult[i] = count;
            System.out.println("La valeur " + x + " apparaît " + count + " fois");
        }
        
        System.out.println();

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
