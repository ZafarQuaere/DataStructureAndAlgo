package com.example.javapractice.arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] arg){
        int[] arr = new int[]{1,3,4,5,6,7};
        reverseArray(arr);
    }
    /*
     * Reverse Method with parameter of array, start(Index with 0) , end(Index of
     * last element) and the n for number of elements to be Inserted for Reverse.
     */
    private static void reverseArray(int[] arr) {
        System.out.println("Before reverse : "+ Arrays.toString(arr));
        int start = 0;
        int end = arr.length -1;
        int temp;

        while (start < end) {
            // swapping array data using index
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("After reverse : "+ Arrays.toString(arr));
    }
}
