package com.company;

public class Receipt {

    public static void main(String[] args) {

        double price1 = 38;
        double price2 = 40;
        double price3 = 30;
        double taxRate = .08;
        double tip = .15;
        double subtotal = price1 + price2+ price3;
        double totalTax = subtotal*taxRate;
        double totalTip = subtotal*tip;
        double total = subtotal + totalTax + totalTip;

        System.out.println ("Subtotal:" + subtotal);
        System.out.println("Tax:" + totalTax);
        System.out.println("Tip:" + totalTip);
        Challenge_2_Pattern.Line();
        System.out.println("Total:" + total);
    }
}

