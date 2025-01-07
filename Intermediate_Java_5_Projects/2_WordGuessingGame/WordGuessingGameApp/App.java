package com.isai.wordgame;

public class App {
    public static void main(String[] args) {
        // Array of words
        String[] words = {"Java", "Programming", "class", "computer", "method"};
        WordGuessingGame game = new WordGuessingGame(words,10);
        game.play();
    }
}
