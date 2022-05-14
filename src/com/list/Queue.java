package com.list;

public class Queue {
    public Node first;
    public Node last;
    public static int length =0;

    public Node peek(){
        return this.first;

    }
    public Node lastNode(){
        return last;
    }

    public void push(int val){
        Node n = new Node(val);
        if(length==0){
            first = n;
            last = n;
            length++;
        }else{

            last.next = n;
            last=n;
            length++;

        }
    }

    public static void main(String [] args){

        Queue queue = new Queue();
        queue.push(13);
        queue.push(15);
        queue.push(25);
        System.out.println(queue.lastNode());
    }

}
