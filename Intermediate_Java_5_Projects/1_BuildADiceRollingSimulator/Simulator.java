package com.isai.dice;

//import to generate random numbers
import java.util.Random;

public class Simulator {
    public static void main(String[] args) {
        Random rand = new Random();

        int rolledNumber = rand.nextInt(6) + 1;
        System.out.println(display(rolledNumber));
    }

    /*
    * This method displays a
    * dice made up with ascii
    * characters depending on
    * the random number thrown
    * */
    static String display(int value){
        switch (value){
            case 1:
                return "---------\n|       |\n|   o   |\n|       |\n---------";
            case 2:
                return "---------\n| o     |\n|       |\n|     o |\n---------";
            case 3:
                return "---------\n| o     |\n|   o   |\n|     o |\n---------";
            case 4:
                return "---------\n| o   o |\n|       |\n| o   o |\n---------";
            case 5:
                return "---------\n| o   o |\n|   o   |\n| o   o |\n---------";
            case 6:
                return "---------\n| o   o |\n| o   o |\n| o   o |\n---------";
            default:
                return "Not a valid dice number";
        }
    }
}
