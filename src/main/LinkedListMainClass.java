package main;

import LinkedList.MyLinkedList;

public class LinkedListMainClass {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(11);
        myLinkedList.add(12);
        myLinkedList.add(13);

        myLinkedList.printList();


    }
}
