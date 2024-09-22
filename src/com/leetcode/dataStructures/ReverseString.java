package com.leetcode.dataStructures;

public class ReverseString {
    public void reverseString(char[] s){
        int right=s.length-1;
        int left=0;

        while (left <= right){
           // Swap elements
            char temp= s[left];
           s[left++]=s[right];
           s[right--]=temp;
        }
    }
}
