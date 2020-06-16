package com.company;
import java.util.Scanner;

public class Challenge_Data_Types {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        System.out.print("Type any integer: ");
        String integer1 = input.nextLine();
        System.out.print("Type any double: ");
        String double1 = input.nextLine();
        System.out.print("Type any string: ");
        String string1 = input.nextLine();

        String first = i + integer1;
        String second = d + double1;
        String third = s + string1;

        System.out.printf("\n %10.3s \n %10.3s \n %10.50s", first, second, third);

    }
}
