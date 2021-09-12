package com.example.javapractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from
1 to 100 for three categories: problem clarity, originality, and difficulty.

We define the rating for Alice's challenge to be the triplet a = (a[0],a[1],a[2]), and the rating for Bob's
challenge to be the triplet b = (b[0],b[1],b[2]).

Your task is to find their comparison points by comparing a[i] with b[i]

if a[i] > b[i] - alice is awarded 1 point
if a[i] < b[i] - bob is awarded 1 point
if a[i] = b[i] - then neither person receives a point.
Sample Input

5 6 7
3 6 10
Sample Output

1 1
Sample Input

17 28 30
99 16 8
Sample Output

2 1
 */
public class CompareTriples {

    public static void main(String[] arg) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int[] ar = new int[3];
        int[] br = new int[3];
        ar[0] = 34;
        ar[1] = 12;
        ar[2] = 9;
        br[0] = 23;
        br[1] = 13;
        br[2] = 32;
        a.add(34);
        a.add(12);
        a.add(9);
        b.add(23);
        b.add(13);
        b.add(32);
        List<Integer> integers = compareTriples(a, b);
        System.out.println(integers);
        int[] result = compareTriplesArray(ar, br);
        System.out.println(Arrays.toString(result));
    }

    private static int[] compareTriplesArray(int[] ar, int[] br) {
        int[] result = new int[2];
        int a = 0, b = 0;
        if (ar.length == br.length) {
            for (int i = 0; i < ar.length; i++) {
                if (ar[i] > br[i]) {
                    a++;
                } else if (ar[i] < br[i]) {
                    b++;
                } else {
                    continue;
                }
            }
        }
        result[0] = a;
        result[1] = b;
        return result;
    }

    private static List<Integer> compareTriples(List<Integer> a, List<Integer> b) {
        List<Integer> c = new ArrayList<>();
        int aa = 0, bb = 0;
        if (a.size() == b.size()) {
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) > b.get(i)) {
                    aa++;
                } else if (a.get(i) < b.get(i)) {
                    bb++;
                } else {
                    continue;
                }
            }
        }
        c.add(aa);
        c.add(bb);
        return c;
    }
}
