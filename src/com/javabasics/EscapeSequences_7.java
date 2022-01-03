package com.javabasics;

public class EscapeSequences_7 {
    public static void main(String[] args) {
        // '\"' - if you want to include quotes on output
        String message = "Hello \"Rafiul\"";
        // '\\' - if you want to include '|' in output
        String message2 = "File can be found c:\\Windows\\...";
        // 'n' - creates separate line
        String message3 = "File can be found c:\nWindows\\...";
        // 't' - creates tab
        String message4 = "File can be found c:\tWindows\\...";
        System.out.println(message);
        System.out.println(message2);
        System.out.println(message3);
        System.out.println(message4);

    }
}
