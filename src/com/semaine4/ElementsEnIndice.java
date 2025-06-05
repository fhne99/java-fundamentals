package com.semaine4;

class ElementsEnIndice {
	
	static public int[] elementsEnIndice(int[] T) {
		
		int[] R = new int[T.length / 2];
		
		for(int i = 0; i < R.length; ++i) {
			R[ T[2 * i + 1] ] = T[2 * i];
		}
		
		return R;
	}
}