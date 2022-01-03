package com.javabasics;

public class Casting_12 {
    public static void main(String[] args) {
    // Implicit Casting
        // byte > short > int > long > float > double
        short x = 1;
        int y = x+2;
        System.out.println(y);

        double a = 3.25;
        int b = (int)a + 10; // In order to make number whole you must do explicit cast
        System.out.println(b);

        String z = "1";
        int h = Integer.parseInt(z) + 2; //'Integer.parseInt()' - is used to convert 'String' into 'int'
        System.out.println(h);

        String l = "1.1";
        double m = Double.parseDouble(l) + 2; //'Double.parseDouble()' - is used to convert 'String' into 'double'
        System.out.println(m);


    }
}
