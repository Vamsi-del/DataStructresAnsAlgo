package com.LeetCode.Math.Main;

import com.LeetCode.Math.Solution.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String find = scan.nextLine();
        if(find.equals("SumofTwoIntegers")){
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(SumoTwoIntegers.SumoTwoIntegers(a,b));
            System.out.println(SumoTwoIntegers.addTwoNumber(a,b));
        }

        else if(find.equals("AddDigits")){
            long n = scan.nextLong();
            System.out.println(AddDigits.EfficientAddDigits(n));
            System.out.println(AddDigits.addDigits(n));
        }

        else if(find.equals("ReverseInteger")){
            int x = scan.nextInt();
            ReverseInteger.reverseInt(x);
        }

        else if(find.equals("DoubleReverse")){
            int x = scan.nextInt();
            System.out.println(A_Number_After_a_Double_Reversal.reverseNumber(x));
        }

        else if(find.equals("Atoi")){
            String s = scan.nextLine();
            System.out.println(StringtoInteger.myAtoi(s));
        }

        else if(find.equals("PlusOne")){
            int n = scan.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scan.nextInt();
            }
            int[] ans = PlusOne.plusOne(a);
            for(int j = 0;j < ans.length;j++){
                System.out.print(ans[j]+" ");
            }
        }

        else if(find.equals("AddToArray")){
            int n = scan.nextInt();
            int[] num = new int[n];
            for(int i=0;i<n;i++){
                num[i] = scan.nextInt();
            }
            int k = scan.nextInt();
            List<Integer> ans = Add_to_Array_Form_of_Integer.addToArrayForm(num,k);
            System.out.println(ans);
        }
    }
}