package com.isai.passwords;

import java.util.Scanner;

/**
 * This class implements the UserInterface for a text-based interaction
 * with the password generator application.
 */
public class TextBasedInterface implements UserInterface{

    private Scanner scanner;

    /**
     * Constructor initializes a new Scanner object for user input.
     */
    public TextBasedInterface (){
        this.scanner = new Scanner(System.in);
    }

    /**
     * Prompts the user for the desired password length and returns it.
     * @return The user-specified password length as an integer.
     */
    @Override
    public int getPasswordLength() {
        System.out.println("Please enter the password length: ");
        return scanner.nextInt();
    }

    /**
     * Asks the user if they want to include lowercase characters in the password.
     * @return true if the user inputs 'y' or 'Y', false otherwise.
     */
    @Override
    public boolean useLowerCase() {
        System.out.println("Would you like the password to have lowercase characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    /**
     * Asks the user if they want to include uppercase characters in the password.
     * @return true if the user inputs 'y' or 'Y', false otherwise.
     */
    @Override
    public boolean useUpperCase() {
        System.out.println("Would you like the password to have uppercase characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    /**
     * Asks the user if they want to include numerical characters in the password.
     * @return true if the user inputs 'y' or 'Y', false otherwise.
     */
    @Override
    public boolean useNumbers() {
        System.out.println("Would you like the password to have numerical characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    /**
     * Asks the user if they want to include symbol characters in the password.
     * @return true if the user inputs 'y' or 'Y', false otherwise.
     */
    @Override
    public boolean useSymbols() {
        System.out.println("Would you like the password to have symbol characters? (y/n): ");
        return scanner.next().equalsIgnoreCase("y");
    }

    /**
     * Displays the generated password to the user.
     * @param password The generated password to be displayed.
     */
    @Override
    public void displayPassword(String password) {
        System.out.println("Here is the password: " + password);
    }
}
