package com.briddgelabz.Day2;

public class Stats5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  double[] array = new double[5];
	        double avg,min,max;
	        for (int i=0;i<5;i++){
	            int num = (int) Math.floor(Math.random() * 10 ) % 2;
	            array[i]+=num;
	        }
	        System.out.println();
	        System.out.print("Array Value : ");
	        for (int j=0;j<5;j++){
	            System.out.print(" "+array[j]);
	        }
	}

}
