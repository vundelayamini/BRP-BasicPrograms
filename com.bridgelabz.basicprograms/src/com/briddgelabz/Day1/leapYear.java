package com.bridgelabz.Day1;
import java.util.Scanner;
public class leapYear {
	public static void main (String[] args)
	{

	String another = "y";
	int year;
	  

	Scanner scan = new Scanner(System.in);

	{
	while (another.equalsIgnoreCase("y")) 

	System.out.print("Enter a year: ");
	year = scan.nextInt();
	System.out.println();

	while (year < 1582)
	{
	System.out.println ("The Gregorian calendar started in 1582. Please choose a different year.");
	year = scan.nextInt();
	}

	if (year%4==0 && year%100!=0 || year%400==0)
	System.out.format("The year IS a leap year\n",year);
	  
	  
	else
	System.out.format("The year is NOT a leap year\n",year);

	System.out.println();
	System.out.print("Check another year ");
	another = scan.nextLine();
	}
	}

}
