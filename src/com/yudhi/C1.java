package com.yudhi;

public class C1{
    public static void main(String[] args) {
//        int n=1;
//        for(int i=1; i<=5; i++){
//             n *= i;
//        }
//        System.out.println("n! is  "+n);
        System.out.println(recursion(5));
    }

    public static int recursion(int n){
        if(n==0){
            return 1;
        }
        return n*recursion(n-1);
    }
}
