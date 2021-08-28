package com.example.javapractice.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumOfTriplets {
    public static void main(String[] arg){
//        int [] arr = {0, -1, 2, -3, 1};
        int [] arr = {2,4, -1, 3, -4, 0,3};
        if (sumOfTriplest(arr)){
            System.out.println("Sum of triplets is Zero");
        } else {
            System.out.println("Sum of triplets is not Zero");
        }

        if(sumOfTriplestUsingTwoPointerAlgo(arr)){
            System.out.println("sumOfTriplestUsingTwoPointerAlgo Sum of triplets is Zero");
        } else {
            System.out.println("sumOfTriplestUsingTwoPointerAlgo Sum of triplets is Not Zero");
        }
    }

    private static boolean sumOfTriplestUsingTwoPointerAlgo(int[] arr) {
        // 1. sort the array
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            if(twoSum(arr,-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }

    private static boolean twoSum(int[] arr, int x,int i) {
        int j= arr.length-1;
        while (i < j){
            if (arr[i]+arr[j] > x){
                j--;
            } else if (arr[i] + arr[j] < x){
                i++;
            } else {
                return true;
            }
        }
        return false;
    }

    private static boolean sumOfTriplest(int[] arr) {
        if (arr.length > 3) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length ; j++) {
                    for (int k = 0; k < j + 1; k++) {
                        if (arr[i]+arr[j]+arr[k] == 0){
                            System.out.println("i= "+arr[i]+", j= "+arr[j]+", k= "+arr[k]);
                            return true;
                        }
                    }

                }
            }
        }
        return false;
    }
}
