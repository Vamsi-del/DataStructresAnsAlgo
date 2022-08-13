package com.Recurssion.Main;

import com.Array.Solution;
import com.Recurssion.Solution.SubSet;

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
    }
}
