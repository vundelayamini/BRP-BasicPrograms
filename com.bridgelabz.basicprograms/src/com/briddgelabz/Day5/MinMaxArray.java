package com.briddgelabz.Day5;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxArray {

	 @SuppressWarnings("resource")
		public static void main(String[] args)
	    {
	        Scanner scanner = new Scanner(System.in);
	        int[] array = new int[10];
	        System.out.println("Enter the names");
	        for (int i = 0;i < array.length;i++)
	        {
	            array[i] =scanner.nextInt();
	        }
	        System.out.println(Arrays.toString(array));
	        MathFunction.MinMaxArray(array);


	        int array1[] = {10, 20, 25, 63, 96, 57};
	        int largest =array[0];
	        int secondlargest = array1[1];
	        for (int i = 0; i < array.length; i++) {
	            if (array[i] > largest)

	            {
	                secondlargest = largest;
	                largest = array[i];
	            }
	            else if(array[i] > secondlargest && array[i]!=largest)
	           {
	                secondlargest=array[i];
	            }
	        }
	        System.out.println("2nd largest value"+secondlargest);
	        System.out.println("1st largest value"+largest);


}
}