package com.leetcode.programmingskills;

import java.util.Arrays;

public class RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int idx = (s + s).indexOf(s, 1);
        return  idx < s.length();

    }
}
