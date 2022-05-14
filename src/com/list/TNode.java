package com.list;

public class TNode {
    int val;
    public TNode right;
    public TNode left;

    @Override
    public String toString() {
        return "TNode{" +
                "val=" + val +
                ", right=" + right +
                ", left=" + left +
                '}';
    }
}
