package com.example.java;

public class FieldError {
    public static void main(String[] args) {
        // define some fields
        int number = 2;
        char key = 'K';
        String greeting = "Saluton mondo!";
        String name = "Mr. Jones";
        String quote;
        quote = "There is no aspect, no facet, no moment of life that can't be improved with pizza.";

        // test illegal field names
        int _ = 33; // Error: '_' is a keyword, and may not be used as an identifier
        int my-Variable Name; // special characters are not allowed and neither are spaces

        // uninitialized values and local variables
        int age;
        System.out.println(age); // Error: variable age might not have been initialized

        boolean isTomorrowAWeekDay = true;
        if (isTomorrowAWeekDay == true) {
            boolean timeToParty = false;
        }
       System.out.println(timeToParty); // Error: cannot find variable timeToParty
    }
}