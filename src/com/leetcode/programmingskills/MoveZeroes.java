package com.leetcode.programmingskills;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        if(findZeroIndex(nums) != -1) {
            Arrays.sort(nums);
            int index = 0; // Index to place the next non-zero element

            // Loop through the array, moving non-zero elements to the front
            for (int num : nums) {
                if (num != 0) {
                    nums[index++] = num;
                }
            }

            // Fill the remaining positions with zeros
            while (index < nums.length) {
                nums[index++] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static int findZeroIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                return i; // Return the index when a 0 is found
            }
        }
        return -1; // Return -1 if no 0 is found in the array
    }
}
