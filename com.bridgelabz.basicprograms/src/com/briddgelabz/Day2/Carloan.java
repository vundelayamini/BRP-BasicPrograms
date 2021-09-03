package com.briddgelabz.Day2;

import java.util.Scanner;

public class Carloan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        double P, Y, R, payment;
        System.out.println("Enter Loan Amount : ");
        P = sc.nextDouble();
        System.out.println("Enter Year : ");
        Y = sc.nextDouble();
        System.out.println("Enter Rate : ");
        R = sc.nextDouble();
        double n = 12 * Y, r = R / (12 * 100);
        double div = (1 - Math.pow((1 + r), (-n)));
        payment = (P * r) / div;
        double interest = payment * n - P;
        System.out.println("Loan Amount : " + P);
        System.out.println("Interest Rate per Month (%) : " + r);
        System.out.println("Loan Period (Months) : " + n);
        System.out.println("Monthly Payments : " + payment);
        System.out.println("Total interest : " + interest);
	}

}
