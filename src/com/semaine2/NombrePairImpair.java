package com.semaine2;
import java.util.Scanner;

public class NombrePairImpair {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Entrez un nombre entier : ");
		int number = scanner.nextInt();

		if (number == 0) {
			System.out.println("Le nombre est zéro (et il est pair)");
		} else {
			if (number < 0) {
				System.out.print("Le nombre est négatif ");
			} else {
				System.out.print("Le nombre est positif ");
			}
			int reste = number % 2;
			if (reste == 0) {
				System.out.println("et pair");
			} else {
				System.out.println("et impair");
			}
		}
		scanner.close();
	}
}