package com.example.javapractice.strings;

public class Anagram {
    public static void main(String[] arg) {
        String first = "act";
        String second = "cat";
        checkAnagram(first,second);
    }

    private static void checkAnagram(String first, String second) {
        // check length of both string same or not
            if (first.length() != second.length()) {
                System.out.println("strings are not anagram ");
                return;
            }

    }
}
