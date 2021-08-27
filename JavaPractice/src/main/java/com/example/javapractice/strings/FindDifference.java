package com.example.javapractice.strings;

import java.util.HashMap;
import java.util.Map;

public class FindDifference {
    public static void main(String[] arg) {
//        String s = "abcd";
//        String t = "cbdae";
//        String s = "";
//        String t = "y";
//        String s = "aaaa";
//        String t = "aabaa";
        String s = "ae";
        String t = "aae";
//        findTheDiff(s,t);// this approach did not worked, check this tomorrow
        findDifference(s,t);
        findDiffUsingMap(s,t);
    }

    private static void findDiffUsingMap(String s, String t) {
        // adding both string, so the value of every character will get double(even number) and the difference will be an odd number
        // put all char into map as key value pair, and increment count if it is already there.
        String value = s+t;
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        for (int i = 0; i < value.length(); i++) {
            int count = 1;
            if (map.containsKey(value.charAt(i))){
                count = map.get(value.charAt(i)) + 1;
            }
            map.put(value.charAt(i),count);
        }

        for (int i = 0; i < value.length(); i++) {
            int noOfTime = map.get(value.charAt(i));
            if (noOfTime%2 != 0) {
                System.out.println("Using Map The Difference is "+ value.charAt(i));
            }
        }
    }

    private static void findDifference(String s, String t) {
        int[] arrA = new int[256];
        for (char c : s.toCharArray()) {
            int index = (int) c;
            arrA[index]++;
        }
        for(char c: t.toCharArray()){
            int index = (int) c;
            arrA[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (arrA[i] != 0){
                System.out.println("The Difference is "+(char)i);
            }
        }
    }

    private static void findTheDiff(String s, String t) {
        int[] arrA = new int[256];
        for (char c : s.toCharArray()) {
            int index = (int) c;
            arrA[index]++;
        }
        for(char c: t.toCharArray()){
            int index = (int) c;
            arrA[index]--;
        }
        for (int i = 0; i < 256; i++) {
            if (arrA[i] != 0){
                System.out.println("The Asci value of that char is "+ (char) i);
            }
        }
    }
}
