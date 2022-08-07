package com.RandomInputs;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RandomInputs {
    public static void generateRandomInputs() throws Exception{
        File finput = new File("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\LeetCode\\BinarySearch\\InputFiles\\SquareRootInputs.txt");
        String s = "";
        for(int i=0;i<20;i++){
            int input = 0;
            if(i < 5)
                input = (int)(Math.random() * 100);
            else if(i >= 5 && i < 10)
                input = (int)(Math.random() * 1000);
            else if(i >= 10 && i < 15)
                input = (int)(Math.random() * 10000);
            else if(i >=15 && i < 20)
                input = (int)(Math.random() * 100000);
            s += input+"\n";
        }
        write(s,new FileWriter("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\LeetCode\\BinarySearch\\InputFiles\\SquareRootInputs.txt"));
    }

    private static void write(String s, FileWriter finput) throws IOException {
        FileWriter myWriter = finput;
        myWriter.write(s);
        myWriter.close();
    }
}
