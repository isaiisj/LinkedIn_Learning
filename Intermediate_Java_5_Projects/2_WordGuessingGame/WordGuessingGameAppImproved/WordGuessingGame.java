package com.isai.wordgame;

import java.util.Random;
import java.util.Scanner;

public class WordGuessingGame {
    private String wordToGuess;
    private char[] guessedLetters;
    private int attempts;

    /*
    * WordGuessingGame method pick a random
    * word from the list and create an array
    * with the size of the word to fill it up
    * with dashes and sets max attempts.
    *
    * @param array of strings, max of attempts
    * */
    public WordGuessingGame(String[] wordList, int maxAttempts) {
        Random rand = new Random();
        this.wordToGuess = wordList[rand.nextInt(wordList.length)];
        this.guessedLetters = new char[this.wordToGuess.length()];
        for (int i = 0; i < this.guessedLetters.length; i++) {
            this.guessedLetters[i] = '-';
        }
        this.attempts = maxAttempts;
    }

    /*
    * play method loops while attempts > 0 and boolean value
    * when the user wirte a letter checks if the letter is in
    * the word, if so and we have attempts left we can still play
    * but it attempts are zero the game is over. If we don´t have
    * letters left that means we have won.
    * */
    public String play(){
        Scanner scanner = new Scanner(System.in);

        while (attempts > 0) {
            displayState();
            System.out.println("You have " + attempts + " attempts left...");
            System.out.println("Guess a letter: ");

            char guess = scanner.nextLine().toLowerCase().charAt(0);


            if(processGuess(guess)) {
                System.out.println("Correct");
                if(new String(guessedLetters).equals(wordToGuess)){
                    System.out.println("You have guessed the word!");
                    return "Win";
                }
            }else{
                System.out.println("That guess was incorrect");
                attempts--;
            }
        }
        return "Loss";
    }

    /*
    * processGuess method loops through the word and looks if
    * the guess letter exists, if so in the array of dashes it'll
    * change a dash for the letter and return a boolean value.
    * */
    private boolean processGuess(char letter){
        boolean letterFound = false;
        for (int i = 0; i < wordToGuess.length(); i++) {
            if(wordToGuess.charAt(i) == letter){
                guessedLetters[i] = letter;
                letterFound = true;
            }
        }
        return letterFound;
    }

    /*
    * displaySatate mehtod display the letters or dashes each time
    * */
    private void displayState(){
        System.out.println("Guessed letters: " + new String(guessedLetters));
    }

}
