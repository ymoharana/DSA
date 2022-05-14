package com.inheritance;

public class FirstSubClass extends Parent{
    //public static String name="FirstChild";
    public  String yourName="ChildYourname";

    public FirstSubClass(String yourName) {
        super(yourName);
    }

    public FirstSubClass() {
        super();
    }
}
