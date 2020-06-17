package com.company;
import java.util.Scanner;

public class Challenge_BMI {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Person 1, type your height in inches: ");
        double height1 = input.nextDouble();
        System.out.print("Person 1, type your weight in pounds: ");
        double weight1 = input.nextDouble();
        System.out.print("Person 2, type your height in inches: ");
        double height2 = input.nextDouble();
        System.out.print("Person 2, type your weight in pounds: ");
        double weight2 = input.nextDouble();

        double bmiFormula1 = (weight1/Math.pow(height1, 2)) * 703;
        double bmiFormula2 = (weight2/Math.pow(height2, 2)) * 703;

        double difference = bmiFormula1 - bmiFormula2;

        if (bmiFormula1 <= 18.5) {
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula1);
            System.out.print("Person 1: ");
            System.out.println("You are underweight");
        }
        else if(bmiFormula1 > 18.5 && bmiFormula1 <= 24.9) {
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula1);
            System.out.print("Person 1: ");
            System.out.println("You are normal");
        }
        else if(bmiFormula1 > 25.0 && bmiFormula1 < 29.9) {
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula1);
            System.out.print("Person 1: ");
            System.out.println("You are overweight");
        }
        else if(bmiFormula1 >= 30.0){
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula1);
            System.out.print("Person 1: ");
            System.out.println("You are obese");
        }
        if (bmiFormula2 <= 18.5) {
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula2);
            System.out.print("Person 2: ");
            System.out.println("You are underweight");
        }
        else if(bmiFormula2 > 18.5 && bmiFormula2 <= 24.9) {
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula2);
            System.out.print("Person 2: ");
            System.out.println("You are normal");
        }
        else if(bmiFormula2 > 25.0 && bmiFormula2 < 29.9) {
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula2);
            System.out.print("Person 2: ");
            System.out.println("You are overweight");
        }
        else if(bmiFormula2 >= 30.0){
            Challenge_2_Pattern.Line();
            System.out.println(bmiFormula2);
            System.out.print("Person 2: ");
            System.out.println("You are obese");
        }

        Challenge_2_Pattern.Line();
        System.out.println("Difference in BMI is: " + difference);

    }
}
