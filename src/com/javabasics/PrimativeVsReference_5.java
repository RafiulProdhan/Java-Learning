package com.javabasics;

import java.awt.*;

public class PrimativeVsReference_5 {
    public static void main(String[] args) {

        byte x = 2;
        byte y = 2;
         Point point1 = new Point(x, y);
         Point point2 = point1;
         point1.y = 5;
         point1.x = 5;
        System.out.println(point2);









    }
}
