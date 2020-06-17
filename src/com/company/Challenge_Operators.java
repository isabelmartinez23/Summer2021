package com.company;
import java.util.Scanner;


public class Challenge_Operators {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        System.out.print("Type the meal cost: ");
        double mealCost = input.nextDouble();
        System.out.print("Type any double: ");
        int tipPercent = input.nextInt();
        System.out.print("Type any string: ");
        int taxPercent = input.nextInt();

        mealCost = Math.round(mealCost);
        double totalTip = mealCost*(Math.floorDiv(tipPercent, 100));
        double totalTax = mealCost*(Math.floorDiv(taxPercent, 100));
        double totalCost = mealCost + totalTip + totalTax;

        System.out.print(totalCost);

    }
}
