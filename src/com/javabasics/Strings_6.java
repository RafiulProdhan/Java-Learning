package com.javabasics;

import java.util.Locale;

public class Strings_6 {
    public static void main(String[] args) {

        String message = "Hello my name is Rafiul" + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("R"));
        System.out.println(message.replace("Rafiul", "Jahidul"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
    }
}
