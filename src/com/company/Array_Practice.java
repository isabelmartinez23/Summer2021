package com.company;
import java.util.Random;
import java.util.Arrays;

public class Array_Practice {
    public static void main (String[] args){
        Random randy = new Random();
        int [] array1 = new int[10];
        for (int index = 0; index < array1.length; index++){
            array1[index] = randy.nextInt(100) + 1;
            System.out.println("The value of my array at index " + index + " is " + array1[index]);
        }
        double [] array2 = new double[10];
        for (int index = 0; index < array2.length; index++){
            array2[index] = randy.nextDouble()*100;
            System.out.printf("The value of my array at index %d is %.2f \n" ,index ,array2[index]);
        }
        String [] names = {"Maria", "Isabel", "Joohan", "Nuha"};
        Arrays.sort(names);
        String [] array3 = new String[10];
        Arrays.fill(array3, "a");
        for (int i =0; i < names.length; i++){
            System.out.println(names[i]);
            if (names[i].contains("h")){
                System.out.println(names[i]);
            }
        }
    }
}

