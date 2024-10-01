package com.example.twosum;

import java.util.Arrays;

/**
 * //Problem Link: <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 * Class to solve the Two Sum problem using the two-pointer technique.
 *
 * <p>This class provides a method to find the indices of two numbers in an array that add up to a
 * specific target. The method sorts the array while keeping track of original indices and uses the
 * two-pointer approach.
 *
 * <p>Time Complexity: O(n log n), due to the sorting step.
 * Space Complexity: O(n), due to the additional array to store numbers with their original indices.
 */
public class TwoSumTwoPointerSolution {

    /**
     * Finds the indices of the two numbers in the array that add up to the target.
     *
     * @param nums   The array of integers to search through.
     * @param target The target sum we are looking for.
     * @return An array containing the indices of the two numbers that add up to the target.
     * @throws IllegalArgumentException If no two numbers add up to the target.
     */
    public int[] twoSum(int[] nums, int target) {
        // Create an array of pairs to keep track of numbers and their original indices.
        Pair[] numPairs = new Pair[nums.length];

        // Populate the array with pairs of (number, original index).
        for (int i = 0; i < nums.length; i++) {
            numPairs[i] = new Pair(nums[i], i);
        }

        // Sort the array of pairs based on the numbers.
        Arrays.sort(numPairs, (a, b) -> Integer.compare(a.num, b.num));

        // Initialize two pointers at the start and end of the sorted array.
        int left = 0;
        int right = nums.length - 1;

        // Loop until the two pointers meet.
        while (left < right) {
            int sum = numPairs[left].num + numPairs[right].num;

            if (sum == target) {
                // Found the two numbers that add up to the target.
                // Return their original indices.
                return new int[]{numPairs[left].index, numPairs[right].index};
            } else if (sum < target) {
                // If the sum is less than the target, move the left pointer to the right.
                left++;
            } else {
                // If the sum is greater than the target, move the right pointer to the left.
                right--;
            }
        }

        // Since the problem statement guarantees exactly one solution, this line should never be reached.
        // Throw an exception to indicate that no valid pair was found.
        throw new IllegalArgumentException("No two sum solution exists");
    }

    /**
     * Helper class to store a number and its original index.
     */
    private static class Pair {
        int num;
        int index;

        Pair(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
}
