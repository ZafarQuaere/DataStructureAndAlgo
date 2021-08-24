package com.example.javapractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] arg) throws IOException {
//        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number: ");
        //        int num = Integer.parseInt(bfr.readLine());
//        Scanner sc = new Scanner(System.in);
//        int num = 0;
//        if (sc.hasNextLine()){
//            num = sc.nextInt();
//        }
//        sc.close();

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