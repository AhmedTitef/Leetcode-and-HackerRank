import java.util.Arrays;

public class leetcode35 {
    public static void main(String[] args) {
        Solution35 solution35 = new Solution35();
        System.out.println(solution35.removeElement( new int []{3,2,2,3} , 3 ));
    }
}
class Solution35 {
    public int removeElement(int[] nums, int val) {

        int occurrences = 0 ;
        for (int i = 0 ; i < nums.length ; i++){
            if (nums[i] != val){
                nums[occurrences] = nums[i] ;
                occurrences ++;
            }
        }
        System.out.println( Arrays.toString( nums ) );
        return occurrences;
    }
}