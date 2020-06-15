package com.company;
import java.util.Random;
import java.util.Scanner;
public class June_15_Testing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        demonstration();
        classwork();
    }
    public static void demonstration(){
        Scanner input = new Scanner(System.in);
        String answer;
        Random randy = new Random();
        double double1 = 9.98;
        double double2 = double1 * 3.234234;
        double double3 = double2 / 2.345345;
        int integer1 = 345;
        int integer2 = -58;
        do {
            int rand = randy.nextInt(100) +750;
            System.out.printf("My random number is %5d \n", rand);
            System.out.print("Do you want to quit? (Yes/No): ");
            answer = input.next();
        }
        while (answer.equals("No")) ;
        String whatever = "Greenhill is awesome";
        System.out.printf("Showing how to use printf \n $%10.3f \n $%10.3f \n $%10.3f " +
                "\n -%6d \n -%6d \n %20.30s"
                ,double1, double2, double3, integer1, integer2, whatever);
        System.out.println("");
    }
    public static void classwork(){
        double double1 = Math.sqrt(7.3467);
        double double2 = Math.cbrt(159.875);
        double double3 = double2/Math.random();

        System.out.printf("\n %10.3f \n %10.3f \n %10.3f",double1, double2, double3);
    }
}
