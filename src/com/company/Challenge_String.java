package com.company;
import java.util.Scanner;
import java.util.Arrays;
/*
Isabel Martinez
PseudoCode
Import Scanner
Create scanner object
Ask how many words they want that want to put in
Initialize a variable that will be how many words they want
Create a for loop that is based on how many words they want and repeat that many time
Ask them what they words they choose are
Initialize a variable that will be the words they choose
Create new method that is able to return into the main
Create a loop that finds the letters in the even indexes
Create a second loop that finds the letters in the odd indexes
Return and print in main

 */

public class Challenge_String {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int numberWords;
        do {
            System.out.print("How many words will you type? ");
            numberWords = input.nextInt();
        }
        while (numberWords < 1 || numberWords > 10);
        String[] inputWords = new String[numberWords];
        String word1 = input.nextLine();
        for (int wordCount = 0; wordCount < numberWords; wordCount++) {
            do {
                System.out.print("Type your word: ");
                inputWords[wordCount] = input.nextLine();
            }
            while (inputWords[wordCount].length() < 2 || inputWords[wordCount].length() >10000);
        }
        for (int wordCount = 0; wordCount < numberWords; wordCount++){
            System.out.print(even(inputWords[wordCount]));
            System.out.print(" ");
            System.out.println(odd(inputWords[wordCount]));
        }
    }

    public static String even(String word1) {
        String evenLetters = "";
        for (int evenIndex = 0; evenIndex < word1.length(); evenIndex = evenIndex + 2) {
            evenLetters = evenLetters + word1.charAt(evenIndex);
        }
        return evenLetters;
    }

    public static String odd(String word1) {
        String oddLetters = "";
        for (int oddIndex = 1; oddIndex < word1.length(); oddIndex = oddIndex + 2) {
            oddLetters = oddLetters + word1.charAt(oddIndex);
        }
        return oddLetters;
    }
}

