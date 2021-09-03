package com.briddgelabz.Day3;

import java.util.Scanner;

public class Trignometric_Ratios {
	 int factorial(int number)
	  {
	    int result = 1;
	    for (int i = 1; i <= number; i++)
	    {
	      result = result * i;
	    }
	    return result;
	  }

	  void calc(double x)
	  {
	    double sinx=0,cosx=0;

	    int i,j = 0;

	    int c;
	    for(i=1;i<10;i+=2)
	    {
	      c=i;
	      sinx += Math.pow(-1,j++)*Math.pow(x,i) / factorial(i);
	      if(i>0)
	      cosx+=Math.pow(-1,j)*Math.pow(x,c-1)/factorial(c-1);
	    }
	    sinx=Math.round( sinx * 1000.0 ) / 1000.0;

	    cosx=-cosx;
	    cosx=Math.round( cosx * 1000.0 ) / 1000.0;
	    System.out.println(sinx+" \n"+(cosx));
	  }

	  public static void main(String [] args)
	  {
	    int n;
	    Trignometric_Ratios tr=new Trignometric_Ratios();

	    Scanner sc=new Scanner(System.in);

	    n=sc.nextInt();

	    double a[]=new double[n];
	    for(int i=0;i<n;i++)
	    {
	      a[i]=sc.nextDouble();
	    }

	    for(int i=0;i<n;i++)
	    {
	      tr.calc(a[i]);
	    }

}
}
