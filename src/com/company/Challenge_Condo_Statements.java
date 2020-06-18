package com.company;
import java.util.Scanner;
/*
Isabel Martinez
PseudoCode
Import Scanner
Create scanner object
Print "Type a single integer"
Create variable myInt and initialize it using nextInt
Create if loop checking whether or not the integer put in is odd by using %
    If it is, print "Weird"
    If the remainder is 1, it's odd
    If the remainder is 0, it's even
Create an else if loop that tests whether or not the integer is even and in between 2 and 5 using &&
    If it is, print "Not weird"
Create an else if loop that tests whether or not the integer is even and in between 6 and 20 using &&
    If it is, print "Weird
Create an else if loop that tests whether or not the integer is even and above 20 using &&
    If it is, print "Not Weird"
 */

public class Challenge_Condo_Statements {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Type a single integer: ");
        int myInt = input.nextInt();

        if (myInt % 2 == 1){
            System.out.println("Weird");
        }
        else if (myInt % 2 == 0 && myInt >= 2 && myInt <= 5){
            System.out.print("Not Weird");
        }
        else if (myInt % 2 == 0 && myInt >= 6 && myInt <= 20){
            System.out.print("Weird");
        }
        else if (myInt % 2 == 0 && myInt >= 20){
            System.out.print("Not Weird");
        }
    }
}
