package com.leetcode.programmingskills;

public class RichestCustomerWealth {

    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int accountSum = 0;
        for (int i = 0; i < accounts.length; i++) {

            for (int j = 0; j < accounts[i].length; j++) {

                accountSum+=accounts[i][j];

            }
            if(accountSum > max){
                max = accountSum;
            }
            accountSum = 0;

        }

        return max;
    }
}
