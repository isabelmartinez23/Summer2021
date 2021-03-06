package com.company;
import java.util.Scanner;
import java.util.Random;
/*
Isabel Martinez
PseudoCode
Import Scanner
Create scanner object
Initialize the variable myInt that will be whatever the user types in
Create a do-while loop that runs the input.nextInt as long as the integer given is less than 1 or greater than 137
Print "Type a single integer"
Create variable myInt and initialize it using nextInt
Outside of the do-while loop:
Create if loop checking whether or not the integer put in is odd by using % (If the remainder is 1, it's odd, if the remainder is 0, it's even)
    If it is, print "Weird"
Create an else if loop that tests whether or not the integer is even and in between 2 and 5 using &&
    If it is, print "Not Weird"
Create an else if loop that tests whether or not the integer is even and in between 6 and 20 using &&
    If it is, print "Weird
Create an else if loop that tests whether or not the integer is even and above 20 using &&
    If it is, print "Not Weird"
 */

public class Challenge_Condo_Statements {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        // this creates random integer
        Random myInt = new Random();
        // this initializes variable that they will type in
        String answer;
        // this prints a random number between 1-137 and runs the loops method which prints Weird or Not Weird
        // And then asks the user whether or not it wants to quit, if the answer is no, it keeps going
            do {
                int number1= myInt.nextInt(137) + 1;
                System.out.println(number1);
                loops(number1);
                System.out.print("Do you want to quit? (Yes/No): ");
                answer = input.next();
            }
            while (answer.equals("No")) ;


    }
    public static void loops(int number1){
        // this tests if it's odd
        if (number1 % 2 == 1){
            System.out.println("Weird");
        }
        // this tests if it's even and is between 2 and 5
        else if (number1 % 2 == 0 && number1 >= 2 && number1 <= 5){
            System.out.println("Not Weird");
        }
        // this tests if it's even and is between 6 and 20
        else if (number1 % 2 == 0 && number1 >= 6 && number1 <= 20){
            System.out.println("Weird");
        }
        // this tests if it's even and above 20
        else if (number1 % 2 == 0 && number1 > 20){
            System.out.println("Not Weird");
        }
    }
}
