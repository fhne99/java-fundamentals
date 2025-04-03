package com.semaine3;

class Tables {
	
	public static void main(String[] args) {
		System.out.println("Tables de multiplication");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Table de " + i + " :");
			for (int k = 1; k <= 10; k++) {
				System.out.println(k + " * " + i + " = " + (k * i));			
			}
		}
	}
}
