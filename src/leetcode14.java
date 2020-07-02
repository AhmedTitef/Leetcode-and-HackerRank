import java.util.Arrays;

public class leetcode14 {
    public static void main(String[] args) {
        System.out.println( removeDuplicates( new int[]{0,0,1,1,1,2,2,3,3,4} ) );
    }

    public static int removeDuplicates(int[] nums) {

        int count = 1;
        int j = 1;
        int x = 1;
        for (int i = 0; i < nums.length - 1; i++) {

            if (j < nums.length) {


                //if current number is not equal to the next number which means there is no duplicate, add count by 1 because we trying to count non duplicates
                if (nums[i] != nums[j]) {
                    count++;
                    nums[x] = nums[j]; // here we replacing the duplicate with very first part of the array
                    x++;
                }
                j++;
            }

        }

        System.out.println( Arrays.toString( nums ) );
        return count;

    }
}
