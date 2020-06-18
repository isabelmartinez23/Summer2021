package com.company;
import java.util.Scanner;
/*
Isabel Martinez
PseudoCode
Import Scanner
Create scanner object
Print "Type the meal cost"
Use nextDouble to initialize variable for the meal cost
Print "Type the tip percent"
Use nextInt to initialize variable for the tip percent
Print "Type the tax percent"
Use nextInt to initialize variable for the tax percent
Create new method to do the calculations:
    Create new double tipRate and multiple the tipPercent by .01
    Create new double taxRate and multiple the taxPercent by .01
        Create new double totalTip which is mealCost*tipRate
    Create new double totalTax which is mealCost*taxRate
    Create new double totalCost which is mealCost * totalTip * totalTax
    Use Math.round to round total cost to the nearest whole number
    Print Line from Challenge 2 to make clear
    Print totalCost with printf to make sure there are 0 decimal places after the number
In the main, call the method that does the equations 
 */

public class Challenge_Operators {
    public static Scanner input = new Scanner(System.in);
    public static void main (String[] args){

        System.out.print("Type the meal cost: ");
        double mealCost = input.nextDouble();
        System.out.print("Type the tip percent: ");
        int tipPercent = input.nextInt();
        System.out.print("Type tax percent: ");
        int taxPercent = input.nextInt();

        solve(mealCost,tipPercent,taxPercent);

    }
    public static void solve (double mealCost, int tipPercent, int taxPercent){
        double tipRate = tipPercent*.01;
        double taxRate = taxPercent*.01;

        double totalTip = mealCost*tipRate;
        double totalTax = mealCost*taxRate;
        double totalCost = mealCost + totalTip + totalTax;

        totalCost = Math.round(totalCost);

        Challenge_2_Pattern.Line();
        System.out.print("Total Cost: ");
        System.out.printf("%1.0f", totalCost);

    }
}
