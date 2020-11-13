package com.example.java;

import java.util.Scanner;

public class AsciiChars {
    public static void main(String[] args) {
        // print the valid characters for input
        // AsciiChars.printNumbers();
        // AsciiChars.printUpperCase();
        // AsciiChars.printLowerCase();

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello " + name + "!");
        System.out.print("Do you wish to continue to the interactive portion (y/n)? ");
        String answer = sc.next();
        boolean no = answer.equalsIgnoreCase("n") || answer.equalsIgnoreCase("no");
        boolean yes = answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("yes");
        if (no || !yes) {
            System.out.println("Please return later to complete the survey.");
            sc.close();
            System.exit(0);
        } else if (yes) {
            boolean user = true;
            do {
                System.out.print("What is the name of your favorite pet? ");
                String petName = sc.next();
                AsciiChars.errorCheck("What is the age of your favorite pet? ", sc);
                int petAge = sc.nextInt();
                AsciiChars.errorCheck("What is your lucky number? ", sc);
                int luckyNo = sc.nextInt();
                System.out.print("Do you have a favorite quarterback (y/n)? ");
                String favoriteQB = sc.next();
                AsciiChars.errorCheck("If 'yes' to the above, what is their jersey number (enter 0 to skip)? ", sc);
                int jerseyNo = sc.nextInt();
                AsciiChars.errorCheck("What is the two-digit model year of your car (2017 = 17)? ", sc);
                int modelYear = sc.nextInt();
                System.out.print("What is the first name of your favorite actor or actress? ");
                String favoriteActor = sc.next();
                AsciiChars.errorCheck("Enter a random number between 1 and 50. ", sc);
                int randomNo = sc.nextInt();
                while (randomNo < 1 || randomNo > 50) {
                    AsciiChars.errorCheck("Please enter a number between 1 and 50. ", sc);
                    randomNo = sc.nextInt();
                }

                int magicNo;
                // user favorite quarterback jersey number or lucky number, multiplied by a random number
                if (jerseyNo > 0) {
                    magicNo = jerseyNo * randomNo;
                } else if (luckyNo > 0) {
                    magicNo = luckyNo * randomNo;
                } else {
                    magicNo = 75;
                }
                while (magicNo > 75) {
                    magicNo -= 75;
                }

                int one;
                int two;
                int three;
                int four;
                int five;

                one = (int) petName.charAt(2); // find the 3rd letter of their favorite pet and convert to an integer
                two = modelYear + luckyNo; // use the two digit model year of their car and add their lucky number to it
                three = (int) favoriteActor.charAt(0); // convert first letter of their favorite actor to an integer
                four = (int) favoriteActor.charAt(favoriteActor.length() - 1); // convert last letter of favorite actor to an integer
                five = 42; // the answer is 42

                // create array to store lotto numbers and initialize with length of 5
                int[] lotteryNumbers = new int[5];
                lotteryNumbers[0] = one;
                lotteryNumbers[1] = two;
                lotteryNumbers[2] = three;
                lotteryNumbers[3] = four;
                lotteryNumbers[4] = five;

                // adjust each value to be between 1 and 65
                for (int i = 0; i < lotteryNumbers.length; i++) {
                    while (lotteryNumbers[i] > 65) {
                        lotteryNumbers[i] -= 65;
                    }
                }
                // remove duplicates and sort array in ascending order
                for (int i = 0; i < lotteryNumbers.length; i++) {
                    for (int j = i+1; j < lotteryNumbers.length; j++) {
                        if (lotteryNumbers[i] == lotteryNumbers[j] || lotteryNumbers[i] <= 0) {
                            lotteryNumbers[i]++;
                        }
                        if (lotteryNumbers[i] > lotteryNumbers[j]) {
                            int temp = lotteryNumbers[i];
                            lotteryNumbers[i] = lotteryNumbers[j];
                            lotteryNumbers[j] = temp;
                        }
                    }
                }
                System.out.print("Lottery numbers: ");
                for (int num : lotteryNumbers) {
                    System.out.print(num + " ");
                }
                System.out.println("Magic ball: " + magicNo);

                System.out.print("Would you like to generate another set of numbers? (y/n)? ");
                String again = sc.next();
                if (again.equalsIgnoreCase("n")) {
                    System.out.println("Thanks for playing!");
                    sc.close();
                    user = false;
                } else {
                    user = true;
                }
            } while (user);
        }
    }

    public static void printNumbers() {
        for (int i = 48; i <= 57; i++) {
            System.out.print((char) i);
        }
    }

    public static void printUpperCase() {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i);
        }
    }

    public static void printLowerCase() {
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i);
        }
    }

    // does error checking for questions that ask for a number
    public static void errorCheck(String question, Scanner sc) {
        boolean err = true;
        do {
            System.out.print(question);
            if (!sc.hasNextInt()) {
                System.out.print("Valid characters are ");
                AsciiChars.printNumbers();
                System.out.print(". Please try again.\n");
                sc.next();
            } else {
                err = false;
            }
        } while (err);
    }
}
