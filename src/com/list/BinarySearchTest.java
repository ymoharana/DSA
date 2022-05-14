package com.list;

public class BinarySearchTest {

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(5);
        bt.insert(10);
        bt.insert(3);
        bt.insert(-6);
        bt.insert(122);

        System.out.println(bt.lookUp(122));
    }
}
