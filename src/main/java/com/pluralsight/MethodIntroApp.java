package com.pluralsight;

public class MethodIntroApp {
    public static void main(String[] args) {
        // 1. Simple effect methods (page 110)
        foo();
        moo();
        System.out.println("--------------------");

        // 2. Passing data as arguments (page 110)
        int a = 4, b = 9, c = 10, d = 3;
        addAndDisplay(a, b);
        addAndDisplay(b, c);
        System.out.println("--------------------");

        // 3. Returning data from methods (page 111-112)
        int difference = subtract(10, 5);
        int sum = add(2, 2);

        System.out.println("Difference: " + difference);
        System.out.println("Sum: " + sum);
    }

    public static void foo() {
        System.out.println("Foo");
    }

    public static void moo() {
        System.out.println("Moo");
    }

    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d%n", num1, num2, sum);
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int add(int x, int y) {
        return x + y;
    }
}