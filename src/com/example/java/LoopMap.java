package com.example.java;

import java.util.*;

public class LoopMap {
    public int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum += number;
        }
        return sum;
    }

    public int product(ArrayList<Integer> list) {
        int product = 1;
        for (int number : list) {
            product *= number;
        }
        return product;
    }

    public int smallest(ArrayList<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
            return min;
    }

    public int largest(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    public ArrayList<Integer> storeUserInput(Scanner sc) {
        int listSize = 5;
        ArrayList<Integer> userNumbers = new ArrayList<>(5);

        System.out.println("Please input 5 numbers.");
        for(int i = 0; i < listSize; i++) {
            if (i == 0) {
                System.out.print("Enter first number: ");
            } else if (i > 0 && i < listSize - 1) {
                System.out.print("Enter next number: ");
            } else if (i == listSize - 1) {
                System.out.print("Enter final number: ");
            }
            while (!sc.hasNextInt()) {
                System.out.print("Please enter a number: ");
                sc.next();
            }
            userNumbers.add(sc.nextInt());
        }
        sc.nextLine();
        return userNumbers;
    }

    public void printNumberData(ArrayList<Integer> userNumbers, Scanner sc) {
        Object[] arr = userNumbers.toArray();
        String str = Arrays.toString(arr);
        System.out.println("Your numbers are: " + str.replace("[","").replace("]","").replace(",", " "));
        System.out.printf("The smallest number is %s. \nThe largest number is %s. \nThe sum of all the numbers is %s." +
                        " \nThe product of all the numbers is %s.\n", this.smallest(userNumbers), this.largest(userNumbers), this.sum(userNumbers), this.product(userNumbers));
    }

    public void carDealer(Scanner sc) {
        HashMap<String, String> cars = new HashMap<>(); // <model, make>
        cars.put("Renegade", "Jeep");
        cars.put("Accord", "Honda");
        cars.put("Sonata", "Hyundai");
        cars.put("Palisade", "Hyundai");
        cars.put("Pacifica", "Chrysler");
        cars.put("Grand Cherokee", "Jeep");

        System.out.println("What car model are you looking for?");
        String model = sc.nextLine();
        if (cars.containsKey(model)){
            System.out.println("Oh, you're looking for a " + model + "? Our " + cars.get(model) + " selection is " +
                    "right over here...");
        } else {
            System.out.println("I'm sorry, we don't have any " + model + "s in stock.");
        }
    }

    public static void main(String[] args) {
        LoopMap lm = new LoopMap();
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = lm.storeUserInput(sc);
        lm.printNumberData(list, sc);
        lm.carDealer(sc);
    }
}