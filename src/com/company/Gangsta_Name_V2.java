package com.company;
import java.util.Scanner;

public class Gangsta_Name_V2 {
    public static Scanner Keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        // this asks for the name as an input
        System.out.println("Type your full name, playa:");
        //this initializes the variable to be whatever they timed in
        String fullName = Keyboard.nextLine();
        Challenge_2_Pattern.Line();
        System.out.println("Your gangsta name is: ");
        printName(fullName);
    }
    //this prints the gangsta name
    public static void printName(String fullName){
        // takes the first initial
        firstInitial(fullName);
        // prints . Diddy
        System.out.print(". Diddy");
        // takes the last name
        lastName(fullName);
        // takes the first name
        firstName(fullName);
        // prints -izzle
        System.out.print("-izzle");

    }
    //this separates the last name from the full name
    public static void lastName(String fullName){
        // this finds the space
        int indexOf = fullName.indexOf(" ");
        //this creates a substring of the full name
        if (indexOf>0){
            String lastName = fullName.substring(indexOf);
            lastName = lastName.toUpperCase();
            System.out.print(lastName);
        }
    }
    // this separates the first name from the full name
    public static void firstName(String fullName){
        //this finds the space
        int indexOf = fullName.indexOf(" ");
        // this creates the substring for everything before the space
        String firstName = fullName.substring(0, indexOf);
        System.out.print(" " + firstName);
    }
    // this creates the first initial from the full name
    public static void firstInitial(String fullName){
        // this finds the first letter
        char initial = fullName.charAt(0);
        System.out.print(initial);
    }
}