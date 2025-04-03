package com.semaine3;
import java.util.Scanner;

class Parachutiste {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        double masse = 80.0;
        do {
            System.out.print("masse du parachutiste (>= 40) ? ");
            masse = clavier.nextDouble();
        } while (masse < 40.0);

        double h0 = 39000.0;
        do {
            System.out.print("hauteur de depart du parachutiste (>= 250) ? ");
            h0 = clavier.nextDouble();
        } while (h0 < 250.0);

        /*******************************************
         * Completez le programme a partir d'ici.
         *******************************************/
        final double g = 9.81;
        double v0 = 0;
        double t0 = 0;

        double hauteur = h0;
        double vitesse = v0;
        double accel = g;
        double t = t0;
        double surface = 2.0;

        boolean vitesseSonDepassee = false;
        boolean accelMax = false;
        boolean parachuteOuvert = false;

        System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);

        while (hauteur >= 0) {
            t++;
            double s = surface / masse;
            double q = Math.exp(-s * (t - t0));

            vitesse = (g / s) * (1 - q) + v0 * q;
            hauteur = h0 - (g / s) * (t - t0) - ((v0 - g / s) / s) * (1 - q);
            accel = g - s * vitesse;

            if (!vitesseSonDepassee && vitesse > 343) {
                System.out.println("## Felix depasse la vitesse du son");
                vitesseSonDepassee = true;
            }

            if (!accelMax && accel < 0.5) {
                System.out.println("## Felix a atteint sa vitesse maximale");
                accelMax = true;
            }

            if (!parachuteOuvert && hauteur < 2500) {
                System.out.println("## Felix ouvre son parachute");
                surface = 25.0;
                t0 = t;
                v0 = vitesse;
                h0 = hauteur;
                parachuteOuvert = true;
            }

            if (hauteur >= 0) {
                System.out.printf("%.0f, %.4f, %.4f, %.5f\n", t, hauteur, vitesse, accel);
            }
        } 
        /*******************************************
         * Ne rien modifier apres cette ligne.
         *******************************************/
        clavier.close();
    }
}
