package com.LeetCode.Recurssion.Main;

import com.LeetCode.Recurssion.Solution.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if(s.equals("SubSet")){
            String in = scan.nextLine();
            System.out.println(SubSet.reverseSubSet(in,0));
            System.out.println(SubSet.subSet(in,in.length()-1));
        }

        else if(s.equals("PrintDecreasing")){
            int n = scan.nextInt();
            System.out.println(PrintDecreasing.decrease(n));
            System.out.println(PrintDecreasing.edecrease(0,n));
        }

        else if(s.equals("PrintIncreasing")){
            int n = scan.nextInt();
            System.out.println(PrintIncreasing.increase(n));
        }

        else if(s.equals("Fact")){
            int n = scan.nextInt();
            System.out.println(Fact.factorial(n));
        }

        else if(s.equals("PrintIncreasingDecreasing")){
            int n = scan.nextInt();
            System.out.println(PrintIncreasingDecreasing.print(n));
        }

        else if(s.equals("Fib")){
            int n = scan.nextInt();
            System.out.println(FibonacciSries.printFib(n));
            System.out.println(FibonacciSries.ans);
        }

        else if(s.equals("Power")){
            int n = scan.nextInt();
            int mul = scan.nextInt();
            System.out.println(LinearPower.printPower(n,mul));
            int pow = LinearPower.efficientPower(n/2,mul);
            System.out.println(n%2 == 0 ? pow*pow : (pow*pow)*mul);
        }

        else if(s.equals("ZigZag")){
            int n = scan.nextInt();
            System.out.println(PrintZigZag.zigZag(n));
        }
    }
}
