package com.LeetCode.Math.Solution;

//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//        Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//
//
//
//        Example 1:
//
//        Input: x = 123
//        Output: 321
public class ReverseInteger {
    public static void reverseInt(int x){
        int ans = 0;
        int c = x % 10;
        while(Math.abs(x) > 0){
            ans += x % 10;
            ans *= 10;
            x = x / 10;
        }
        ans /= 10;
        if(((ans+"").charAt(0)+"").equals(c+"")){
            System.out.println(ans);
        }
        System.out.println(0);
        //-2147483647
    }
}
