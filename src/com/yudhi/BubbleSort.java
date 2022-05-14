package com.yudhi;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {90,4,6,100,1,5};
        System.out.println(arr.length);
        for(int k=0; k<arr.length; k++) {
            boolean swap = false;
            //Compare two elements any time and swap which ever is higher--,
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
