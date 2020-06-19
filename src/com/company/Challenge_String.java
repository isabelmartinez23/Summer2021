package com.company;
import java.util.Scanner;
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
    public static void main (String[] args){
        System.out.print("How many words will you type? ");
        int numberWords = input.nextInt();
        for (int words = 0; words <=numberWords; words++){
            System.out.println("Type your word: ");
            String word1 = input.nextLine();
        }
    }
}

