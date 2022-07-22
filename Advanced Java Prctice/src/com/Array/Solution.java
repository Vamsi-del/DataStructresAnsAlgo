package com.Array;
import java.util.*;

public class Solution {
    public int longestConsecutive(int[] nums) {
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

    public int majorityElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length/2];
        int a = nums[0];int v = 0;
        for(int i : nums){
            if(a == i){
                ++v;
            }
            else{
                --v;
                if(v == 0){
                    ++v;
                    a = i;
                }
            }
        }
        return a;
    }

    public String twoSum(int[] numbers, int target) {
        // int s = 0;
        // int e = numbers.length - 1;
        // while(s < e){
        //     int g = numbers[s]+numbers[e];
        //     if(g < target){
        //         ++s;
        //     }
        //     else if(g > target){
        //         --e;
        //     }
        //     else{
        //         return new int[]{s+1,e+1};
        //     }
        // }
        // return new int[]{s+1,e+1};
        int p1 = 0;
        int p2 = numbers.length - 1;
        int current = 0;
        while (p1 < p2){
            current = target - numbers[p1];
            while (numbers[p2] > current){
                p2--;
            }
            if (numbers[p2] == current){
                int[] ans = {p1 + 1, p2 + 1};
                return Arrays.toString(ans);
            }
            p1++;
            current = target - numbers[p2];
            while (numbers[p1] < current){
                p1++;
            }
            if (numbers[p1] == current){
                int[] ans = {p1 + 1, p2 + 1};
                return Arrays.toString(ans);
            }
            p2--;
        }
        int[] ans = {};
        return Arrays.toString(ans);
    }
}