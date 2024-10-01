package com.example.twosum;
import java.util.BitSet;

/**
 * //Problem Link: <a href="https://leetcode.com/problems/two-sum/description/">...</a>
 * Class to solve the Two Sum problem using BitSet for a limited range of numbers.
 *
 * <p>This method is efficient when numbers are within a known small range.
 *
 * <p>Time Complexity: O(n)
 * Space Complexity: O(k), where k is the maximum value in nums.
 */
public class TwoSumBitSetSolution {

    public int[] twoSum(int[] nums, int target) {
        // Find the maximum number in nums to define the size of the BitSet.
        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        // Initialize a BitSet with size up to the maximum number.
        BitSet bitSet = new BitSet(maxNum + 1);

        // Iterate through the array to find the complement.
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if the complement is within range and present in the BitSet.
            if (complement >= 0 && complement <= maxNum && bitSet.get(complement)) {
                // Find the index of the complement.
                for (int j = 0; j < i; j++) {
                    if (nums[j] == complement) {
                        return new int[]{j, i};
                    }
                }
            }
            // Set the current number in the BitSet.
            bitSet.set(nums[i]);
        }

        throw new IllegalArgumentException("No two sum solution exists");
    }
}
