package com.example.twosum;
import java.util.HashMap;
import java.util.Map;

/**
 * //Problem Link: https://leetcode.com/problems/two-sum/description/
 * Class to solve the Two Sum problem.
 *
 * <p>This class provides a method to find the indices of two numbers in an array that add up to a
 * specific target. The method uses a HashMap to achieve an optimal time complexity.
 *
 * <p>Time Complexity: O(n), where n is the number of elements in the array.
 * Space Complexity: O(n), due to the additional space required by the HashMap.
 */
public class TwoSumHashMapSolution {

    /**
     * Finds the indices of the two numbers in the array that add up to the target.
     *
     * @param nums   The array of integers to search through.
     * @param target The target sum we are looking for.
     * @return An array containing the indices of the two numbers that add up to the target.
     * @throws IllegalArgumentException If no two numbers add up to the target.
     */
    public int[] twoSum(int[] nums, int target) {
        // Initialize a HashMap to store numbers and their corresponding indices for quick lookup.
        // Key: number from the array
        // Value: index of the number
        Map<Integer, Integer> numMap = new HashMap<>();

        // Iterate over the array once to maintain O(n) time complexity.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement number that would add up with nums[i] to reach the target.
            int complement = target - nums[i];

            // Check if the complement exists in the HashMap.
            if (numMap.containsKey(complement)) {
                // If it exists, we have found the two numbers.
                // Return the indices of the complement and the current number.
                return new int[]{numMap.get(complement), i};
            }

            // If the complement doesn't exist in the map, add the current number and its index to the map.
            // This will help in checking for complements in subsequent iterations.
            numMap.put(nums[i], i);
        }

        // Since the problem statement guarantees exactly one solution, this line should never be reached.
        // Throw an exception to indicate that no valid pair was found.
        throw new IllegalArgumentException("No two sum solution exists");
    }
}
