package com.example.javapractice.arrays;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] arg){
        findTheOutput();
        checkSame();
    }

    private static void checkSame() {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};

        if (arr1 == arr2) // comparing using reference, it is false;
            System.out.println("Same");
        else
            System.out.println("Not same");

        if (Arrays.equals(arr1, arr2)) // Comparing content, it is true
            System.out.println("Same");
        else
            System.out.println("Not same");

        if (arr1.equals(arr2)) // arr1.equals(arr2) is same as (arr1 == arr2) , it is false
            System.out.println("Same");
        else
            System.out.println("Not same");
    }

    private static void findTheOutput() {
        int arr[][] = new int[4][];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int[3];
        arr[3] = new int[4];

        int i, j, k = 0;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                arr[i][j] = k;
                k++;
            }
        }
        for (i = 0; i < 4; i++) {
            for (j = 0; j < i + 1; j++) {
                System.out.print(" " + arr[i][j]);
                k++;
            }
            System.out.println();
        }
    }
}
