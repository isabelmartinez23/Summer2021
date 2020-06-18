package com.company;
import java.util.Scanner;
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

        int myInt;
        do {
            System.out.print("Type a single integer: ");
            myInt = input.nextInt();
        }
        while (myInt < 1 || myInt > 137);

        if (myInt % 2 == 1){
            System.out.println("Weird");
        }
        else if (myInt % 2 == 0 && myInt >= 2 && myInt <= 5){
            System.out.print("Not Weird");
        }
        else if (myInt % 2 == 0 && myInt >= 6 && myInt <= 20){
            System.out.print("Weird");
        }
        else if (myInt % 2 == 0 && myInt > 20){
            System.out.print("Not Weird");
        }
    }
}
