package com.isai.passwords;

/**
 * This interface defines the contract for a user interface
 * in the password generator application.
 */
public interface UserInterface {

    /**
     * Gets the desired length of the password from the user.
     * @return The length of the password as an integer.
     */
    public int getPasswordLength();

    /**
     * Checks if the user wants to include lowercase letters in the password.
     * @return true if lowercase letters should be included, false otherwise.
     */
    public boolean useLowerCase();

    /**
     * Checks if the user wants to include uppercase letters in the password.
     * @return true if uppercase letters should be included, false otherwise.
     */
    public boolean useUpperCase();

    /**
     * Checks if the user wants to include numbers in the password.
     * @return true if numbers should be included, false otherwise.
     */
    public boolean useNumbers();

    /**
     * Checks if the user wants to include symbols in the password.
     * @return true if symbols should be included, false otherwise.
     */
    public boolean useSymbols();

    /**
     * Displays the generated password to the user.
     * @param password The generated password to be displayed.
     */
    public void displayPassword(String password);
}
