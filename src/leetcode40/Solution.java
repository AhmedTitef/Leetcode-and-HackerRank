package leetcode40;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int amounts[][] = {{2,8,7} , {7,1,3}, {1,9,5}};
        System.out.println( "Result is : " + solution.maximumWealth( amounts ) );
    }

    public int maximumWealth(int[][] accounts) {


        int sum = 0;
        int max = 0;

        System.out.println(accounts.length);
        for (int man = 0; man < accounts.length; man++) {
            for (int bank = 0; bank < accounts[0].length; bank++) {
                System.out.println( accounts[man][bank] );
                sum = accounts[man][bank] + sum;

            }

            if (sum >= max) { //17
                max = sum;
                sum = 0; // max = 6 , sum = 0

                System.out.println( "____MAX____ " +max );
            }
            sum = 0;
        }


        return max;
    }
}
