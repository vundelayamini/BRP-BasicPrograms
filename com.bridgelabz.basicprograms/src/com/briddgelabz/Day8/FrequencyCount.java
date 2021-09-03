package com.bridgelabz.Day8;

import org.w3c.dom.css.Counter;

import com.briddgelabz.Day6.StdOut;
import com.briddgelabz.Day7.StdIn;


public class FrequencyCount {

    private static final String Merge = null;

	public static void main(String[] args) {

        String s = StdIn.readAll();
        String[] words = s.split("\\s+");

        Merge.sort(words);

        Counter[] zipf = new Counter[words.length];
        int m = 0
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equals(words[i-1]))   
                zipf[m++] = new Counter(words[i], words.length);
            ((Object) zipf[m-1]).increment();
        }

        Merge.sort(zipf, 0, m);                       
        for (int j = m-1; j >= 0; j--) {
            StdOut.println1(zipf[j]);
        }
    }
}