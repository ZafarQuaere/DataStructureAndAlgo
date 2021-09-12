package com.example.javapractice.cisco;

public class ReverseString {
    public static void main(String[] arg) {
        String val = "geeks quiz practice code";
        reverseString(val);
    }

    private static void reverseString(String val) {
        StringBuilder builder = new StringBuilder(val);
        StringBuilder reverse = builder.reverse();
        System.out.println(reverse);
        System.out.println();
        System.out.println();
        String[] s = val.split(" ");

    }
}
