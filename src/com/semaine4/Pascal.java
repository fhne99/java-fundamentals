package com.semaine4;
import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;

		System.out.println("Taille du triangle de Pascal : ");
		n = scanner.nextInt();		
		
		int[][] triangle = new int[n][];

		triangle[0] = new int[1];
		triangle[0][0] = 1;
		for (int row = 1; row < n; row++) {
			triangle[row] = new int [triangle[row - 1].length + 1];
			for (int col = 0; col <= row; col++) {
				if ((col == 0) || (col == row)) {
					triangle[row][col] = 1;
				} else {
					triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
				}
			}
		}

		for (int row = 0; row < n; row++) {
			for (int col = 0; col <= row; col++) {
				System.out.print(triangle[row][col] + " ");
			}
			System.out.println();
		}
		scanner.close();
	}
}
