package com.example.java;

import java.util.Arrays;

public class DataStructures {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6}; // arbitrary array
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }

        double[ ] exampleArray = {1, 5, 6, 5, 4, 1};
        double maximum = exampleArray[0];
        int index = 0;
        for (int i = 1; i < exampleArray.length; i++){
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i];
                index = i;
            }
        }
        System.out.println(index); // output is 2
    }

    public static double[] toPower(int size, int power) {
        double[] poweredUp = new double[size];
        for (int i = 0; i < poweredUp.length; i++) {
            poweredUp[i] = Math.pow(i, power);
        }
        return poweredUp;
    }
}