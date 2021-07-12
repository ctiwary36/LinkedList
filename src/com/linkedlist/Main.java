package com.linkedlist;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to DataStructure Program\n\n"
                + "Choose your option:\n"
                + "1. Create a simple LinkedList\n"
                + "2. Create Linked List by adding 30 and 56 to 70\n"
                + "3. Create Linked List by apending 30 and 70 to 56\n");

        int option = sc.nextInt();
        System.out.println();
        switch (option) {

            case 1:

                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();
                break;

            case 2:
                linkedList.push(70);
                linkedList.push(30);
                linkedList.push(56);

                linkedList.print();

                break;

            case 3:

                linkedList.insert(56);
                linkedList.insert(30);
                linkedList.insert(70);

                linkedList.print();

                break;


        }
    }
}