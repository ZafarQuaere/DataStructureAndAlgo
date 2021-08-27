package com.example.javapractice.strings;

import java.util.Arrays;

public class Anagram {
    static boolean isAnagram = true;

    public static void main(String[] arg) {
        String first = "abbdd";//"abdc";
        String second = "dabadb";//"acdbe";
//        checkAnagram(first,second);
        anagramUsingCharArr(first, second);
    }

    private static void anagramUsingCharArr(String first, String second) {
        if (first.length() != second.length()) {
            System.out.println("strings are not anagram ");
            return;
        }
        int position = 0;
        char value = 0;
        int[] arr = new int[256];
        for (char c : first.toCharArray()) {
            int index = (int) c;
            arr[index]++;
        }
        System.out.println("Value after string1 " + Arrays.toString(arr));

        for (char c : second.toCharArray()) {
            int index = (int) c;
            arr[index]--;
        }
        System.out.println("Value after string2 " + Arrays.toString(arr));

        for (int i = 0; i < 256; i++) {
            if (arr[i] != 0) {
                isAnagram = false;
                position = i;
                value = (char) i;
                break;
            }
        }

        if (isAnagram)
            System.out.println("This string is anagram");
        else
            System.out.println("This string is not anagram");
        System.out.println("Position is : " + position + " and value is " + value);
    }

    private static void checkAnagram(String first, String second) {
        // check length of both string same or not
        if (first.length() != second.length()) {
            System.out.println("strings are not anagram ");
            return;
        }

    }
}
