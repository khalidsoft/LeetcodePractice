package com.leetcode.programmingskills;

import java.util.Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        //Input: digits = [1,2,3]
        //Output: [1,2,4]
        //Explanation: The array represents the integer 123.
        //Incrementing by one gives 123 + 1 = 124.
        //Thus, the result should be [1,2,4].
        long rep = arrayToInteger(digits);
        return integerToArray(++rep);

    }

    public long arrayToInteger(int[] digits){
        long representation=0;
        for (int i = 0; i < digits.length; i++) {
            representation+= (long) (digits[i]*Math.pow(10, digits.length-i-1));
        }
        return representation;
    }

    public int[] integerToArray(long number){

        String temp = Long.toString(number);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i]= Character.getNumericValue(temp.charAt(i));
        }
        return digits;
    }

    public int[] plusOneVersion1(int[] digitArr){
        for (int i = digitArr.length - 1; i >= 0; i--) {
            if (digitArr[i] < 9) {
                digitArr[i]++;
                return digitArr;
            }
            digitArr[i] = 0;
        }

        digitArr = new int[digitArr.length + 1];
        digitArr[0] = 1;
        return digitArr;
    }
}
