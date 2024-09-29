package com.example.twosum;

import java.util.HashMap;

//Problem Link: https://leetcode.com/problems/two-sum/description/
public class TwoSumBruteForce {

    public int[] twoSumBruteForce(int[] nums, int target) {
        int[]  result = null;
        for(int i=0; i< nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] != target){
                    continue;
                }
                if(nums[i]+nums[j] == target){
                    result = new int[2];
                    result[0] = i;
                    result[1] =j;
                    break;
                }

            }
        }

        return result;
    }
    //Optimization using hashmap and complement of a number
    public int[] twoSumOptimised(int[] nums, int target) {
        int[] result = null;
        HashMap<Integer, Integer> numsToIndex = new HashMap<>();

        for(int i=0; i< nums.length ; i++){
            int complement = target - nums[i];
            if(numsToIndex.containsKey(complement)){
                result = new int[]{numsToIndex.get(complement), i};
                break;
            }
            numsToIndex.put(nums[i],i);

        }
        return result;
    }
}
