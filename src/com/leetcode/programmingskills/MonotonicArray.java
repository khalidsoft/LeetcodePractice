package com.leetcode.programmingskills;

import java.util.Arrays;

public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {

        boolean increasing = false;

        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i]!=nums[i+1]){
                increasing = nums[i] < nums[i+1];
                break;
            }
        }


        for (int i = 1; i < nums.length-1; i++) {
            if(nums[i]!=nums[i+1]) {
                if ((nums[i] <= nums[i + 1] && !increasing) || (nums[i] >= nums[i + 1] && increasing))
                    return false;
            }
        }
        return true;
    }
}
