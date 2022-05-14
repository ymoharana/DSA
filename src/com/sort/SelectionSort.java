package com.sort;

//First check the minimum of all and then replace it with first index and then the earlier 0 index value is placed to the min index.
public class SelectionSort {
    public static int[] sort(int[] nums){
        for(int i=0; i<nums.length; i++){
            int index = i;
            boolean updated = false;
            for(int j=i+1; j<nums.length; j++){
                if(nums[index]>nums[j]){
                    index = j;
                    updated = true;
                }
            }
            if(updated){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }

        }
       return nums;
    }

    public static void main(String[] args) {
        int[] nums = {6, 3,2,2,10,-1};
        int[] sorted  = sort(nums);
        for(int a: sorted){
            System.out.println(a);
        }
    }
}
