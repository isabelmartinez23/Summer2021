package com.company;
import java.util.*;
public class Array_Practice_2 {
        public static void main (String[] args){
            int [] numbers = {3, 5, 12, 43, 5, 76, 9, 1};
            int len = numbers.length;
            System.out.println("The array " + Arrays.toString(numbers) + " has " + len + " elements");

            Random rand = new Random();
            int [] numbers2 = new int[5];
            for (int i =0; i < numbers2.length; i++){
                numbers2[i] = rand.nextInt(70) + 20;
            }
            System.out.println(Arrays.toString(numbers2));
            numbers2 = reverse(numbers2);
            System.out.println(Arrays.toString(numbers2));
        }
        public static int[] reverse(int [] array){
            for (int i = 0; i < array.length/2; i++){
                int temp = array[i];
                array [i] = array[array.length-1-i];
                array[array.length-1-i] = temp;
            }
            return array;
        }
}
