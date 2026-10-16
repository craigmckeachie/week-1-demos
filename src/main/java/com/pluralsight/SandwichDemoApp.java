package com.pluralsight;

public class SandwichDemoApp {

    public static void main(String[] args) {

        int sandwichSize = 1; // 1: Regular ($5.45) 2: Large ($8.95)
        boolean isRegular = sandwichSize == 1;
        boolean isLarge = sandwichSize == 2;

        int age = 55;
        double price = 0.0;


        // Step 1: Determine base price based on size
        if (isRegular) {
            price = 5.45;
        }

        if (isLarge){
            price = 8.95;
        }

        // Step 2: Determine discount based on age
        if (age <= 17) {
            price = price * .90; //10% discount for students
        } else if (age >= 65) {
            price = price * .80; //20% discount for seniors
        } else {
            System.out.println("No discount needed.");
        }


        // Step 3: Print final cost
        System.out.println(price);

    }
}
