package com.briddgelabz.Day5;

import java.util.Arrays;
import java.util.Collections;

public class MathFunction {

		 public static void harmonicSeries(int num) {
		        for ( int count = 1 ; count<= num ; count++ ) {
		            if(count == num) {
		                System.out.print(" 1/" +count);
		            }
		            else
		                System.out.print(" 1/" +count+ " + ");
		        }
		    }

		    public static void isSin(double degreesSin) {
		        double radians = Math.toRadians(degreesSin);
		        double sinValue = Math.sin(radians);

		        System.out.println("sin(" +degreesSin+ ") =" +sinValue);
		    }
		    
		    public static void isCos(double degreesCos) {
		        double radians = Math.toRadians(degreesCos);
		        double cosValue = Math.cos(radians);
		        System.out.println("sin(" +degreesCos+ ") =" +cosValue);
		    }
		    public static boolean isPrime(int num) {
		        if (num == 0 || num == 1) {
		            return false;
		        }
		        for (int i = 2; i < num; i++) {
		            if (num % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		    public static int fact(int number)
		    {
		        int factorial = 1;
		        for (int i = 1; i <= number ; i++) {
		            factorial *= i;
		            System.out.println("The factorial of the number is: " + factorial);
		        }
		        return factorial;
		    }

		    public static int minMax() {
		        Integer[] num = { 30, 44, 57, 25, 89 };
		        int minValue = Collections.min(Arrays.asList(num));
		        int maxValue = Collections.max(Arrays.asList(num));
		        System.out.println("Minimum number of array is : "
		                + minValue);

		        System.out.println("Maximum number of array is : "
		                + maxValue);

		        return 0;
	}

			public static void Factorial(int number, int i, int fact) {
				// TODO Auto-generated method stub
				
			}

			public static void MinMaxArray(int[] array) {
				// TODO Auto-generated method stub
				
			}

			public static void MaxString(String[] array) {
				// TODO Auto-generated method stub
				
			}

}
