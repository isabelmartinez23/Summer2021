package com.company;

public class Challenge_3_Mirror_V2 {
public static final int SIZE=7;
    public static void main(String[] args){
        Line();
        Top();
        Bottom();
        Line();


    }
    public static void Line(){
        System.out.print("#");
        for (int dash=0; dash<4*SIZE;dash++){
            System.out.print("=");
        }
        System.out.println("#");
    }

    public static void Top(){
        for (int row = 1; row <=SIZE; row++){
            System.out.print("|");
            for (int space=0; space < (-2)*row+2*SIZE; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int period=0; period < (row-1)*4; period++){
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space=0; space < (-2)*row+2*SIZE; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
    public static void Bottom(){
        for (int row = 1; row<=SIZE; row++){
            System.out.print("|");
            for (int space=1; space <= (2*row)-2; space++){
                System.out.print(" ");
            }
            System.out.print("<>");
            for (int period=0; period < 4*(SIZE-row); period++){
                System.out.print(".");
            }
            System.out.print("<>");
            for (int space=1; space <= (2*row)-2; space++){
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}









