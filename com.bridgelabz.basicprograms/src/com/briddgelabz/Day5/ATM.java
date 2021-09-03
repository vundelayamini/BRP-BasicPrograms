package com.briddgelabz.Day5;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {

		int balance = 10000, withdraw, deposit;
        Scanner s = new Scanner(System.in);
        
        while(true)
        {
            System.out.println("A-T-M");
            System.out.println(" WithdDraw");
            System.out.println("DePosit");
            System.out.println("Check Balance");
            System.out.println("for EXIT");
            System.out.print("Select the opTion you want to Perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                System.out.print("Enter money you want To withdraw:");
                withdraw = s.nextInt();
                
                
                if(balance >= withdraw)
                {
                    balance = balance - withdraw;
                    
                    System.out.println("Please collect your money");
                }
                else
                {
                    System.out.println("InSufficient Balance");
                }
                
                break;
 
                case 2:
                System.out.print("Enter money you want to deposited:");
                deposit = s.nextInt();
                balance = balance + deposit;
                System.out.println("Your Money has been successfully deposited");
            
                break;
 
                case 3:
                System.out.println("Balance : "+balance);
               
                break;
 
                case 4:
                System.exit(0);
            }
        }
	}

}
