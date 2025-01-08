package com.isai.wordgame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Array of words
        String[] words = {"Java", "Programming", "class", "computer", "method"};
        WordGuessingGame game = new WordGuessingGame(words,10);

        Scanner scan = new Scanner(System.in);
        boolean shouldPlayAgain = false;

        int wins = 0;
        int losses = 0;

        do{

            String result = game.play();

            if (result.equals("Win")){
                wins++;
            }else {
                losses++;
            }

            System.out.println("Wins: " + wins + ", Losses: " + losses);

            System.out.print("Would you like to play again? (y/n): ");
            char playAgain = scan.nextLine().toLowerCase().charAt(0);

            shouldPlayAgain = playAgain == 'y';

        }while(shouldPlayAgain);

    }
}
