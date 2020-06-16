package com.company;
import java.util.Scanner;

public class Challenge_Data_Types {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int i = 4;
        double d = 4.0;
        String s = "Greenhill ";

        System.out.print("Type any integer: ");
        String integerStr = input.nextLine();
        System.out.print("Type any double: ");
        String doubleStr = input.nextLine();
        System.out.print("Type any string: ");
        String string1 = input.nextLine();

        int myInt = Integer.parseInt(integerStr);
        double myDouble = Double.parseDouble(doubleStr);

        int first = i + myInt;
        double second = d + myDouble;
        String third = s + string1;

        System.out.printf("\n %8.3s \n %10.6s \n %10.50s", first, second, third);
        
    }

}
