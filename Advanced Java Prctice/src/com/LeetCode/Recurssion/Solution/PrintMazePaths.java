package com.LeetCode.Recurssion.Solution;

import java.util.ArrayList;
import java.util.List;

public class PrintMazePaths {
    static List<String> ans = new ArrayList<String>();
    public static List<String> mazePaths(int row,int col,int n,String a) {
        if(col == n-1 && row == n-1){
            ans.add(a);
            return ans;
        }
        if(row == n || col == n){
            return ans;
        }
        mazePaths(row+1,col,n,a+"H");
        mazePaths(row,col+1,n,a+"V");
        return ans;
    }
}
