package com.miu.swe;

public class GreetingPrinter {

    // Method to print greetings based on the divisibility of each number in an array
    public static void displayGreeting(int[] inputArray) {
        for (int value : inputArray) {
            if (value % 5 == 0 && value % 7 == 0) {
                System.out.println("GreetingWorld");
            } else if (value % 5 == 0) {
                System.out.println("Greeting");
            } else if (value % 7 == 0) {
                System.out.println("World");
            }
        }
    }

    public static void main(String[] args) {
        int[] sampleNumbers = { 10, 14, 25, 35, 49, 70 };
        displayGreeting(sampleNumbers);
    }
}