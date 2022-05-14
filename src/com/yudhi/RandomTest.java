package com.yudhi;

public class RandomTest {
    public static void main(String[] args) {
        sum(null);
    }

    public static void sum(String o){
        System.out.println("String method");
    }
    public static void sum(Object o){
        System.out.println("Object method");
    }
}
