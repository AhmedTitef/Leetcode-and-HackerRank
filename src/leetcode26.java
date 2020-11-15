public class leetcode26 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        System.out.println(solution26.numIdenticalPairs( new int[]{1,1,1,1} ));
    }
}
class Solution26 {
    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0 ; i < nums.length ; i++){
            for (int j = i+1 ; j < nums.length; j++){
                if (nums[i] == nums[j] && i < j){
                    count++;
                }
            }

        }
        return count;
    }
}