package com.leetcode;

import java.util.Arrays;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int j,i=0;


        while (i<nums.length) {
            j = 0;
            while (j< nums.length && i!=j) {

                if (target == nums[i] + nums[j]) {
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
                j++;
            }
            i++;
        }
        return result;
    }
}

