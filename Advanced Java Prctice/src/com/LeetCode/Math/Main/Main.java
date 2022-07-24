package com.LeetCode.Math.Main;

import com.LeetCode.Math.Solution.AddDigits;
import com.LeetCode.Math.Solution.SumoTwoIntegers;

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
    }
}