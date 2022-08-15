package com.Array.Main;

import com.Array.Solution.DecompressRunLengthEncoding;

import java.util.Scanner;

public class DRLE {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = s.nextInt();
        }
        for(int i : DecompressRunLengthEncoding.decompressRLElist(a)){
            System.out.print(i+" ");
        }
        System.out.println();
        for(int i : DecompressRunLengthEncoding.EdecompressRLElist(a)){
            System.out.print(i+" ");
        }
    }
}
