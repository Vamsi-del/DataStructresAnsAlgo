package com.LeetCode.Recurssion.Solution;

public class PrintIncreasing {
    static String ans = "";
    public static String increase(int n) {
        if(0 == n){
            return ans+n+" ";
        }
        return increase(n-1)+ans+n+" ";
    }
}
