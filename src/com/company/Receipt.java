package com.company;

public class Receipt {

    public static void main(String[] args) {

        double taxRate = .08;
        double tip = .15;
        int  subtotal = 38 + 40 +30;
        double totalTax = subtotal*taxRate;
        double totalTip = subtotal*tip;
        double total = subtotal + totalTax + totalTip;

        System.out.println ("Subtotal:" + subtotal);
        System.out.println("Tax:" + totalTax);
        System.out.println("Tip:" + totalTip);
        System.out.println("Total:" + total);
    }
}

