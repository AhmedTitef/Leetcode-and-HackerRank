import java.util.Arrays;

public class leetcode17 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate( new int[] {1,2,3} ));
    }
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int nextIndex = 1;
        boolean result = false;
        for (int i = 0 ; i < nums.length - 1 ; i++){
            if (nextIndex < nums.length)
            if (nums[i] == nums[nextIndex]){
                result = true;
                break;
            }else {
                nextIndex ++;
            }

        }
        return result;
    }
}
