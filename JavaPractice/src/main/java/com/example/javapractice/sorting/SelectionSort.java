package com.example.javapractice.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] arg) {
        int[] values = {3, 6, 1, 8, 4, 5};
        System.out.println("Values before sorting :" + Arrays.toString(values));
        System.out.println();
        int[] sortedValues = sortUsingSelection(values);
        System.out.println("Values after sorting :" + Arrays.toString(sortedValues));
    }

    private static int[] sortUsingSelection(int[] values) {
        for (int i = 0; i < values.length; i++) {
            int min = i;
            for (int j = i; j < values.length; j++) {
                if (values[j] < values[min]) {
                    min = j;
                }
            }
            int temp = values[min];
            values[min] = values[i];
            values[i] = temp;
        }
        return values;
    }
}
