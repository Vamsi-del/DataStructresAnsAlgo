package com.LeetCode.Recurssion.Solution;

public class PrintZigZag {
    static String ans = "";
    public static String zigZag(int n){
        if(n == 2){
            return ans+"21112";
        }
        return ans+n+zigZag(n-1)+n;
    }
}
