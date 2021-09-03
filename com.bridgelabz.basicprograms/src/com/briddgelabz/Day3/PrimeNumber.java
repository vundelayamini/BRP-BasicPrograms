package com.briddgelabz.Day3;

import java.util.Scanner;

public class PrimeNumber {


	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter First Number : ");
	       int  first = sc.nextInt();
	        System.out.println("Enter Last Number : ");
	       int last = sc.nextInt();
	        System.out.println("Prime Number Between " +first+" and "+last+ " are : ");
	        int count;
	        for (int i=first;i<=last;i++){
	            count =0;
	            for (int j = 1; j <= i; j++){
	                if (i %j == 0)
	                    count = count+1;
	            }
	            if (count == 2)
	                System.out.println(i);

	}
	}
}


