package com.leetcode.programmingskills;

public class RobotReturnOrigin {

    public boolean judgeCircle(String moves) {
        int sum=0;
        char[] ch = moves.toCharArray();
        for (int i = 0; i < moves.length(); i++) {
            switch (ch[i]){
                case 'R': sum++; break;
                case 'L': --sum; break;
                case 'U': sum+=3; break;
                case 'D': sum-=3; break;
            }
        }

        return (sum==0)?true:false;
    }

}
