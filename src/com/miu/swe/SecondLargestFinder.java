package com.miu.swe;

public class SecondLargestFinder {

    // Function to determine the second-largest value in an array of integers
    public static int getSecondLargest(int[] inputArray) {
        if (inputArray.length < 2) {
            throw new IllegalArgumentException("Input array must have at least two elements.");
        }

        int maxVal = Integer.MIN_VALUE;
        int secondMaxVal = Integer.MIN_VALUE;

        // Loop through the array to find the first and second largest numbers
        for (int element : inputArray) {
            if (element > maxVal) {
                secondMaxVal = maxVal;
                maxVal = element;
            } else if (element > secondMaxVal && element != maxVal) {
                secondMaxVal = element;
            }
        }

        return secondMaxVal;
    }

    public static void main(String[] args) {
        int[] dataset1 = { 31, 8, 13, 4, 15 };
        System.out.println("The second-largest value in the array [31, 8, 13, 4, 15] is: " + getSecondLargest(dataset1));

        System.out.println("-----------------");

        int[] dataset2 = { 19, 19, 11, 0, 12 };
        System.out.println("The second-largest value in the array [19, 19, 11, 0, 12] is: " + getSecondLargest(dataset2));
    }
}