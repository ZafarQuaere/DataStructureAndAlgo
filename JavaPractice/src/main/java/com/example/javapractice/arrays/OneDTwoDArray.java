package com.example.javapractice.arrays;

import java.util.Arrays;

/*
Given a integer n. We have n*n values of a 2-d array, and  n values of 1-d array.
Task is to find the sum of the left diagonal values of the 2-d array and the max element
of the 1-d array and print them with space in between.
Input : arr[][] = {{1,2,3}, {4,5,6}, {7, 8,9}}
        and N = 3
brr[] = {3, 6, 9}
Output : 15 9
Explanation:
1 2 3
4 5 6
7 8 9
So, this sum of left diagonal (1+ 5 + 9) = 15
The maximum element in an array brr is 9
So, will return {15, 9} as an answer.
 */
public class OneDTwoDArray {

    public static void main(String[] arg) {
        int[][] twoDimArr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[] arr = {3,6,9};
        findAndPrintOutput(twoDimArr,arr);
        int[] rotate = {1,2,4,5,3,6,9,3};
        rotateArrayBy1Position(rotate); // {1,2,4,5,3,6,9,3} to {3,1,2,4,5,3,6,9};
    }

    private static void rotateArrayBy1Position(int[] value) {
        System.out.println("Array before rotation: "+Arrays.toString(value));
        int x = value[value.length - 1];
        for (int i = value.length-1; i > 0; i--)
            value[i] = value[i-1];
        value[0] = x;
        System.out.println("Array after rotation: "+Arrays.toString(value));
    }

    private static void findAndPrintOutput(int[][] twoDimArr, int[] arr) {
        // max number in 1D array is
        Arrays.sort(arr);
        int max = arr[arr.length-1];

        //find the sum of diagonal
        int sum = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr.length; j++) {
                if (i == j) {
                    sum = sum +twoDimArr[i][j];
                }
            }
        }
        System.out.println("Sum is: "+sum +" max: "+max);
    }
}
