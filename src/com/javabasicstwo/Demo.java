package com.javabasicstwo;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class Demo {

    public static void main(String[] args) {

        System.out.println("Hello World"+"=)");
        String message = "My name is Rafiul";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.replace("Rafiul", "Jahidul"));

        byte age = 30;
        Date now = new Date();
        System.out.println(now);

        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        int [] numbers = { 1, 2, 3, 4, 5 };
        System.out.println(numbers.length);
        System.out.println(Arrays.toString(numbers));









    }
}