package com.LeetCode.Math.Solution;

import java.util.LinkedList;
import java.util.List;

public class Add_to_Array_Form_of_Integer {
    public static List<Integer> addToArrayForm(int[] num, int k) {
        LinkedList<Integer> a = new LinkedList<Integer>();

        int carry = k;
        for(int i = num.length -1 ; i >= 0; i--){
            int s = num[i] + carry;
            a.addFirst(s%10);
            carry=s/10;
        }

        while(carry!=0){
            a.addFirst(carry%10);
            carry = carry/10;
        }

        return a;
    }
}
