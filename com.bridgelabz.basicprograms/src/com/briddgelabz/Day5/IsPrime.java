package com.briddgelabz.Day5;

public class IsPrime {

	public static void main(String[] args) {

		 System.out.println("is 17 Prime: "+isPrime(17));
	        System.out.println("is 27 Prime: "+isPrime(27));
	        System.out.println("is 79 Prime: "+isPrime(79));
	    }
	 
	    public static boolean isPrime(int num) 
	    {
	           if (num <= 1)
	           {
	               return false;
	           }
	           for (int i = 2; i <= Math.sqrt(num); i++)
	           {
	               if (num % i == 0) 
	               {
	                   return false;
	               }
	           }
	           return true;
	}

}
