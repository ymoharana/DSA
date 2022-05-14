package com.list;

public class LinkedList {
    private Node head;
    private Node tail;
    private static int length=0;

    public void add(int val){
         Node n = new Node();
         n.value = val;
        if(length == 0){
            this.head = n;
        }else{
            tail.next = n;
        }
        tail = n;
        length++;
    }

    public void print(){
        Node n= head;
        while(n != null){
            System.out.println(n.value);
            n=n.next;
        }

    }


}
