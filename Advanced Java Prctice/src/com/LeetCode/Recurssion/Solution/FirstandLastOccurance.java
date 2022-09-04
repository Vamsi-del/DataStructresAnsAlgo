package com.LeetCode.Recurssion.Solution;

public class FirstandLastOccurance {
    static int[] ans = {-1,-1};
    static int i = 0;
    static int j = 0;
    public static int[] firstAndLast(int[] nums,int target){
        if(j == 0){
            j = nums.length -1;
        }
        if(i == nums.length){
            return ans;
        }
        if(nums[i] == target && ans[0] < 0){
            ans[0] = i;
        }
        if(nums[j] == target && ans[1] < 0){
            ans[1] = j;
        }
        i++;
        j--;
        firstAndLast(nums,target);
        return ans;
    }
}
