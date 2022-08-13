package com.Array.Main;

import java.util.*;
import java.io.*;
import com.Array.Solution.LongestConsecutive;
import com.Array.Solution.MajorityElement;
import com.Array.Solution.TwoSum;

public class Main {
    static String m = "";
    static String oa = "Correct Answer\n";
    static String expected = "Expexted Ans : \n";
    static String actual = "Actual Ans : \n";
    static boolean flag = true;
    static String val = "Input Values : \n";
    static Date myObj = new Date();
    static String[] a = myObj.toString().split(" ");
    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\Array\\Logs\\"+a[a.length - 1] + "-" + a[1] + "-" + a[2] + " logs.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                m += myReader.nextLine() + "\n";
            }
            myReader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        Scanner scan = new Scanner(System.in);
        String inputFileName = scan.nextLine();
        System.out.println(myObj.toString());
        m += "Time : "+a[3]+"\t\t\t\t\t\t--------------"+inputFileName+" Execution Steps------------------\n";
        File f = new File("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\Array\\Inputs\\"+inputFileName+".txt");
        m += "Reading the inputs from the "+inputFileName+".txt File C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\Array\\Logs\\"+inputFileName+".txt\n";
        try {
            int ac = 0;
            String twoSumAC = "";
            m += "Adding the file to the Scanner\n";
            Scanner s = new Scanner(f);
            int i=0;
            while (s.hasNext()) {
                m += "Taking the input from the file : \n";
                String input = s.nextLine();
                ++i;
                m += "\t"+i+") input will be sent as the parameter to longestConsecutive "+input+"\n";
                String[] g = input.split(" ");
                String twoSum = "";
                int ans = 0;
                int target = 0;
                if(inputFileName.equals("TwoSum")) {
                    twoSum = g[1];
                    target = Integer.parseInt(s.nextLine());
                }
                else
                    ans = Integer.parseInt(g[1]);
                val += "\t"+i+") "+g[0]+"\n";
                input  = input.substring(1,g[0].length()-1);
                m += "\tRemoving all [] from the input String "+input+"\n";
                if(input.length() != 0) {
                    String[] d = input.split(",");
                    m += "\tSpliting the String and storing the Array\n";
                    int[] nums = new int[d.length];
                    for (int j = 0; j < d.length; j++) {
                        nums[j] = Integer.parseInt(d[j]);
                    }
                    m += "\tAdding the values to the nums Array\n";
                    if(inputFileName.equals("LongestConsecutiveSequence"))
                        ac = LongestConsecutive.longestConsecutive(nums);
                    else if(inputFileName.equals("TwoSum"))
                        twoSumAC = TwoSum.twoSum(nums,target);
                    else
                        ac = MajorityElement.majorityElement(nums);
                }
                else
                if(inputFileName.equals("LongestConsecutiveSequence"))
                    ac  = LongestConsecutive.longestConsecutive(new int[]{});
                expected += "\t"+i+") "+(inputFileName.equals("TwoSum") ? twoSum : ans)+"\n";
                actual += "\t"+i+") "+(inputFileName.equals("TwoSum") ? twoSumAC : ac)+"\n";
                if(ac != ans || twoSum.equals(twoSumAC))
                    oa = "Wrong Answer\n";
            }
            m += oa+val+expected+actual;
            write(m);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void write(String s){
        try{
            FileWriter myWriter = new FileWriter("C:\\Users\\HP\\IdeaProjects\\DataStructresAnsAlgo\\Advanced Java Prctice\\src\\com\\Array\\Logs\\"+a[a.length-1]+"-"+a[1]+"-"+a[2]+" logs.txt");
            myWriter.write(s);
            myWriter.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
