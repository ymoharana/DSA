package com.leetcode;

import java.util.*;

public class FourSum {

    public static void main(String[] args) {
        System.out.println(fourSum(new int[]{2,2,2,2,2},
        8));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> quadList = new HashSet<>();
        int size = nums.length - 1;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {

            for (int j = i + 1; j < nums.length - 2; j++) {
                int k = j + 1;
                int l = size;

                while (l>k) {
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if (sum == target) {
                        quadList.add(List.of(nums[i], nums[j], nums[k], nums[l]));
                    }
                    if (sum > target) {
                        l--;
                    } else {
                        k++;
                    }
                }

            }
        }
            return new ArrayList<>(quadList);
        }
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> quadList = new ArrayList<>();
//        for(int i=0; i<nums.length-4; i++){
//            int j = i+1;
//            int k= j+1;
//            int l =k+1;
//
//            while(l<nums.length){
//                int sum = nums[i]+nums[j]+nums[k]+nums[l];
//                if(sum==target){
//                    List<Integer> quad = List.of(nums[i], nums[j], nums[k], nums[l]);
//                    quadList.add(quad);
//                }
//                j++;k++;l++;
//
//            }
//
//        }
//        return quadList;
//    }
//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        List<List<Integer>> quadList = new ArrayList<>();
//        // Arrays.sort(nums);
//        int repeated=0;
//        for(int i=0; i<nums.length-3; i++){
//            int j = i+1;
//            int k= j+1;
//            int l =k+1;
//            if(i>0 && (nums[i-1]==nums[i] && nums[j-1]==nums[j] && nums[k-1]==nums[k])){
//                repeated++;
//                continue;
//            }
//            while(l<nums.length){
//                if(nums[l]==nums[l-1]){
//                    l++;
//                    continue;
//                }
//                int sum = nums[i]+nums[j]+nums[k]+nums[l];
//                if(sum==target){
//                    List<Integer> quad = List.of(nums[i], nums[j], nums[k], nums[l]);
//                    quadList.add(quad);
//                }
//                l++;
//            }
//            l=l-1;
//            while(k<l){
//                if(nums[k]==nums[k-1]){
//                    k++;
//                    continue;
//                }
//                int sum = nums[i]+nums[j]+nums[k]+nums[l];
//                if(sum==target){
//                    List<Integer> quad = List.of(nums[i], nums[j], nums[k], nums[l]);
//                    quadList.add(quad);
//                }
//                k++;
//            }
//            k=k-1;
//            while(j<k){
//                if(nums[j]==nums[j-1]){
//                    j++;
//                    continue;
//                }
//                int sum = nums[i]+nums[j]+nums[k]+nums[l];
//                if(sum==target){
//                    List<Integer> quad = List.of(nums[i], nums[j], nums[k], nums[l]);
//                    quadList.add(quad);
//                }
//                j++;
//            }
//
//        }
//        if(repeated>=0){
//            if(nums[0]+nums[1]+nums[2]+nums[3]==target){
//                List<Integer> quad = List.of(nums[0], nums[1], nums[2], nums[3]);
//                quadList.add(quad);
//            }
//            else {
//                return List.of();
//            }
//        }
//        return quadList;
//    }

//    public static List<List<Integer>> fourSum(int[] nums, int target) {
//        Set<List<Integer>> quadList = new HashSet<>();
//        Arrays.sort(nums);
//        for(int i=0; i<nums.length-3; i++){
//
//            for(int j=i+1; j<nums.length-2; j++){
//                int k = j+1;
//                int l = nums.length-1;
//
//                while(k<l){
//                    int sum = nums[i]+nums[j]+nums[k]+nums[l];
//                    if(sum==target){
//                        List<Integer> quad = List.of(nums[i], nums[j], nums[k], nums[l]);
//                        quadList.add(quad);
//                    }
//
//                    if(sum>=target){
//                        l--;
//                    }else{
//                        k++;
//                    }
//
//                }
//            }
//        }
//        return new ArrayList<>(quadList);
//    }
    }
