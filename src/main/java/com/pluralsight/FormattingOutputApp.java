package com.pluralsight;

public class FormattingOutputApp {
    public static void main(String[] args) {
        float subtotal = 22.87f;
        float tax = subtotal * 0.0825f;
        float totalDue = subtotal + tax;

        // 1. Using the String class's format() method
        System.out.println("Total due is: " + String.format("%.2f", totalDue));

        // 2. Using the printf() method directly
        System.out.printf("Total due (using printf): $%.2f%n", totalDue);
    }
}