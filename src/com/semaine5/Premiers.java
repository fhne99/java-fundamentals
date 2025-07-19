package com.semaine5;
import java.util.ArrayList;

public class Premiers {
    public static void main(String[] args) {
    	ArrayList<Integer> premiers = new ArrayList<Integer>();
    	for (int n = 2; n <= 100; ++n) {
    		boolean premier = true;
    		int diviseur = 1;
    		
    		if (n % 2 == 0) {
    			if (n != 2) {
    				premier = false;
    				diviseur = 2;
    			}
    		} else {
    			double borneMax = Math.sqrt(n);
    			for (int i = 3; (premier) && (i <= borneMax); i += 2) {
    				if (n % i == 0) {
    					premier = false;
    					diviseur = i;
    				}
    			}
    		}
    		
    		if (premier) {
    			premiers.add(n);
    		}
    	}
    	
    	System.out.println("Les nombres premiers compris entre 2 et 100 sont les suivants :");
    	for (Integer i : premiers) {
    	    System.out.println(i);
    	}
    }
}