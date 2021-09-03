package com.briddgelabz.Day2;

import java.util.Scanner;

public class Trig {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
	        double a,b;

	        System.out.println("Enter Angle in Degree : ");
	        a = sc.nextDouble();

	        b = Math.toRadians(a);
	        System.out.println("Sin"+a+" is : "+Math.sin(b));
	        System.out.println("Cos"+a+" is : "+Math.cos(b));
	        System.out.println("Tan"+a+" is : "+Math.tan(b));
	    }
	
	}


