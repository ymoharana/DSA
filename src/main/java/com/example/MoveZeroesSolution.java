package com.example;

/**
 * Class to solve the Move Zeroes problem.Link: <a href="https://leetcode.com/problems/move-zeroes/description/">...</a>
 *
 * <p>This class provides a method to move all zeros in an integer array to the end while
 * maintaining the relative order of non-zero elements. The operation is performed in-place without
 * using additional memory for another array.
 *
 * <p>Time Complexity: O(n), where n is the number of elements in the array.
 * Space Complexity: O(1), since we are modifying the array in place.
 */
public class MoveZeroesSolution {

    /**
     * Moves all zeros in the array to the end while maintaining the relative order of non-zero elements.
     *
     * @param nums The array of integers to modify.
     */
    public void moveZeroes(int[] nums) {
        // Initialize a pointer to keep track of the position to insert the next non-zero element.
        int insertPos = 0;

        // Iterate over the array to process each element.
        for (int num : nums) {
            // Check if the current element is non-zero.
            if (num != 0) {
                // Place the non-zero element at the current insert position.
                nums[insertPos] = num;

                // Increment the insert position for the next non-zero element.
                insertPos++;
            }
            // If the element is zero, do nothing and continue to the next element.
        }

        // After all non-zero elements have been moved to the front,
        // fill the remaining positions in the array with zeros.
        while (insertPos < nums.length) {
            nums[insertPos] = 0;
            insertPos++;
        }
    }
}
