package com.javabasics;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class NumberFormatting_14 {
    public static void main(String[] args) {

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String result = currency.format(132549.254);
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result1 = percent.format(.75);
        System.out.println(result1);

    }
}
