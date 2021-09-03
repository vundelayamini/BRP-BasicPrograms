package com.briddgelabz.Day2;

import java.util.Scanner;

public class Gambling {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stake : ");
        int Stake = sc.nextInt();
        System.out.println("Enter Goal : ");
        int Goal = sc.nextInt();
        System.out.println("Enter Number of Times : ");
        int NoOfTime = sc.nextInt();

        int bets = 0;
        int wins = 0;

        for (int i=0;i<NoOfTime;i++){
            int cash = Stake;

            while (cash > 0 && cash < Goal){
                bets++;

                if (Math.random() < 0.5)
                    cash++;
                else
                    cash--;
            }
            if (cash == Goal)
                wins++;
        }
        System.out.println(wins + " wins of " + NoOfTime);
        System.out.println("Percent of games won = " + 100.0 * wins / NoOfTime);
        System.out.println("Avg Number of bets  = " + 1.0 * bets / NoOfTime);
	}

}
