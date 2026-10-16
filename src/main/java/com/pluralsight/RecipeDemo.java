package com.pluralsight;

public class RecipeDemo {
    public static void main(String[] args) {
        printHeader();

        double originalPrice = 12.50;
        double scaledPrice = calculateTotal(originalPrice, 3);

        System.out.printf("Total for 3 items: $%.2f%n", scaledPrice);
    }


    public static void printHeader() {
        System.out.println("=== BAKERY RECIPE CALCULATOR ===");
    }


    public static double calculateTotal(double pricePerItem, int quantity) {
        double total = pricePerItem * quantity;
        return total;
    }
}