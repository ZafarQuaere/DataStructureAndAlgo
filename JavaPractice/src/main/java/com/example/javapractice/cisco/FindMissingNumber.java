package com.example.javapractice.cisco;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] arg) {
        int arr[] = {1, 2, 4, 6, 3, 7, 8};
        findMissingNo(arr);
    }

    private static void findMissingNo(int[] arr) {
        System.out.println("existing array: " + Arrays.toString(arr));
        //sum of all integer numbers is n*(n+1)/2
        int n = arr.length + 1;
        int sumOfAll = n * (n + 1) / 2;
        int sumOfArr = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfArr += arr[i];
        }
        int missingNo = sumOfAll - sumOfArr;
        System.out.println("Missing No is: " + missingNo);
    }
}
