package com.LeetCode.BinarySearch.Main;

import com.LeetCode.BinarySearch.Solution.PerfectSquare;
import com.LeetCode.BinarySearch.Solution.SquareRoot;
import com.RandomInputs.RandomInputs;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.equals("SquareRoot")) {
            RandomInputs.generateRandomInputs();
            File f = new File("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\LeetCode\\BinarySearch\\InputFiles\\SquareRootInputs.txt");
            Scanner sf = new Scanner(f);
            while(sf.hasNextInt()){
                int sq = sf.nextInt();
                System.out.println(SquareRoot.sqRoot(sq));
            }
        }

        else if(s.equals("PerfectSquare")){
            RandomInputs.generateRandomInputs();
            File f = new File("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\LeetCode\\BinarySearch\\InputFiles\\SquareRootInputs.txt");
            Scanner sf = new Scanner(f);
            while(sf.hasNextInt()){
                int n = sf.nextInt();
                System.out.println(PerfectSquare.perfectSquare(n));
            }
        }
    }
}
