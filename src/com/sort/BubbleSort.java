package com.sort;

import java.util.Arrays;

public class BubbleSort {

    public static int[] sort(int[] numbers){
        for(int i=0; i<numbers.length; i++){
           for(int j=0; j< numbers.length-1; j++){
               if(numbers[j]> numbers[j+1]){
                   int temp = numbers[j];
                   numbers[j] = numbers[j+1];
                   numbers[j+1] = temp;
               }

           }
        }
      return numbers;
    }

    public static void main(String[] args) {
        int[] ar = {10,10,4,1,13,1};
       // int[] ar1 = new int[6];
      //  System.out.println(sort(ar).);
        Arrays.stream(sort(ar)).forEach(a->{System.out.println(a);
        });
    }
}
