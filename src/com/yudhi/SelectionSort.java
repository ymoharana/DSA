package com.yudhi;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {23,7,12,90,45,1};
//Find the minimum index and replace it with zero index and find the second minimum and put it in first index and so on
        for(int i=0; i<arr.length; i++){
           int minIndex = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;

        }
        System.out.println(Arrays.toString(arr));

    }
}

