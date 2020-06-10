package com.company;
import java.util.Scanner;

public class Gangsta_Name_V2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type your full name, playa:");
        String fullName = input.nextLine();
        Challenge_2_Pattern.Line();
        System.out.println("Your gangsta name is: ");
        printName(fullName);
    }
    public static void printName(String fullName){
        firstInitial(fullName);
        System.out.print(". Diddy");
        lastName(fullName);
        firstName(fullName);
        System.out.print("-izzle");

    }
    public static void lastName(String fullName){
        int indexOf = fullName.indexOf(" ");
        if (indexOf>0){
            String lastName = fullName.substring(indexOf);
            lastName = lastName.toUpperCase();
            System.out.print(lastName);
        }
    }
    public static void firstName(String fullName){
        int indexOf = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOf);
        System.out.print(" " + firstName);
    }
    public static void firstInitial(String fullName){
        char initial = fullName.charAt(0);
        System.out.print(initial);
    }
}