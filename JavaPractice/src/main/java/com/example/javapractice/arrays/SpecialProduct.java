package com.example.javapractice.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Implement a function which, given an array of integers, returns a new array for
which every index carries the value of the product of the remaining elements.
Example
Given array [1, 3, 2, 4, 5] it would return [120, 40, 60,30, 24]
Given array [4, 10, 3] it would return [30, 12, 40]

Function Description
The function findSpecialProduct accepts the following parameters
An array of integers "input" of size n.
The function must return a new array of size n in which every index carries the value of
the product of the remaining elements.
 */
public class SpecialProduct {

    public static void main(String[] arg){
        int[] arr1 = {1, 3, 2, 4, 5};
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        List<Integer> specialProdUsingList = findSpecialProdUsingList(input);
        System.out.println("specialProdUsingList: "+Arrays.toString(specialProdUsingList.toArray()));
        findSpecialProduct(arr1);
    }

    private static List<Integer> findSpecialProdUsingList(List<Integer> input) {
        List<Integer> prod = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            int product = 1;
            for (int j = 0; j < input.size(); j++) {
                if (i != j){
                    product = product * input.get(j);
                }
            }
            prod.add(product);
        }
        return prod;
    }

    private static void findSpecialProduct(int[] arr1) {
        System.out.println("Given array: "+ Arrays.toString(arr1));
        int[] prodArr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr1.length; j++) {
                if (i != j){
                    prod = prod * arr1[j];
                }
            }
            prodArr[i] = prod;
        }
        System.out.println("Output: "+ Arrays.toString(prodArr));
    }

}
