package com.LeetCode.Recurssion.Solution;

import java.util.ArrayList;
import java.util.List;

public class PrintStairPath {
    static List<String> ans = new ArrayList<String>();
    public static List<String> stairPath(int n,String a) {
        if(n < 0){
            return ans;
        }
        if(n == 0){
            ans.add(a);
            return ans;
        }
        stairPath(n-1,a+1);
        stairPath(n-2,a+2);
        stairPath(n-3,a+3);
        return ans;
    }
}
