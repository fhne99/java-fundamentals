package com.semaine4;

import java.util.ArrayList;

class Cloture {
    public static void main(String[] args) {
        int[][] carte = {
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0},
            {0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,0,0},
            {0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0},
            {0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
        };

        /*******************************************
         * Completez le programme à partir d'ici.
         *******************************************/
        int lignes = carte.length;
        int colonnes = carte[0].length;

        for (int i=0; i<lignes; i++) {
            for (int j=0; j<colonnes; j++) {
                if (carte[i][j] != 0 && carte[i][j] != 1) {
                	System.out.print("Votre carte du terrain n'a pas le bon format :\nvaleur '");
        			System.out.print(carte[i][j]);
        			System.out.print("' trouvée en position [");
        			System.out.print(i);
        	        System.out.print("][");
        	        System.out.print(j);
        	        System.out.println("]");
        	        return;
                }
            }
        }

        boolean[][] visited = new boolean[lignes][colonnes];

        int[] fileI = new int[lignes * colonnes];
        int[] fileJ = new int[lignes * colonnes];
        int debut = 0, fin = 0;

        for (int i=0; i<lignes; i++) {
            if (carte[i][0] == 0) {
                visited[i][0] = true;
                fileI[fin] = i; fileJ[fin] = 0; fin++;
            }
            if (carte[i][colonnes-1] == 0) {
                visited[i][colonnes-1] = true;
                fileI[fin] = i; fileJ[fin] = colonnes-1; fin++;
            }
        }
        for (int j=0; j<colonnes; j++) {
            if (carte[0][j] == 0) {
                visited[0][j] = true;
                fileI[fin] = 0; fileJ[fin] = j; fin++;
            }
            if (carte[lignes-1][j] == 0) {
                visited[lignes-1][j] = true;
                fileI[fin] = lignes-1; fileJ[fin] = j; fin++;
            }
        }

        while (debut < fin) {
            int ci = fileI[debut];
            int cj = fileJ[debut];
            debut++;

            if (ci > 0 && carte[ci-1][cj] == 0 && !visited[ci-1][cj]) {
                visited[ci-1][cj] = true;
                fileI[fin] = ci-1; fileJ[fin] = cj; fin++;
            }
            if (ci < lignes-1 && carte[ci+1][cj] == 0 && !visited[ci+1][cj]) {
                visited[ci+1][cj] = true;
                fileI[fin] = ci+1; fileJ[fin] = cj; fin++;
            }
            if (cj > 0 && carte[ci][cj-1] == 0 && !visited[ci][cj-1]) {
                visited[ci][cj-1] = true;
                fileI[fin] = ci; fileJ[fin] = cj-1; fin++;
            }
            if (cj < colonnes-1 && carte[ci][cj+1] == 0 && !visited[ci][cj+1]) {
                visited[ci][cj+1] = true;
                fileI[fin] = ci; fileJ[fin] = cj+1; fin++;
            }
        }

        for (int i=0; i<lignes; i++) {
            for (int j=0; j<colonnes; j++) {
                if (carte[i][j] == 0 && !visited[i][j]) {
                    carte[i][j] = 1;
                }
            }
        }

        double perimetre = 0.0;
        for (int i=0; i<lignes; i++) {
            for (int j=0; j<colonnes; j++) {
                if (carte[i][j] == 1) {
                    if (i == 0 || carte[i-1][j] == 0) perimetre += 2.5;
                    if (i == lignes-1 || carte[i+1][j] == 0) perimetre += 2.5;
                    if (j == 0 || carte[i][j-1] == 0) perimetre += 2.5;
                    if (j == colonnes-1 || carte[i][j+1] == 0) perimetre += 2.5;
                }
            }
        }

        System.out.print("Il vous faut ");
        System.out.print(perimetre);
        System.out.println(" mètres de clôture pour votre terrain.");


//        System.out.println("Votre carte du terrain n'a pas le bon format :");
//        System.out.print("bord extérieur entrant trouvé en position [");
//        System.out.print("][");
//        System.out.println("]");       

        /*******************************************
         * Ne rien modifier après cette ligne.
         *******************************************/
    }
}

