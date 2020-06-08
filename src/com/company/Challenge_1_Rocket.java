package com.company;
/* This is my rocket program
Challenge 1
Make a method for the top of the rocket
Make a method for the middle boxes of the rocket
    In the method I create a for loop to print multiple times
Make a method for the box with "United States" on it
Make a method for the bottom of the rocket
Make for loop for the middle method to be able to choose how many times they happen
Call each method in order of: Top, middle,US box, middle, and bottom
6/02/2020 */
public class Challenge_1_Rocket {

    public static void main(String[] args) {
        rocket_top();
        rocket_middle(1);
        rocket_US();
        rocket_middle(1);
        rocket_bottom();


    }
    public static void rocket_top(){
        System.out.println("    /  \\");
        System.out.println("   /    \\");
        System.out.println("  /      \\");
        System.out.println(" +--------+");
    }
    public static void rocket_middle(int count){
        for (int x=0; x<count; x=x+1){
            System.out.println(" |  NASA  |");
            System.out.println(" |  NASA  |");
            System.out.println(" +--------+");
        }
    }
    public static void rocket_US(){
        System.out.println(" | United |");
        System.out.println(" | States |");
        System.out.println(" +--------+");
    }
    public static void rocket_bottom(){
        System.out.println("    /  \\");
        System.out.println("   /    \\");
        System.out.println("  /      \\");
    }

}

