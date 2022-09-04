package com.LeetCode.Recurssion.Solution;

import java.util.HashMap;

public class PrintZigZag {
    static String ans = "";
    static HashMap<Integer, String> dp = new HashMap<Integer, String>();
    public static String zigZag(int n){
        if(n == 1) {
            return "1 1 1";
        }
        return n+" "+zigZag(n-1)+" "+n+" "+zigZag(n-1)+" "+n;
    }

    //ZigZag Code using Dynamic Programming
    public static String efficientZigZag(int n){
        if(n == 1){
            return "1 1 1";
        }
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        ans = n+" "+efficientZigZag(n-1)+" "+n+" "+efficientZigZag(n-1)+" "+n;
        if(!dp.containsKey(n)){
            dp.put(n,ans);
        }
        return ans;
    }
}
