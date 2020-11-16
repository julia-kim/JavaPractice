package com.example.java;

import static java.lang.Math.*;

public class Calculator {
    public static int add(int x, int y) {
        return x + y;
    }
    public static int subtract(int x, int y) {
        return x - y;
    }
    public static int multiply(int x, int y) {
        return x * y;
    }
    public static int divide(int x, int y) {
        return x / y;
    }
    public static int square(int x) {
        return x * x;
    }
}

class MagicCalculator extends Calculator {
    public double squareRoot(int x) {
        return sqrt(x);
    }
    public double sine(int x) {
        return sin(x);
    }
    public double cosine(int x) {
        return cos(x);
    }
    public double tangent(int x) {
        return tan(x);
    }
    public double factorial(int x) {
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
