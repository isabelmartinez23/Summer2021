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
    public static final int SIZE=10;
    public static void main (String[] args){
        for (int letterLimit = SIZE; letterLimit>=1; letterLimit--){
            for (int letter=0; letter<letterLimit; letter++){
                System.out.print((char) (65+letter));
            }
            System.out.println("");
        }
        for (int letterLimit = 1; letterLimit<=SIZE; letterLimit++){
            for (int letter=0; letter<letterLimit; letter++){
                System.out.print((char) (65+letter));
            }
            System.out.println("");
        }
    }
}
