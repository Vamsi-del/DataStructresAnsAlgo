package com.LeetCode.Recurssion.Solution;

public class LinearPower {
    public static int printPower(int n,int mul){
        if(n==0) return 1;
        return mul*printPower(n-1,mul);
    }

    public static int efficientPower(int n,int mul){
        if(n == 0){
            return 1;
        }
        if(n%2==1){
            return mul*efficientPower(n-1,mul);
        }
        int f = efficientPower(n/2,mul);
        return f*f;
    }
}
