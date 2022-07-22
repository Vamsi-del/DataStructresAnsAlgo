package com.LeetCode.Math.Main;

import com.LeetCode.Math.Solution.SumoTwoIntegers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String find = scan.nextLine();
        if(find.equals("SumofTwoIntegers")){
            int a = scan.nextInt();
            int b = scan.nextInt();
            SumoTwoIntegers.SumoTwoIntegers(a,b);
        }
    }
}