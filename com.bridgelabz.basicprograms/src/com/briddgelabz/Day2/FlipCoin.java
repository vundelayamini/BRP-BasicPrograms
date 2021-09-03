package com.briddgelabz.Day2;

import java.util.Random;
	class Toss {
	    public String change() {
	        Random r = new Random();
	        int chance = r.nextInt(2);
	        if (chance == 1) {
	            return"tails";
	        } else {
	            return"heads";
	        }
	    }
	}
	class FlipCoin {
	    public static void main(String[] args) {
	        Toss t = new Toss();
	        int heads = 0;
	        int tails = 0;
	        int chances = 10;
	        for (int i = 1; i<= chances; i++) {
	            if (t.change().equals("tails")) {
	                tails++;
	            } else {
	                heads++;
	            }
	        }
	        System.out.println("Chances = " + chances);
	        System.out.println("Heads: " + heads);
	        System.out.println("Tails: " + tails);
	    }

}
