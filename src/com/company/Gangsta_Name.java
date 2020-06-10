package com.company;
import java.util.Scanner;

public class Gangsta_Name {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your first name, playa:");
        String firstName = input.nextLine();
        System.out.println("Type your last name, playa:");
        String lastName = input.nextLine();
        System.out.println(firstName + lastName);
        char letter = firstName.charAt(0);
        System.out.println( letter + ". Diddy " + lastName.toUpperCase() + " " + firstName + "-izzle");
    }
}
