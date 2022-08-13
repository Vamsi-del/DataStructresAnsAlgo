package com.Array.Solution;

import java.util.Arrays;

public class TwoSum {
    public static String twoSum(int[] numbers, int target) {
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
