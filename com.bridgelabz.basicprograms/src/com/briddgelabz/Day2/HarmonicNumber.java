package com.briddgelabz.Day2;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter value for n : ");
	        int n = sc.nextInt();
	        double result = nthHarmonic(n);
	        if (n>0)
	            System.out.println("The harmonic Value for the number is : "+result);
	        else
	            System.out.println("The number should be non Negative . ");
	    }
	    public static double nthHarmonic(int n){
	        double val = 0.0;
	        for (int i=1;i<=n;i++){
	            val = val + (1.0/i);
	        }
	        return val;
	    }
	}


