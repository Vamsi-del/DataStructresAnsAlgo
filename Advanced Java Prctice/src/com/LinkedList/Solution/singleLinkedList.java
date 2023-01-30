package com.LinkedList.Solution;

import com.LinkedList.Main.Node;

import java.util.Scanner;
//Single LinkedList implementation Class
public class singleLinkedList {
    static Node head;
    static Node previousNode;
    public static void inputs(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Number of Elements :");
        int ns = scan.nextInt();
        for (int i = 0; i < ns; i++) {
            System.out.println("Enter "+(i+1)+" Element :");
            int n = scan.nextInt();
            add(n);
        }
    }

    public static void add(int n) {
        if(head == null){
            head = new Node(n,null);
            previousNode = head;
        }
        else{
            previousNode.nextNode = new Node(n,null);
            previousNode = previousNode.nextNode;
        }
    }

    public static void add(int index,int data){
        Node p = head;
        int i = 0;
        if(index > size()){
            System.out.print("Entered index is out of bounds");
            return;
        }
        while(index != i){
            i++;
            p = p.nextNode;
        }
        Node s = p.nextNode;
        p.nextNode = new Node(data,null);
        p.nextNode.nextNode = s;
    }

    public static void addFirst(int data){
        Node p = head;
        head = new Node(data,null);
        head.nextNode = p;
    }

    public static void printList(){
        Node p = head;
        while(p.nextNode != null){
            System.out.print(p.data + " ");
            p = p.nextNode;
        }
        System.out.print(p.data + " ");
    }

    public static int size(){
        Node p = head;
        int size = 0;
        while(p.nextNode!= null){
            size++;
            p = p.nextNode;
        }
        return size;
    }


    public static void addLast(int data) {
        Node p = previousNode;
        previousNode.nextNode = new Node(data,null);
    }

    public static int element() {
        return head.data;
    }

    public static int get(int index) {
        Node p = head;
        int i = 0;
        if(index > size()){
            System.out.print("Entered index is out of bounds");
            return -1;
        }
        while(index != i){
            i++;
            p = p.nextNode;
        }
        return p.data;
    }

    public static int getFirst() {
        return head.data;
    }

    public static int getLast() {
        return previousNode.data;
    }

    public static int indexOf(int data) {
        Node p = head;
        int i = 0;
        while(p.data != data) {
            p = p.nextNode;
            i++;
        }
        return i;
    }

    public static int lastIndexOf(int data) {
        Node p = head;
        int i = 0;
        int ans = -1;
        while(p.nextNode != null) {
            p = p.nextNode;
            i++;
            if(p.data == data) {
                ans = i;
            }
        }
        return ans;
    }

    public static void listIterator(int index) {
        Node p = head;
        int i = 0;
        while(p.nextNode != null) {
            p = p.nextNode;
            i++;
            if(i >= index) {
                System.out.print(p.data + " ");
            }
        }
    }

    public static void offer(int data) {
        addLast(data);
    }

    public static void offerLast(int data) {
        addLast(data);
    }

    public static void offerFirst(int data) {
        addFirst(data);
    }

    public static int peek() {
        return element();
    }
}
