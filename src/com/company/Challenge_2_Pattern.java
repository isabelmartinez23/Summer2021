package com.company;

public class Challenge_2_Pattern {
    public static final int SIZE=5 ;
    public static void main(String[] args) {
       TopHalf();
       BottomHalf();
    }
    public static void TopHalf(){
        Line();
        TopTriangle();
        BottomTriangle();
    }
    public static void BottomHalf(){
        Line();
        BottomTriangle();
        TopTriangle();
        Line();
    }
    public static void Line(){
        System.out.print("+");
        for (int dash=0; dash<2*SIZE+1; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void TopTriangle(){
        for (int row=1; row<=SIZE; row++){
            System.out.print("|");
            for (int space=0; space < SIZE-row+1; space++){
                System.out.print(" ");
            }
            for (int slash=0; slash < row-1; slash++){
                System.out.print("/");
            }
            System.out.print("*");
            for (int slash=0; slash < row-1; slash++){
                System.out.print("\\");
            }
            for (int space=0; space < SIZE-row+1; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void BottomTriangle(){
        for (int row=1; row<=SIZE; row++){
            System.out.print("|");
            for (int space=0; space < row; space++){
                System.out.print(" ");
            }
            for (int slash=0; slash < SIZE-row; slash++){
                System.out.print("\\");
            }
            System.out.print("*");
            for (int slash=0; slash < SIZE-row; slash++){
                System.out.print("/");
            }
            for (int space=0; space < row; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}




