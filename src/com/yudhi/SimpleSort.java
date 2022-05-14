package com.yudhi;

import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] unSort = {23,1,45,-9,3};
        //First index is sorted first then curser move to second index and try to sort it then pointer moved to third index to sort the same
        //so this way the sorting proceeds
        for(int i=0; i<unSort.length; i++){
            for(int j=i+1; j<unSort.length; j++){
                if(unSort[i]<unSort[j]){
                    int temp = unSort[i];
                    unSort[i] = unSort[j];
                    unSort[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(unSort));
    }
}
