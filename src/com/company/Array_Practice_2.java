package com.company;
import java.util.*;
public class Array_Practice_2 {
        public static void main (String[] args){
            int [] numbers = {3, 5, 12, 43, 5, 76, 9, 1};
            int len = numbers.length;
            System.out.println("The array " + Arrays.toString(numbers) + " has " + len + " elements");

            Random rand = new Random();
            int [] numbers2 = new int[10];
            for (int i =0; i < numbers2.length; i++){
                numbers2[i] = rand.nextInt(70) + 20; 
            }
        }
}
