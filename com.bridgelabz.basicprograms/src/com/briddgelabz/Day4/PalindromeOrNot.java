package com.briddgelabz.Day4;

import java.util.Scanner;

public class PalindromeOrNot {

	 public static boolean isPalindrome(String str)
	    {
	        int i = 0, j = str.length() - 1;
	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j))
	                return false;

	            i++;
	            j--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter the word");
	        String str = sc.next();
	        if (isPalindrome(str))
	            System.out.print("its palindrome");
	        else
	            System.out.print("its not palindrome");


	    }
	}
