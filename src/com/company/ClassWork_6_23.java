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
        // this initializes the random variable
        Random rand1 = new Random();
        // this makes the size variable between 5 and 10
        int size = rand1.nextInt(5)+5;
        // this makes the array the size of 'size'
        int [] array1 = new int[size];
        // this initializes index 1
        int index1 ;
        // this initializes index2
        int index2 ;

        // this makes sure index 1 and 2 are not the same random integers
        do{
            index1 = rand1.nextInt(size);
            index2 = rand1.nextInt(size);
        }
        while (index1 == index2);

        // this prints index 1 and 2
        System.out.println(index1);
        System.out.println(index2);

        // this adds random integers between 1 and 99 to the array
        for (int i = 0; i < array1.length; i++){
            array1 [i] = rand1.nextInt(98) + 1;
        }
        // this prints the array before
        System.out.println(Arrays.toString(array1));
        // this calls the swap method
        array1 = swap(array1, index1, index2);
        // this prints the array after
        System.out.println(Arrays.toString(array1));


    }
    public static int[] swap (int[] array1, int index1, int index2){
        // this creates a temp variable and makes it equal to array at index1
        int temp = array1 [index1];
        // this makes array at index 1 equal to array at index 2
        array1 [index1] = array1 [index2];
        // this makes array at index 2 equal to temp
        array1 [index2] = temp;

        // this returns array back to the main
        return array1;
    }
}
