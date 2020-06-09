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
        /*
        This for loop creates the line by first printing a plus,
        then printing a number of dashes based on the size
         */
        System.out.print("+");
        for (int dash=0; dash<2*SIZE+1; dash++){
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void TopTriangle(){
        /*
        This prints the top triangle
         */
        for (int row=1; row<=SIZE; row++){
            /*
            This statement prints the first vertical bar
             */
            System.out.print("|");
            /*
            This is the loop that prints spaces based on the size
             */
            for (int space=0; space < SIZE-row+1; space++){
                System.out.print(" ");
            }
            /*
            This is the loop that prints the correct number of backslashes
            based on the size
             */
            for (int slash=0; slash < row-1; slash++){
                System.out.print("/");
            }
            /*
            This statement prints the asterisk
             */
            System.out.print("*");
            /*
            This is the loop that prints the correct number of slashes
            based on the size
             */
            for (int slash=0; slash < row-1; slash++){
                System.out.print("\\");
            }
            /*
            This is the loop that prints spaces on the right side of the
            asterisk based on the size
             */
            for (int space=0; space < SIZE-row+1; space++){
                System.out.print(" ");
            }
            System.out.println("|");
            /*
            This statement prints the last vertical bar
             */
        }
    }
    public static void BottomTriangle(){
         /*
        This prints the bottom triangle
         */
        for (int row=1; row<=SIZE; row++){
            /*
            This statement prints the first vertical bar
             */
            System.out.print("|");
            /*
            This is the loop that prints spaces on the left side of
            the asterisk based on the size
             */
            for (int space=0; space < row; space++){
                System.out.print(" ");
            }
            /*
            This is the loop that prints the slashes on the left side
            of the asterisk based on the size
             */
            for (int slash=0; slash < SIZE-row; slash++){
                System.out.print("\\");
            }
            /*
            This statement prints the asterisk
             */
            System.out.print("*");
            /*
            This is the loop that prints the slashes on the right side
            of the asterisk based on the size
             */
            for (int slash=0; slash < SIZE-row; slash++){
                System.out.print("/");
            }
            /*
            This is the loop that prints the spaces on the right side
            of the asterisk based on the size
             */
            for (int space=0; space < row; space++){
                System.out.print(" ");
            }
            /*
            This statement prints the last vertical bar
             */
            System.out.println("|");
        }
    }
}




