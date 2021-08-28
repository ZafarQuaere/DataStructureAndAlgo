package com.example.javapractice.strings;

import java.util.Stack;

public class ReverseString {

    public static void main(String[] arg){
        String str = "I Love Android Programming, Kotlin is best for it.";

        System.out.println("Main String: "+str);
        String reverse = reverseString(str); // it reversed all the alphabet as well.
        System.out.println("Reverse String: "+reverse);

        System.out.println();
        System.out.println();
        System.out.println("Reverse Recursively: "+reverseStringRecursively(str));

        System.out.println();
        System.out.println();
        // we need to reverse only words. so taking another approach
        System.out.println("Reverse Using Loop >> : "+ reverseUsingLoop(str));

        System.out.println();
        System.out.println();
        System.out.println("Reverse Using Stack: "+reverseStringUsingStack(str));

        System.out.println();
        System.out.println();
        System.out.println("Reverse Using Apni Kaksha: "+reverseApniKaksha(str));
    }

    private static String reverseApniKaksha(String str) {
        int i = str.length() -1;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {

            while (i >= 0 && str.charAt(i) == ' ') i--; // here breaking when one word is completed
            int j = i;
            if (i < 0) {
                break;
            }

            while (i >= 0 && str.charAt(i) != ' ') i--;
            if (sb.equals("")){
                sb.append(str.substring(i+1,j+1));
            } else {
                sb.append(" "+str.substring(i+1,j+1));
            }
        }
        return sb.toString();
    }

    private static String reverseStringUsingStack(String str) {
        String string = str.trim();
        String[] s = string.split(" ");
        Stack<String> stk = new Stack<>();
        for (String item : s) {
            stk.push(item);
        }
        StringBuilder sb = new StringBuilder();
        while (!stk.isEmpty())
            sb.append(stk.pop()+" ");
        return sb.toString();
    }

    private static String reverseUsingLoop(String str) {
        String string = str.trim();
        String[] s = string.split(" ");
        int start = 0;
        int end = s.length-1;
        String temp;
        while (start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for (String newS :s) {
            sb.append(newS +" ");
        }
//        return Arrays.toString(s);
        return sb.toString().trim();
    }

    private static String reverseString(String str) {
        StringBuilder builder = new StringBuilder(str);
        StringBuilder reverse = builder.reverse();
        return reverse.toString();
    }

    private static String reverseStringRecursively(String str) {
        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }
        return reverseStringRecursively(str.substring(1)) + str.charAt(0);
    }
}
