package com.LeetCode.Math.Solution;

public class SumoTwoIntegers {
    public static int SumoTwoIntegers(int a, int b) {
        //without using operator find the Sum of Two Number.
        while(b != 0){
                int temp = (a & b) << 1;
                a = a ^ b;
                b = temp;
        }
        return a;
    }

    public static int addTwoNumber(int a, int b){
        return a + b;
    }
}
