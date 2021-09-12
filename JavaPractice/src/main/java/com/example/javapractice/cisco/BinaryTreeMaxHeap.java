package com.example.javapractice.cisco;

/*
Input:  arr[] = {90, 15, 10, 7, 12, 2}
Output: True
The given array represents below tree
       90
     /    \
   15      10
  /  \     /
 7    12  2
The tree follows max-heap property as every
node is greater than all of its descendants.

 */
// Java program to check whether a given array represents a max-heap or not
public class BinaryTreeMaxHeap {

    public static void main(String[] arg) {
//        int arr[] = {90, 15, 10, 7, 12, 2, 7, 3};
        int arr[] = {9, 15, 10, 7, 12, 11};
        int n = arr.length;
        if (isHeap(arr, n))
            System.out.println("yes array is binary heap");
        else System.out.println("yes array is not a binary heap");
    }

    // returns true if arr[i..n-1] represent a max heap
    private static boolean isHeap(int[] arr, int n) {
        // start from root and go till the last internal node
        for (int i = 0; i <= (n - 2) / 2; i++) {
            //if left child greater, return false
            if (arr[2 * i + 1] > arr[i])
                return false;
            // if right child greater, return false
            if (2 * i + 2 < n && arr[2 * i + 2] > arr[i])
                return false;
        }
        return true;
    }
}
