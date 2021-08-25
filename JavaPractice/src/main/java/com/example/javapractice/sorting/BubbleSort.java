package com.example.javapractice.sorting;

public class BubbleSort {

    public static void main(String[] arg) {
        int arr[] = {2, 1, 8, -3, 6, 4, 12};
        System.out.println("Array before sort");
        for (int item : arr) {
            System.out.print(item + " ");
        }
        sortThis(arr);
    }

    private static void sortThis(int[] arr) {
        System.out.println();
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            boolean sorted = true; // this flag will be used to check if array is sorted at this time
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    sorted = false;  // if swap happend then array is not sorted, so flag is false
                }
            }
            if (sorted)
                break;
        }

        System.out.println("Array after sort");
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
