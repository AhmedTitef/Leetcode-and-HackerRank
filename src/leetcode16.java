import java.util.Arrays;

public class leetcode16 {
    public static void main(String[] args) {
        rotate( new int[]{1,2,3,4,5,6,7}, 3 );
    }

    public static void rotate(int[] nums, int k) {
        int [] result = new int[nums.length];
        System.out.println(nums.length/2 );

        for (int i  = 0 ; i < nums.length ; i++){
//            System.out.println(i);
//            if (i < (nums.length/2) ){ //if it is below 7/2 = 3 max
//                result[i+k] = nums[i];
////
//            }else if (i >= nums.length/2){
//                result[i - k] = nums[i];
//                System.out.println(i);
//            }

            result[(i + k) % nums.length] = nums[i];


        }

        for (int i = 0 ; i < result.length ; i++){
            nums[i] = result[i];
        }
//        nums = result;

        System.out.println( Arrays.toString( nums ) );
    }

}
