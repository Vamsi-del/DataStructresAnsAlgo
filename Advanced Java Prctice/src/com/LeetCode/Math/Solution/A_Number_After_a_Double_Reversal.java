package com.LeetCode.Math.Solution;
            //Q)Reversing an integer means to reverse all its digits.
            //
            //        For example, reversing 2021 gives 1202. Reversing 12300 gives 321 as the leading zeros are not retained.
            //        Given an integer num, reverse num to get reversed1, then reverse reversed1 to get reversed2. Return true if reversed2 equals num. Otherwise return false.
            //
            //
            //
            //        Example 1:
            //
            //        Input: num = 526
            //        Output: true
            //        Explanation: Reverse num to get 625, then reverse 625 to get 526, which equals num.
            //        Example 2:
            //
            //        Input: num = 1800
            //        Output: false
            //        Explanation: Reverse num to get 81, then reverse 81 to get 18, which does not equal num.
            //        Example 3:
            //
            //        Input: num = 0
            //        Output: true
            //        Explanation: Reverse num to get 0, then reverse 0 to get 0, which equals num.
            //
            //
            //        Constraints:
            //
            //        0 <= num <= 106
public class A_Number_After_a_Double_Reversal {
    public static boolean reverseNumber(int num){
        int dn = num;
        int ans = 0;
        int c = 0;
        while(dn >= 0 && c <= 1){
            if(dn != 0){
                ans = (ans * 10) + (dn % 10);
                dn /= 10;
            }
            else{
                dn = ans;
                ans = 0;
                c++;
            }
        }
        return dn == num;
    }
}
