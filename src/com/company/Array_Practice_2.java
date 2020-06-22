package com.company;
import java.util.Scanner;
import java.util.Random;
/*
Isabel Martinez
PseudoCode
Import Scanner
Import Random
Initialize variable for number of temps
Create do while loop that asks for how many temperatures as long as it's between 2 and 100
Initialize variable with next.Int
Create array that will hold all of the temperatures
Create a random
Create a sum = 0
Create for loop that prints out the random integer however many times they said
Print the random numbers
Make the sum = sum + random number
Find the average by doing the sum/number of temperatures
Create a counter that does +1 every time a temperature is above average
Print "The number of days above average was " + counter + " days"
 */

public class Array_Practice_2 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int numberDays;
        do {
            System.out.print("How many temperatures? ");
            numberDays = input.nextInt();
        }
        while (numberDays < 2 || numberDays > 100);
        int [] temps = new int[numberDays];
        Random randy = new Random();
        int sum = 0;
        for (int index = 0; index < temps.length; index++){
            temps[index] = randy.nextInt(85) + 25 ;
            System.out.println("Day " + index + " high temp: " + temps[index]);
            sum = sum + temps[index];
        }
        double average = (double) sum/numberDays;
        System.out.println("The average of all temperatures is: " + average);
        int counter = 0;
        for (int index =0; index < temps.length; index++){
            if (temps[index] > average){
                counter = counter + 1;
            }
        }
        System.out.println(counter + " days were above average!");

    }
}
