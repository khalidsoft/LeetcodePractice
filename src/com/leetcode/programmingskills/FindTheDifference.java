package com.leetcode.programmingskills;

import java.util.Arrays;

public class FindTheDifference {
    public char findTheDifference(String s, String t) {
        char[] chS= s.toCharArray();
        char[] chT= t.toCharArray();
        Arrays.sort(chS);
        Arrays.sort(chT);
        int i=0,j=0;
        while (i<s.length() && j<t.length()){
           if(chS[i]!=chT[j]) break;
           i++;
           j++;
        }
        return chT[j];
    }
}
