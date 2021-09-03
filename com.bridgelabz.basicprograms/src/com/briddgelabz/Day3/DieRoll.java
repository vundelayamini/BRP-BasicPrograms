package com.briddgelabz.Day3;

import java.util.Scanner;

public class DieRoll {

	public static void main(String[] args) {

		  Scanner cs = new Scanner(System.in);
	        int num = (int) Math.floor(Math.random() * 10 ) % 6;
	        System.out.println("Enter number : ");
	        int n = cs.nextInt();
	        int[] array = new int[n];
	        for (int i=1;i<n;i++){
	            array[i] = num;
	        }
	        for (int i=1;i<n;i++){
	            System.out.println(" "+array[i]);
	        }
	}

}
