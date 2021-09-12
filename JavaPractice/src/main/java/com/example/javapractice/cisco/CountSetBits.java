package com.example.javapractice.cisco;

public class CountSetBits {
    public static void main(String[] arg) {
        int i = 9;
        System.out.println(findSetBits(i));
        bitCount(i);
        bitCountUsingRec(5);
    }

    private static void bitCountUsingRec(int i) {
      int noOfBit =   findBit(i);
        System.out.println("No of bits is: "+noOfBit);
    }

    private static int findBit(int i) {
        if (i == 0) return 0;
        if (i == 1) return 1;
        if (i % 2 == 0) return findBit(i/2);
        else return 1+ findBit(i/2);
    }

    private static int findSetBits(int i) {
        int count = 0;
        while (i > 0) {
            count += i & 1;
            i >>= 1;
        }
        return count;
    }

    public static void bitCount(int i){
        System.out.println(Integer.bitCount(i));
//        System.out.println(Integer.bitCount(15));
    }
}
