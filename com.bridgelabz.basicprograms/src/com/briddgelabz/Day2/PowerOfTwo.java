package com.briddgelabz.Day2;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		 Scanner cs = new Scanner(System.in);
         int n,i=1;

         System.out.println("Enter value for n : ");
         n = cs.nextInt();

         System.out.println("power of 2^"+n+" is: "+(Math.pow(2,n)));
         System.out.println();
         System.out.println("Printing all till Power Value "+n);

         while (i<=n){
             System.out.println("Power of 2^"+i+" is: "+(Math.pow(2,i)));
             i = i + 1;
         }
	}

}
