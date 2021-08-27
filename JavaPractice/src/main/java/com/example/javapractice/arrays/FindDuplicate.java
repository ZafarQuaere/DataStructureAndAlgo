package com.example.javapractice.arrays;

import java.util.HashSet;

public class FindDuplicate {
    public static void main(String[] arg){
        int[] arr = {10, 20, 20, 30, 30, 40, 50, 50};
        findDuplicate(arr);
        findDuplicateFor(arr);
    }


    private static void findDuplicateFor(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate value is "+arr[i]+" at index :"+i);
                }
            }
        }
        System.out.println();
        System.out.println();
    }

    private static void findDuplicate(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hs.add(arr[i])) { // hs.add() returns true if it is not duplicate entry, false for duplicate entry
                System.out.println("Duplicate value is "+arr[i]+" at index :"+i);
            }
        }

        System.out.println();
        System.out.println();
    }
}
