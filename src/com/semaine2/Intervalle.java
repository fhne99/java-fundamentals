package com.semaine2;
import java.util.Scanner;

class Intervalle {
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);

		System.out.print("Entrez un réel : " );

		double x = clavier.nextDouble();
		if ((!(x < 2.0) && (x < 3.0))
				|| (!(x < 0.0) && !(x == 0.0) && ((x < 1.0) || (x == 1.0)))
				|| (!(x < -10.0) && ((x < -2.0) || (x == -2.0)))) {
			System.out.println("x appartient a I") ;
		} else {
			System.out.println("x n'appartient pas a I");
		}
		clavier.close();
	}
}