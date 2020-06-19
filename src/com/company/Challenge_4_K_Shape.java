package com.company;
/*
-Create global variable to make it easily sizable
-Create an outer for loop for the top half
    that declares how many letters per line and how many lines the output will have
-Create an inner for loop that adds one each time to 65 to change letters
-Print a line so it starts on the next line
-Create an outer for loop for the bottom half
    that declares how many letters per line and how many lines the output will have
-Create an inner for loop that adds one each time to 65 to change letters
-Print a line so it starts on the next line
*/

public class Challenge_4_K_Shape {
    public static final int SIZE=10; //this is the global variable that controls the size
    public static void main (String[] args){
        // this is the loop that controls how many letters per line and how it should decrease per line
        for (int letterLimit = SIZE; letterLimit>=1; letterLimit--){
            // this is the loop that changes the letters, A, B, C, D
            for (int letter=0; letter<letterLimit; letter++){
                // this prints the letter in ASCII
                System.out.print((char) (65+letter));
            }
            //this prints makes each line start on a new line
            System.out.println("");
        }
        // this is the loop that controls how many letters per line and how it should increase per line
        for (int letterLimit = 1; letterLimit<=SIZE; letterLimit++){
            // this is the loop that changes the letters, A, B, C, D
            for (int letter=0; letter<letterLimit; letter++){
                // this prints the letter in ASCII
                System.out.print((char) (65+letter));
            }
            //this prints makes each line start on a new line
            System.out.println("");
        }
    }
}
