package com.company;

public class Type_Casting_Class7 {
    public static void main(String[] args){
        double num1 = 9.7;
        int num2 = 5;
        double total;
        double total2 = 0;
        /*when you declare a variable and you
        do not initialize it, you cannot print it or use it */
        /*total = num1+num2;
        total2 = num2+ (int)num1;
        System.out.println(total);
        System.out.println(total2); */

        char letter=65; //prints the corresponding ASCII character
        for (int let=0; let<3; let++){
            for (int line=0; line<25; line++){
                System.out.print((char)(letter+line) + " ");
            }
            System.out.println();
            letter += 25;
        }
    }
}
