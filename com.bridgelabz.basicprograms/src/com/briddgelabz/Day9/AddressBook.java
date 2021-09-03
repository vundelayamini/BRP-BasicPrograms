package com.bridgelabz.Day9;

import java.util.Scanner;
import java.util.regex.Pattern;

public class AddressBook {
	 static String fName;
	    static String lName;
	    static String email;
	    static String  pNum;
	    static String pass;
	    static String ccName;

	//Creating an function for every section of Address book.
	    public static String firstName(){
	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("Enter your first name first letter must be Capital");
	        fName = sc1.nextLine();
	        return fName;
	    }
	    public static String lastName(){
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("Enter your last name first letter must me Capital:");
	        lName = sc2.nextLine();
	        return lName;
	    }

	    public static String emailId(){
	        Scanner sc3 = new Scanner(System.in);
	        System.out.println("Enter your Email id:");
	        email = sc3.nextLine();
	        return email;
	    }
	    public static String Pasword(){
	        Scanner sc4 = new Scanner(System.in);
	        System.out.println("Enter your pasword :");
	        pass= sc4.nextLine();
	        return pass;
	    }
	    public static String phoneNum(){
	        Scanner sc5 = new Scanner(System.in);
	        System.out.println("Enter your Mobile number:");
	        pNum = sc5.nextLine();
	        return pNum;
	    }
	    public static String compName(){
	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("Its an optional part if you want to share Compony Name press 0 / press 1 for not inrested");
	        int choice =sc1.nextInt();


	        switch (choice) {
	            case 0:
	                ccName = sc1.next();
	                System.out.println("Compony Name="+ccName);
	                break;
	            case 1:

	                System.out.println("Not intrested");
	                break;

	            default:
	                System.out.println("Invalid");
	                break;
	        }
	        return ccName;
	    }
	    public static void main(String[] args) {
	        Boolean firstName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",AddressBook.firstName());

	        Boolean lastName = Pattern.matches("^[A-Z]{1}[a-z]{2,}",AddressBook.lastName());

	        Boolean emailId = Pattern.matches("[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}",AddressBook.emailId());

	        Boolean Pasword = Pattern.matches("^(?=.*[@#$%^&-+=()])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}",AddressBook.Pasword());

	        Boolean phoneNum = Pattern.matches("^\\d{10}$",AddressBook.phoneNum());

	        AddressBook.compName();

	        if (firstName == true) {
	            System.out.println("First Name: " + fName);

	        }
	        else {
	            System.out.println("Invalid");}

	        if (lastName == true) {
	            System.out.println("Last Name: " + lName);
	        }
	        else {
	            System.out.println("invalid");}

	        if (emailId == true) { System.out.println("Email id: " + email);
	        }
	        else {System.out.println("INvalid");}

	        if (Pasword == true) {
	            System.out.println("Security Password: " + pass);
	        }
	        else {System.out.println("INvalid");}

	        if (phoneNum == true) {
	            System.out.println("Mobile number: " + pNum);

	        }
	        else {
	            System.out.println("Invalid");}

	    }
}
