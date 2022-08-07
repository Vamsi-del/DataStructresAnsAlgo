package com.LeetCode.BinarySearch.Solution;

public class SquareRoot {
    public static int sqRoot(int n){
        int start = 1;
        int end = n;
        while(start <= end){
            int mid = start + (end - start) / 2;
            long sq = mid * mid;
            if(sq == n) return mid;
            else if(sq < n){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start - 1;
    }
}
