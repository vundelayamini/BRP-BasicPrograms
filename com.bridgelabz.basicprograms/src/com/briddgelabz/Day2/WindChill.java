package com.briddgelabz.Day2;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double v,t,w;
        System.out.println("Enter Arguments of T and V : ");
        t = sc.nextDouble();
        v = sc.nextDouble();

        w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v,0.16));
        System.out.println("windChill is : "+w);
    }

	}



