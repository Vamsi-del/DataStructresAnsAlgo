package com.LeetCode.BinarySearch.Solution;

public class PerfectSquare {
    public static boolean perfectSquare(int n){
        int start = 1;
        int end = n;
        while(start <= end){
            long mid = start + (end - start) / 2;
            long sq = mid*mid;
            if(sq == n) return true;
            else if(sq < n){
                start = (int)mid + 1;
            }
            else{
                end = (int)mid - 1;
            }
        }
        return false;
    }
}
