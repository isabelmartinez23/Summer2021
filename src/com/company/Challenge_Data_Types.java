package com.company;
import java.util.Scanner;

/*
Isabel Martinez
PseudoCode
Import Scanner
Create the Scanner object
Create three variables, one int, one double and one String
Ask the user for for an integer
Use input.nextInt to initialize variable
Ask the user for a double
Use input.nextDouble to initialize variable
Ask the user for a string
Use input.nextLine to initialize variable
Create a new variable that is the first inputed integer + the first variable
Create a new variable that is the second inputed double + the double i created
Create a third variable that is the string I created concatenated with the string they created
Print all of these using printf so it is formatted correctly 
 */

public class Challenge_Data_Types {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        System.out.print("Type any integer: ");
        int myInt = input.nextInt();
        System.out.print("Type any double: ");
        double myDouble = input.nextDouble();
        System.out.print("Type any string: ");
        String myString = input.nextLine();


        int first = i + myInt;
        double second = d + myDouble;
        String third = s + myString;

        System.out.printf("\n %8.3s \n %10.6s \n %10.50s", first, second, third);
    }

}
