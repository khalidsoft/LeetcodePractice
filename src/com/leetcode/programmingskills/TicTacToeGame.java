package com.leetcode.programmingskills;

import java.util.Arrays;

public class TicTacToeGame {

    public String tictactoe(int[][] moves) {

        //The first player A always places 'X' characters, while the second player B always places 'O' characters
        //X' and 'O' characters are always placed into empty squares, never on filled ones.

        int[][] A;
        int[][] B;
        int pA=0;
        int pB=0;

        for (int i = 0; i < moves.length; i++) {
            if (i%2==0){
                System.out.println("Player A --> Position ["+moves[i][0]+","+moves[i][1]+"] ---> X");
                //A[][]
                //Diagonal

                //Column

                //Row

            }else {
                System.out.println("Player B --> Position ["+moves[i][0]+","+moves[i][1]+"] ---> o");
            }



        }

//        System.out.println("Player A "+ Arrays.toString(A));
//        System.out.println("Player B "+ Arrays.toString(B));

        return "Pending";

    }
}
