package com.company;
import java.util.*;
/*
Isabel Martinez
PseudoCode
Import Arrays/Random
Create random number between 5-10
Create array with the size of the random number
Create random number with array length -1
Create random number with array length -1
Create temp variable that holds the integer being swapped
Make array at that index = third random integer

 */
public class ClassWork_6_23 {
    public static void main(String[] args){
        Random rand1 = new Random();
        int size = rand1.nextInt(5)+5;
        int [] array1 = new int[size];
        int index1 ;
        int index2 ;

        //do{
            index1 = rand1.nextInt(size);
            index2 = rand1.nextInt(size);
        //}
        //while ();

        System.out.println(index1);
        System.out.println(index2);

        for (int i = 0; i < array1.length; i++){
            array1 [i] = rand1.nextInt(98) + 1;
        }
        System.out.println(Arrays.toString(array1));

        int temp = array1 [index1];
        array1 [index1] = array1 [index2];
        array1 [index2] = temp;

        System.out.println(Arrays.toString(array1));
    }
}
