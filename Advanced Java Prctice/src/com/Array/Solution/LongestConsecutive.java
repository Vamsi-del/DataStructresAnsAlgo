package com.Array.Solution;

import java.util.Arrays;

public class LongestConsecutive {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans = 1;
        int high = 0;
        if(nums.length == 0){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i] == nums[i-1]+1){
                ++ans;
            }
            else{
                if(high < ans)
                    high = ans;
                ans = 1;
            }
        }
        if(high < ans){
            high = ans;
        }
        return high;
    }
}
