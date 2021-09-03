package com.briddgelabz.Day4;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = input.nextLine();
        System.out.print("Enter second String: ");
        String str2 = input.nextLine();

       Utility.Anagram(str1, str2);
	}
}