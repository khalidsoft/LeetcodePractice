package com.leetcode.programmingskills;

public class PalindrumeNumber {

    public boolean isPalindrome(int x) {
        if(x>0) {
            String str = String.valueOf(x);
            for (int i = 0; i < str.length(); i++) {
                if (Character.compare(str.charAt(i),str.charAt(str.length()-i-1)) != 0) {
                    return false;
                }
            }
            return true;
        }else{
            return (x<0)?false:true;
        }
    }
}
