package com.company;

public class String_Examples {
    public static void main(String[] args){
        char letter = 'A'; //works because it's only one character
        String name = new String ("Isabel Martinez"); //If more than one character, use a string
        sayHi(name);
        Challenge_2_Pattern.Line();
        String teacher = "Maria Suarez is the Teacher at the School ";
        sayHi(teacher);
        Challenge_2_Pattern.Line();
        String student = "Nuha Omer";
        sayHi(student);
        Challenge_2_Pattern.Line();
    }
    public static void sayHi(String name){
        //System.out.println("Hi " + name.toUpperCase());
        System.out.println("Hi " + name);
        int len = name.length();
        System.out.println("Your name is " + len + " characters long");
        int indexOf = name.indexOf("a");
        System.out.println("The letter a is at index " + indexOf);
        if (indexOf>0){
            String partial =name.substring(indexOf+1);
            System.out.println(partial);
        }
        if (name.length()>4){
            String partial= name.substring(1, 4);
            System.out.println(partial);
            char letter = name.charAt(4);
            System.out.println("The letter at index 4 is " + letter);
        }
    }
}
