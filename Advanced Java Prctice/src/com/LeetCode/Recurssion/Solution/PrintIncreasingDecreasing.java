package com.LeetCode.Recurssion.Solution;

public class PrintIncreasingDecreasing {
    static String ans = "";
    public static String print(int n) {
        if(n == 0){
            return ans+n+"\n0 ";
        }
        return ans+n+" "+print(n-1)+ans+n+" ";
    }
}
