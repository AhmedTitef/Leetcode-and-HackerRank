import java.util.Arrays;

public class leetcode5 {
    public static void main(String[] args) {
        System.out.println( Arrays.toString( createTargetArray( new int[]{1,2,3,4,0}, new int[]{0,1,2,3,0} ) ) );
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        for (int i = 0; i < index.length; i++) {


            if (target[index[i]] == 0) {
//
                System.out.println(target[index[i]]);
                target[index[i]] = nums[i];
            } else {
                //move all the array one step to the right
//                System.out.println("since this field is busy we going to shift and add");
                for (int j = nums.length - 2; j >= index[i]; j--) {




                    target[j + 1] = target[j];


                }
                target[index[i]] = nums[i];
//


            }
            System.out.println( Arrays.toString( target ) );



        }
        return target;
    }
}
