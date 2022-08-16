package com.LeetCode.Recurssion.Solution;

public class PrintDecreasing {
    static String ans = "";
    public static String decrease(int n){
        if(0 == n){
            return ans+n+" ";
        }
        return ans+n+" "+decrease(n-1);
    }

    public static String edecrease(int s,int n){
        if(s == n){
            return ans+s+" ";
        }
        return edecrease(s+1,n)+ans+s+" ";
    }
}
