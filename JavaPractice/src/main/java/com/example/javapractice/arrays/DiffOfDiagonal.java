package com.example.javapractice.arrays;

public class DiffOfDiagonal {

    public static void main(String[] arg) {
        int[][] twoDimArr = {
                {1,2,3},
                {4,5,6},
                {9,8,9}
        };
        findTheDiff(twoDimArr);
    }

    private static void findTheDiff(int[][] twoDimArr) {
        //sum of left to right diagonal
        int leftDSum = 0;
        int rightDSum = 0;
        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr.length; j++) {
                if (i == j)
                    leftDSum = leftDSum+twoDimArr[i][j];
                if (i == twoDimArr.length - j -1){
                    rightDSum = rightDSum + twoDimArr[i][j];
                }
            }
        }
        System.out.println("Difference of diagonal is: "+Math.abs(leftDSum-rightDSum));
    }
}
