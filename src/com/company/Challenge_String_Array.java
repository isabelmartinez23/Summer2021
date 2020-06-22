package com.company;
import java.util.Scanner;
import java.util.Arrays;
/*
Isabel Martinez
PseudoCode
Import Scanner and Arrays
Create Scanner object
In main, initialize variable to be the number of words
Create a do while loop that says to keep asking for the number of words
    as long as they do less than 2 or more than 10
Create a new array for the words they will input to be able to initialize more variables
Create for loop that asks for the user's word however many times they said and puts the words into a string
Inside the for loop create a do while loop that makes sure the words they type in are between 2 and 10000
Create a method called even
    Initialize a variable for the even letters
    Create a for loop that skips through the character indexes by 2 and prints them starting at 0
Create a method called odd
    Initialize a variable for the odd letters
    Create a for loop that skips through the character indexes by 2 and prints them starting at 1
Create another for loop in the main that prints out the even method and odd method
 */

public class Challenge_String_Array {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int numberWords;
        // this loop asks for the number of words and makes sure it's between 1 and 10
        do {
            System.out.print("How many words will you type? ");
            numberWords = input.nextInt();
        }
        while (numberWords < 1 || numberWords > 10);
        // this creates an array to hold the words they type in
        String[] inputWords = new String[numberWords];
        String word1 = input.nextLine();
        // this for loop asks for a word as many times as they said
        for (int wordCount = 0; wordCount < numberWords; wordCount++) {
            // this do while loop makes sure the words are between 2 and 10000 characters
            do {
                System.out.print("Type your word: ");
                inputWords[wordCount] = input.nextLine();
            }
            while (inputWords[wordCount].length() < 2 || inputWords[wordCount].length() >10000);
        }
        // this for loop runs the methods the correct number of times
        for (int wordCount = 0; wordCount < numberWords; wordCount++){
            System.out.print(even(inputWords[wordCount]));
            // prints a space between even and odd
            System.out.print(" ");
            System.out.println(odd(inputWords[wordCount]));
        }
    }

    public static String even(String word1) {
        // initializes the variable
        String evenLetters = "";
        // this for loop skips every two indexes starting at 0
        for (int evenIndex = 0; evenIndex < word1.length(); evenIndex = evenIndex + 2) {
            evenLetters = evenLetters + word1.charAt(evenIndex);
        }
        return evenLetters;
    }

    public static String odd(String word1) {
        // initializes the variable
        String oddLetters = "";
        // this for loop skips every two indexes starting at 1
        for (int oddIndex = 1; oddIndex < word1.length(); oddIndex = oddIndex + 2) {
            oddLetters = oddLetters + word1.charAt(oddIndex);
        }
        return oddLetters;
    }
}

