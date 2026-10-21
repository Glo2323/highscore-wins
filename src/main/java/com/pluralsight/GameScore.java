package com.pluralsight;

import java.util.Scanner;

public class GameScore {

    //!Creating the main class
    public static void main(String[] args) {
        //!Creating my scanner
        Scanner gameSc = new Scanner(System.in);

        //*Asking for the game score
        System.out.print("""
                Enter the game Score
                (ex;Team1:Team2|score1:score2):
                """);

        //*Splitting the teams and the game score
        String[] gameScore = gameSc.nextLine().split("\\|");

        //*Splitting the  2 teams
        String[] teams = gameScore[0].split(":");
        String team1 = teams[0];
        String team2 = teams[1];


        //*Splitting the 2 game scores
        String[] teamScore = gameScore[1].split(":");
        int score1 = Integer.parseInt(teamScore[0]);
        int score2 = Integer.parseInt(teamScore[1]);

        //?Getting the winning team to pop up
        if (score1 > score2) {
            System.out.print("Winner: " + team1);
        }else if (score1 < score2) {
            System.out.print("Winner: " + team2);
        }else  {
            System.out.print("Winner: Tie!!");
        }



    }
}
