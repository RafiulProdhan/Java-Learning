package com.javabasics;

import java.util.Date;

public class ReferenceType_4 {

    public static void main(String[] args) {
    // Reference Types - Store complex data types like dates, mail message, etc
        byte age = 30;
        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);
        //Above code block x and y are independent of each other




    }
}
