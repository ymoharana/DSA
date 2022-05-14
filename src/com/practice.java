package com;

public class practice {

    public static int[] merge(int[] l, int[] r){
        int n = l.length+r.length;
        int[] merged = new int[n];
        int i=0;
        for(; i<l.length; i++){
            merged[i] = l[i];
        }
        for(int j=0; j<r.length; j++){
            merged[j+i] = r[j];
        }
        return merged;

    }

    public static void main(String[] args) {
        int[] a ={1,2,3,4};
        int[] b = {5,6,7,8};
        int[] merged = merge(a,b);
        for(int c : merged){
            System.out.println(c);
        }

    }
}
