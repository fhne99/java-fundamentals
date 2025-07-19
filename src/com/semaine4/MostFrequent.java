package com.semaine4;

class MostFrequent {

    public static void main(String[] args) {
        int[] tab1 = {2, 7, 5, 6, 7, 1, 6, 2, 1, 7, 6};
        int taille = tab1.length;

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        int maxCount = 0;
        int mostFrequent = tab1[0];

        for (int i = 0; i < taille; i++) {
            int count = 0;
            for (int j = 0; j < taille; j++) {
                if (tab1[j] == tab1[i]) {
                    count++;
                }
            }
            
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = tab1[i];
            }
        }
        System.out.println("Le nombre le plus frequent dans le tableau est le :");
        System.out.print(mostFrequent + " (" + maxCount + " x)");

        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/

    }
}
