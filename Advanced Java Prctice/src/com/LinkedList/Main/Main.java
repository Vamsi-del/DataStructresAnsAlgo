package com.LinkedList.Main;

import com.LinkedList.Solution.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        String what = scan.nextLine();
        if(what.equals("SL")) {
            singleLinkedList.inputs();
            singleLinkedList.add(2,4);
            singleLinkedList.addFirst(0);
            singleLinkedList.addLast(7);
            singleLinkedList.printList();
            System.out.println(singleLinkedList.element());
            System.out.print(singleLinkedList.get(1)+" ");
            System.out.print(singleLinkedList.getFirst()+" ");
            System.out.print(singleLinkedList.getLast()+" ");
            System.out.print(singleLinkedList.indexOf(2)+" ");
            System.out.println(singleLinkedList.lastIndexOf(4));
            singleLinkedList.listIterator(3);
            singleLinkedList.offer(8);
            singleLinkedList.offerLast(9);
            singleLinkedList.offerFirst(-1);
            System.out.println(singleLinkedList.peek());
        }
        else if(what.equals("DLL")){

        }
    }
}
