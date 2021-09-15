package com.example.javapractice.sorting;
// source: https://www.geeksforgeeks.org/insertion-sort/

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] arg) {
        int arr[] = {12,11,15,5,6,14,4};
        InsertionSort is = new InsertionSort();
        is.sortUsingInsertion(arr);
    }

    private void sortUsingInsertion(int[] arr) {
        System.out.println("Array before sort: "+ Arrays.toString(arr));

        // start loop from position 1
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i]; // key element with which i need to compare the other elements
            int j = i - 1; // previous position
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        System.out.println("Array after sort: "+Arrays.toString(arr));
    }
}
