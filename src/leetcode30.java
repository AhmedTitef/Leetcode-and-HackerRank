import java.util.ArrayList;
import java.util.Arrays;

public class leetcode30 {
    public static void main(String[] args) {
        Solution30 solution30 = new Solution30();
        System.out.println(solution30.heightChecker( new int[]{1,1,4,2,1,3} ));
    }
}
class Solution30{
    public int heightChecker(int[] heights) {
        int[] copy = heights.clone();
        Arrays.sort(copy);
        int count = 0;
        for(int i = 0; i < copy.length; i++){
            if(heights[i]!=copy[i])count++;
        }
        return count;
    }
}
