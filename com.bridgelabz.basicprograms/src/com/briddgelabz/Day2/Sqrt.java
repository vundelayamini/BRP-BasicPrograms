package com.briddgelabz.Day2;

import java.util.Scanner;

public class Sqrt {

		static double squareRoot(double n, double l){

	        double x =n;

	        double root;

	        int count  =0;
	        while (true){
	            count++;

	            root = 0.5 * (x +(n / x));

	            if (Math.abs(root - x) < 1)
	                break;

	            x = root;
	        }
	        return root;
	    }
	    public static void main(String[] args) {
	        Scanner cs = new Scanner(System.in);
	        double n,l;
	        System.out.println("Enter Value of N : ");
	        n=cs.nextDouble();
	        System.out.println("Enter Value of L : ");
	        l=cs.nextDouble();
	        System.out.println(squareRoot(n,1));
	    }

	}


