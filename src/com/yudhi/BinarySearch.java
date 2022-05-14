package com.yudhi;

public class BinarySearch {
    public static void main(String[] args) {
        int[] sortedAr = {2,3,5,56,67,89};
        int search = 90;
        int left = 0;
        int right = sortedAr.length-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(search == sortedAr[mid]){
                System.out.println("Found "+sortedAr[mid]);
                break;
            }
            else if( search>sortedAr[mid] ){
               left=mid+1;
            }else{
                right = mid-1;
            }

        }
    }
}
