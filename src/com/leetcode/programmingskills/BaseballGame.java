package com.leetcode.programmingskills;

import java.util.ArrayList;

public class BaseballGame {

    public int calPoints(String[] operations) {
        int sum = 0;
        //Input: ops = ["5","2","C","D","+"]
        //Output: 30
        //Explanation:
        //"5" - Add 5 to the record, record is now [5].
        //"2" - Add 2 to the record, record is now [5, 2].
        //"C" - Invalidate and remove the previous score, record is now [5].
        //"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
        //"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
        //The total sum is 5 + 10 + 15 = 30.

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < operations.length; i++) {

            Character ch = operations[i].charAt(0);

            if(ch.compareTo('+') == 0){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            } else if (ch.compareTo('C') == 0) {
                list.remove(list.size()-1);
            } else if (ch.compareTo('D') == 0) {
                list.add(list.get(list.size()-1)*2);
            } else{
                list.add(Integer.parseInt(operations[i]));
            }
        }

        for (int num:list){
            sum+=num;
        }
        return sum;
    }


}
