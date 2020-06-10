
/*
    Create string for first name
    Create string for last name
    Create a variable that finds the first letter of the first name
    Print that variable + ". Diddy" + last name in uppercase + first name +-izzle

 */
    package com.company;
    public class Gangsta_Name {
        public static void main(String[] args){
            String firstName = "Isabel";
            String lastName = "Martinez";
            char letter = firstName.charAt(0);
            System.out.println( letter + ". Diddy " + lastName.toUpperCase() + " " + firstName + "-izzle");
    }
}


