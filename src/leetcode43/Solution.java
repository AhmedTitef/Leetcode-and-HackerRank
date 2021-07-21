package leetcode43;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {


    public static void main(String[] args) {

        Solution solution = new Solution();
//        System.out.println( Arrays.toString( solution.twoSum(  new int , 3 ) ) );
    }


    public int[] twoSum(int[] nums, int target) {
//    nums = new int [4,5];

//        ArrayList <Integer> arrayList = new ArrayList<>(  );
        int [] result = new int [2];

    for (int i = 0 ; i < nums.length ; i++){

        for (int j = i+1; j < nums.length ; j++){

            if ((nums[i]+nums[j]) == target){

                result[0] = i;
                result[1] = j;
            }
        }
    }

        System.out.println( Arrays.toString( result ) );
    return result;

    }

}
