package com.example.javapractice;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] arg){
//        System.out.println("Enter any number :");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        int num = 4;
       int factorial =  findFactorial(num);
       System.out.println("Factorial of "+num+" is :"+factorial);
    }

    private static int findFactorial(int num) {
            if (num == 0)
                return 1;
        return num * findFactorial(num-1);
    }
}