package com.bridgelabz.Day8;

import com.briddgelabz.Day6.StdOut;
import com.briddgelabz.Day7.StdIn;

public class InsertionSorting {
		@SuppressWarnings({"rawtypes", "unchecked"})
	    public static void sort(Comparable[] a) {
	        int n = a.length;
	        for (int i = 1; i < n; i++) {
	            for (int j = i; j > 0; j--) {
	                if (a[j-1].compareTo(a[j]) > 0) {
	                    exch(a, j-1, j);
	                }
	                else break;
	            }
	        }
	    }
	    @SuppressWarnings("rawtypes")
	    private static void exch(Comparable[] a, int i, int j) {
	        Comparable swap = a[i];
	        a[i] = a[j];
	        a[j] = swap;
	    }

	    public static void main(String[] args) {
	        String[] a = StdIn.readAllStrings();
	        sort(a);
	        for (int i = 0; i < a.length; i++) {
	            StdOut.println(a[i] + " ");
	        }
	        StdOut.println(null);
	    }
	}


