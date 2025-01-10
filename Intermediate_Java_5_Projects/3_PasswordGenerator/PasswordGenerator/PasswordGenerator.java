package com.isai.passwords;

import java.util.Random;

public class PasswordGenerator {


    /**
     * Generates a random password based on the specified criteria.
     *
     * @param length             the desired length of the password
     * @param useLowerCase       whether to include lowercase letters in the password
     * @param useUpperCase       whether to include uppercase letters in the password
     * @param useNumbers         whether to include numbers in the password
     * @param useSpecialChars    whether to include special characters in the password
     * @return the generated password as a String
     */
    String generatePassword(int length,boolean useLowerCase, boolean useUpperCase, boolean useNumbers,boolean useSpecialChars) {
        // Define the character sets for each type of character
        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String symbols = "!#$%&?¿@*¡";

        // Create a StringBuilder to hold the selected character sets
        StringBuilder charOptions = new StringBuilder();

        // Append the selected character sets to the charOptions StringBuilder
        if (useLowerCase) {
            charOptions.append(lowercase);
        }

        if (useUpperCase) {
            charOptions.append(uppercase);
        }

        if (useNumbers) {
            charOptions.append(digits);
        }

        if (useSpecialChars) {
            charOptions.append(symbols);
        }

        // Convert the charOptions StringBuilder to a String
        String allChars = charOptions.toString();

        // Create a new StringBuilder to hold the generated password
        StringBuilder password = new StringBuilder();

        // Create a new Random object to generate random index values
        Random rand = new Random();

        // Loop to generate the password of the specified length
        for (int i = 0; i < length; i++) {
            // Get a random character from the allChars String
            char nextLetter = allChars.charAt(rand.nextInt(allChars.length()));
            // Append the random character to the password StringBuilder
            password.append(nextLetter);
        }
        return password.toString();
    }
}
