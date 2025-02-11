package com.leetcode.programmingskills;

public class CountOdds {
    public int countOdds(int low, int high){
        int i=high-low+1;
        if(i%2==0) return i/2;
        else if (high%2!=0 && low%2!=0) {
            return i/2+1;
        }else
            return i/2;
    }
}
