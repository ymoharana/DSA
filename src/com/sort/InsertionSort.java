package com.sort;

//Takes a val and back tracks to check if any value previous to it is lesser than the key then replace it with previous one.
public class InsertionSort {
    public static int[] sort(int[] nums){
          for(int i=1; i<nums.length; i++){
             int j = i-1;
             int k = nums[i];
             while(j>=0 && nums[j]>k){
                  nums[j+1] = nums[j];
                  nums[j]=k;
                 j--;
             }
          }
       return nums;
    }

    public static void main(String[] args) { //5,6,4 // 5,4,6//4,5,6
        int[] nums = {6,5,4,-3};
        int[] sorted  = sort(nums);
        for(int a: sorted){
            System.out.println(a);
        }
    }
}
