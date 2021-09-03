package com.briddgelabz.Day2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DayOfWeek {

     static int day(int year , int month , int day){

	        int [] date = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31  };

	        if (year > 0 && (month > 0 && month <=12)){

	            if ((year % 4 == 0 || year % 400 == 0) &&
	                    month == 2 && (day >0 && day <=29)){

	                Calendar calendar = new GregorianCalendar(year, month-1 ,day);
	                return calendar.get(Calendar.DAY_OF_WEEK);
	            }
	            else{

	                if (day > 0 && day <= date[month - 1]){

	                    Calendar calendar = new GregorianCalendar(year,month - 1,day);
	                    return calendar.get(Calendar.DAY_OF_WEEK);
	                }
	                else
	                    return 0;
	            }
	        }
	        else
	            return  0;    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String [] dayofweek = { " Invalid","Sun","Mon","Tue","Wed","Thur","Fri","Sat" };
	        int y,m,d;
	        System.out.println("Enter Year: ");
	        y=sc.nextInt();
	        System.out.println("Enter Month: ");
	        m=sc.nextInt();
	        System.out.println("Enter Day: ");
	        d=sc.nextInt();
	        System.out.println("Day Of Week is : "+dayofweek[DayOfWeek.day(y,m,d)]);
	    }


 }



