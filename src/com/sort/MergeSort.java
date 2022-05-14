package com.sort;

import java.util.Arrays;

public class MergeSort {
 public  int[] sum = new int[5];
 public  int k =0;
    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        int [] ar = {5,2,3,2};
        m.mergeSort(ar, 0, ar.length-1);
        Arrays.stream(m.sum).forEach(System.out::println);

//        int[] a = {20};
//        test(a);
//        System.out.println(a[0]);

    }


    public static void test(int[] a){
        a[0] = 39;
    }
    public void mergeSort(int[] num, int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            mergeSort(num, l, mid);
            mergeSort(num, mid+1, r);
            merge(num, l, r, sum);
        }

    }
    public void merge(int[] num, int l, int r, int[] sum){

          while(l<r){
              if(num[l]>= num[r]){
                  sum[k] = num[r];
                  r--;
              }else if(num[l] < num[r]){
                  l++;
              }
              k++;
          }

    }
}
