package com.LeetCode.Recurssion.Solution;

public class Fact {
    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
