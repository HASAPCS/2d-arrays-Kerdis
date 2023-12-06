package com.example;

import java.lang.reflect.Array;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print a 2D Array
        int[][] array = {{1,2,3}, {4,5,6},{7,8,9}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[i][j] + " ");
            }
        }
        // TODO: Initialize a 2D array of integers and print its contents in a matrix form.
    }

    // Exercise 2: Find the Maximum Value in a 2D Array
    public static int findMaximumValue(int[][] array) {
        // TODO: Implement the logic to find the maximum value in the 2D array.
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] > num) {
                    num = array[i][j];
                }
            }
        }
        return num; // Placeholder return value
    }

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        // TODO: Implement the logic to check if the 2D array contains the specified value.
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == value) {
                    return true;
                }
            }
        }
        return false; // Placeholder return value
    }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        // TODO: Implement the logic to calculate the average of all elements in the 2D array.
        return sum/count; // Placeholder return value
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        // TODO: Calculate and return the sum of diagonal elements in the 2D array.
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum; // Placeholder return value
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        // TODO: Implement the logic to flatten the 2D array into a 1D array.
        int num = 0;
        int count = 0;
    

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                count++;
            }
        }
        
        int[] testArray = new int[count];
        
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                testArray[num] = array[i][j];
                num++;
            }
        }
        return testArray; // Placeholder return value
    }
}
