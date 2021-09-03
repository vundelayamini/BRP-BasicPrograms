package com.briddgelabz.Day2;

import java.util.Scanner;

public class TemparatureConversion {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double choice,c,f,celcius_fahrenheit,fahrenheit_celcius;
        System.out.println("Enter Choice for Temperature 1- Celcius  2- Fahrenheit");
        choice = sc.nextInt();
        if (choice == 1){
            System.out.println("Enter Temperature in Celcius : ");
            c = sc.nextDouble();
            celcius_fahrenheit = (c * 9/5 ) + 32 ;
            System.out.println("Celcius to Fehrenheit is : "+celcius_fahrenheit);
        }
        else {
            System.out.println("Enter Temperature in Fahrenheit : ");
            f = sc.nextDouble();
            fahrenheit_celcius = (f - 32) * 5 / 9;
            System.out.println("Celcius to Fehrenheit is : " + fahrenheit_celcius);
        }
    }

	}


