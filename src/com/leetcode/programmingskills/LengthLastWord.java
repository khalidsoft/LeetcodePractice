package com.leetcode.programmingskills;

public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        char[] ch = s.toCharArray();
        char space = ' ';
        int lenght = 0;
        //U+0020 space character
        int i = s.length()-1;
        boolean findWord = false;
        while(i>=0){
            if(Character.compare(ch[i],space) !=0){
                lenght++;
                findWord = true;
            } else if (findWord) {
                return lenght;
            }
            i--;
        }
        return lenght;
    }
}
