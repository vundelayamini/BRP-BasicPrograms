package com.briddgelabz.Day3;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the Decimal Number ::");
	        int num= sc.nextInt();
	        String bin=" ";
	        do {
	            int rem =num % 2;
	            bin=rem + bin;
	            num = num / 2;
	        }while(num!=0);
	        System.out.println("Binary Number is : " +bin);
	}

}
