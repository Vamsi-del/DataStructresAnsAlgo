package com.Array.Solution;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
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
}
