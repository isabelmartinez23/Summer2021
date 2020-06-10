package com.company;

public class String_Examples {
    public static void main(String[] args){
        char letter = 'A'; //works because it's only one character
        String name = new String ("Isabel Martinez"); //If more than one character, use a string
        sayHi(name);
        String teacher = "Maria Suarez";
        sayHi(teacher);
        String student = "Nuha Omer";
        sayHi(student);
        Challenge_2_Pattern.Line();
    }
    public static void sayHi(String name){
        System.out.println("Hi " + name);
    }

}
