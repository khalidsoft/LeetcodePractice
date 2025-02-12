package com.leetcode.programmingskills;

public class Average {
    public double average(int[] salary) {
        int max=salary[0];
        int min=salary[0];
        int total = salary[0];
        for (int i = 1; i < salary.length; i++) {
            if(max<salary[i]) max=salary[i];
            if(min>salary[i]) min=salary[i];
            total+=salary[i];
        }
        return (double) (total - (max + min)) /(salary.length-2);
    }
}
