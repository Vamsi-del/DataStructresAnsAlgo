package com.LeetCode.Recurssion.Solution;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    static List<List<String>> ans = new ArrayList<List<String>>();
    public static List<List<String>> reverseSubSet(String s, int i){
        if(i == s.length()){
            ans.add(new ArrayList<String>());
            return ans;
        }
        List<List<String>> helper = new ArrayList<List<String>>(reverseSubSet(s,i+1));
        for(List<String> a : helper){
            List<String> b = new ArrayList<String>(a);
            b.add(""+s.charAt(i));
            ans.add(b);
        }
        return ans;
    }

    public static List<List<String>> subSet(String s,int i){
        if(i < 0){
            ans.removeAll(ans);
            ans.add(new ArrayList<String>());
            return ans;
        }
        List<List<String>> helper = new ArrayList<List<String>>(subSet(s,i-1));
        for(List<String> a : helper){
            List<String> b = new ArrayList<String>(a);
            b.add(""+s.charAt(i));
            ans.add(b);
        }
        return ans;
    }
}
