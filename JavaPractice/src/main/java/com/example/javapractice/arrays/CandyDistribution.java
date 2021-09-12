package com.example.javapractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CandyDistribution {

    public static void main(String[] arg) {
        int[] a = {4,6,4,5,6,2};
        List<Integer> ints = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            ints.add(a[i]);
        }
//        long minimalCandyDistribution = findMinimalCandyDistribution(a.length, ints);
//        System.out.println("minimalCandyDistribution: "+minimalCandyDistribution);

        long candyDistribution = findMinimalCandyDistributionUsingArray(a.length, a);
        System.out.println("minimalCandyDistribution: "+candyDistribution);
    }

    private static long findMinimalCandyDistributionUsingArray(int n, int[] a) {
        int[] c = new int[n];
        Arrays.fill(c,1);
        for (int i = 1; i < n; i++) {
            if (a[i]> a[i-1]) {
                c[i] = c[i-1]+1;
            }
        }
        System.out.println("C array from right to left: "+Arrays.toString(c));
        for (int i = n-2; i >= 0; i--) {
            if (a[i] > a[i+1]){
                c[i] = Math.max(c[i+1]+1,c[i]);
            }
        }
        System.out.println();
        System.out.println("C array from right to left: "+Arrays.toString(c));
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (long)c[i];
            System.out.println("sum: "+sum);
        }
        return sum;
    }



    private static long findMinimalCandyDistribution(int n,List<Integer> a) {
        List<Integer> candies = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candies.set(i,1);
        }

        for (int i = 1; i < n; i++) {
            if (a.get(i) > a.get(i-1)){
               candies.set(i,candies.get(i-1) +1);
            }
        }

        for (int i = n-2; i >= 0; i--) {
            if (a.get(i) > a.get(i+1)) {
                candies.set(i,Math.max(candies.get(i+1)+1,candies.get(i)));
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + (long) candies.get(i);
        }

        return sum;
    }
}
