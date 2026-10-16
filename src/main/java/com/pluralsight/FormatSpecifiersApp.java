package com.pluralsight;

public class FormatSpecifiersApp {
    public static void main(String[] args) {
        int id = 10135;
        String name = "Brandon Plyers";
        float pay = 5239.77f;

        // Using format specifiers to combine strings, decimals, and currency formatting
        System.out.printf("%s (id: %d) $%.2f%n", name, id, pay);
    }
}