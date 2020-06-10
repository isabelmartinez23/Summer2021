
/*
    Create string for first name
    Create string for last name
    Create a variable that finds the first letter of the first name
    Print that variable + ". Diddy" + last name in uppercase + first name +-izzle

 */
    package com.company;
    public class Gangsta_Name {
        public static void main(String[] args){
            String fullName = "Edgar Martinez";
            System.out.println("Your gangsta name is: ");
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


