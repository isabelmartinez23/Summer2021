package com.company;
import java.util.Scanner;
/*
Isabel Martinez
PseudoCode
Import Scanner
Create scanner object
Initialize variable for the number of words
Initialize variable for the words
Create a do while loop that asks for the number of words as lot as it's between 2 and 10
Initialize variable with nextLine
Create for loop with a do while loop that asks for the word and makes sure it's in between 1 and 10000 characters
Initialize a variable with nextLine
In that for loop, call method newWord and print it
Create method newWord
Initialize variable for odd and even word
Create for loop that prints the even letters and adds them to the evenWord variable
Create for loop that prints the odd letters and adds them to the oddWord variable
Return evenWord + " " + oddWord
 */

public class Challenge_String {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args){
        // this initializes variable for number of words
        int numberWords;
        // this initializes variable for the words inputed
        String inputWord;
        // this asks for the number words as long as it's between 2 and 10
        do {
            System.out.println("How many words will you type? ");
            numberWords = input.nextInt();
        } while (numberWords > 10 || numberWords < 2);
        // this creates a buffer so Type your word: doesn't appear twice the first time
        String word1 = input.nextLine();
        // this asks for the word while making sure it's in between 1 and 10000 characters
        for (int index = 0; index < numberWords; index++) {
            do{
                System.out.println("Type your word: " );
                inputWord = input.nextLine();
            }
            while (inputWord.length() <= 1 || inputWord.length() > 10000);
            // this creates a new variable by calling the method
            String output = newWord(inputWord);
            // this prints that variable
            System.out.println(output);
        }
    }
    public static String newWord(String inputWord) {
        // this initializes odd variable
        String oddWord = "";
        // this initializes even variable
        String evenWord = "";
        // this makes the even letters by starting at 0 and adding 2
        for (int even = 0; even < inputWord.length(); even += 2) {
            char letter = inputWord.charAt(even);
            // this adds those letters to the even variable
            evenWord = evenWord + letter;
        }
        // this makes the odd letters by starting at 1 and adding 2
        for (int odd = 1; odd < inputWord.length(); odd += 2) {
            char letter = inputWord.charAt(odd);
            // this adds those letters to the odd variable
            oddWord = oddWord + letter;
        }
        // this returns the output
        return evenWord + " " + oddWord;
    }
}
