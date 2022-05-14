package com.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Parent parent= new FirstSubClass();
        String name = parent.yourName;
        System.out.println(name);
        //Bottom2.name
    }

    public void test(){
        System.out.println("test");
        test2();
    }

    public static void test2(){
        System.out.println("static method");
        //test();
    }
}
