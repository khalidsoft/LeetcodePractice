package com.leetcode.programmingskills;

public class RomanInteger {
    public int romanToInt(String s) {
      char[] sChar = s.toCharArray();
      int total = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            if(i>0) {
                if (integer(sChar[i]) > integer(sChar[i - 1])) {
                    total += integer(sChar[i]) - integer(sChar[i - 1]);
                    i--;
                } else {
                    total += integer(sChar[i]);
                }
            }else total += integer(sChar[0]);


        }
        return total;
    }

    public int integer(char ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
