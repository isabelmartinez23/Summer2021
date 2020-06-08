package com.company;
/*     Make a method for the top and bottom line
       Make a method for the top half of the pattern (not including line)
       Make a method for the bottom half of the pattern (not including line)
       Call the method in order or: line, top, bottom, line
       6/03/20
*/
public class Challenge_3_Mirror {

    public static void main(String[] args){
        line();
        top();
        bottom();
        line();
    }
    public static void line(){
        System.out.println("#================#");
    }
    public static void top(){
        System.out.println("|      <><>      |");
        System.out.println("|    <>....<>    |");
        System.out.println("|  <>........<>  |");
        System.out.println("|<>............<>|");
    }
    public static void bottom(){
        System.out.println("|<>............<>|");
        System.out.println("|  <>........<>  |");
        System.out.println("|    <>....<>    |");
        System.out.println("|      <><>      |");
    }
}


