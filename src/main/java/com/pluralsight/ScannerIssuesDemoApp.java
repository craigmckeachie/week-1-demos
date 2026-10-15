package com.pluralsight;

import java.util.Scanner;

public class ScannerIssuesDemoApp {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = inputScanner.nextLine();

        System.out.print("Enter your age: ");
        int age = inputScanner.nextInt();
        String newLine = inputScanner.nextLine(); //eat the new line
        System.out.println(newLine);

        System.out.println("Enter your favorite TV Show: ");
        String showName = inputScanner.nextLine();



        System.out.print("Enter the value of your car: ");
        double carValue = inputScanner.nextDouble();

        System.out.println("Hi " + firstName + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("Your show is: " + showName);
        System.out.println("You car is worth: $" + carValue);



    }
}
