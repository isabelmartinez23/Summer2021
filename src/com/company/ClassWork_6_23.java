package com.company;
import java.util.*;
/*
Isabel Martinez
PseudoCode
Import Arrays/Random
Initialize random variable
Initialize size variable based on the random variable and make the bounds between 5 and 10
Make the size of the array the variable
Create index1 and index2
In a do while loop, initialize index 1 and 2 to be random integers with the parameters of the size of the array
In the while part, make sure index1 is not equal to index2
Print index 1
Print index 2
Create a for loop that adds random integers between 1 and 99 to the array
Print out the array to make before and after obvious
Create a temporary int variable and make it equal to the array at index1
Make the array at index 1 equal to the array at index 2
Make the array at index 2 equal to the temporary variable
Print the final array

 */
public class ClassWork_6_23 {
    public static void main(String[] args){
        Random rand1 = new Random();
        int size = rand1.nextInt(5)+5;
        int [] array1 = new int[size];
        int index1 ;
        int index2 ; 

        do{
            index1 = rand1.nextInt(size);
            index2 = rand1.nextInt(size);
        }
        while (index1 == index2);

        System.out.println(index1);
        System.out.println(index2);

        for (int i = 0; i < array1.length; i++){
            array1 [i] = rand1.nextInt(98) + 1;
        }
        System.out.println(Arrays.toString(array1));
        array1 = swap(array1, index1, index2);
        System.out.println(Arrays.toString(array1));


    }
    public static int[] swap (int[] array1, int index1, int index2){
        int temp = array1 [index1];
        array1 [index1] = array1 [index2];
        array1 [index2] = temp;

        return array1;
    }
}
