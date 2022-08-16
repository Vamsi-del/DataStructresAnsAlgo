package com.LeetCode.Recurssion.Solution;

public class FibonacciSries {
    public static String ans = "1 1 ";
    public static int printFib(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1;
        int sum = printFib(n-1)+printFib(n-2);
        if(!ans.contains(sum+"")){
            ans += sum+" ";
        }
        return sum;
    }
}
