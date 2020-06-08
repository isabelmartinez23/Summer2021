package com.company;

public class Challenge_4_K_Shape {
    public static final int SIZE=18;
    public static void main (String[] args){
        for (int letterLimit = SIZE; letterLimit>=1; letterLimit--){
            for (int letter=0; letter<letterLimit; letter++){
                System.out.print((char) (65+letter));
            }
            System.out.println("");
        }
        for (int letterLimit = 1; letterLimit<=SIZE; letterLimit++){
            for (int letter=0; letter<letterLimit; letter++){
                System.out.print((char) (65+letter));
            }
            System.out.println("");
        }
    }
}
