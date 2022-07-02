package com.generic;

import java.util.HashMap;
import java.util.Random;

public class Range {
	 public static void main(String[] args) {
	        HashMap<Integer, Double> store = new HashMap<Integer, Double>();
	        Random r = new Random();
	        int max = 45;
	        double range = 12.43;

	        for (int i = 0; i < 10; i++) {
	            int x = (int) (r.nextInt(max));
	            double y = range + r.nextDouble() ;
	            store.put(x, y);
	        }
	        System.out.println(" ");
	        System.out.println(store);
	    }
}
