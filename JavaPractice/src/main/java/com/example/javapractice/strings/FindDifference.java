package com.example.javapractice.strings;

public class FindDifference {
    public static void main(String[] arg) {
        String s = "abcd";
        String t = "cbdae";
        findTheDiff(s,t);// this approach did not worked, check this tomorrow
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
                System.out.println("The Asci value of that char is "+arrA[i]);
            }
        }
    }
}
