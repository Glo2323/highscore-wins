package com.pluralsight;

import java.util.Scanner;

public class GameScore {

    //!Creating the main class
    public static void main(String[] args) {
        //!Creating my scanner
        Scanner gameSc = new Scanner(System.in);

        //*Asking for the game score
        System.out.println("""
                Enter the game Score
                (ex;Team1:Team2|score1:socre2:
                """);

        //*Splitting the teams and the game score
        String[] gameScore = gameSc.nextLine().split("\\|");

        //*Splitting the  2 teams
        String[] teams = gameScore[0].split(":");
        String team1 = teams[0];
        String team2 = teams[1];
        System.out.println("Team1: " + team1 + " Team2: " + team2);

        //*Splitting the 2 game scores
        String[] teamScore = gameScore[1].split(":");
        String score1 = Integer.parseInt(teamScore[0]);
        String score2 = teamScore[1];



    }
}
