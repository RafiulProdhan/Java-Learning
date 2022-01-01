package com.javabasics;

public class Main {

    public static void main(String[] args) {
        /**
         * Syntax above is used for multi-line comment
         * This is second line of comment
         */
        int a = 2;
        int b = 4;
        int c = a + b;
        // Above code is variable declaration
        int d;
        // Assigment of value into a declared variable
        d = 6;
        int d1 = 6;
        // Reassigned value of d1 container
        d1 = 8;
        // Make variable constant by using final key word
        final int d2 = 8;

        boolean agree = true;
        boolean disagree = false;
        /**
         * You have two photobooth packages at Donut Booths LLC
         * Package 'A' costs $750
         * Package 'B' costs $1000
         */
        char packageA = 'A';
        char packageB = 'B';
        // Variable names are in Lower Camel Case Convention
        String packageC = "UltimatePackage";

        /** Below is a 'Control Flow Statement'
         * The code is referred to as a 'Code Block'
         */

        if (packageA == 'A') {
            int packagePrice = 750;
            System.out.println("PackagePrice = $" + packagePrice);
        }
        else if (packageB == 'B') {
            int packagePrice = 1000;
            System.out.println("PackagePrice = $" + packagePrice);
        }
        else {
            System.out.println("I do not have enough money to book a Photo Booth");
        }


    }
}