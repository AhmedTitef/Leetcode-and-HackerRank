public class leetcode2 {

//    Given a m * n matrix grid which is sorted in non-increasing order both row-wise and column-wise.
//
//    Return the number of negative numbers in grid.
//
//
//
//    Example 1:
//
//    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//    Output: 8
//    Explanation: There are 8 negatives number in the matrix.
//            Example 2:
//
//    Input: grid = [[3,2],[1,0]]
//    Output: 0

    public static int countNegatives(int[][] grid) {
        int negative = 0;
        for (int i = 0 ; i < grid.length ; i++){
            for (int j = 0; j < grid.length ; j++){
                if (grid[i][j] < 0){
                    negative++;
                }

            }
        }
        return negative;
    }

    public static void main(String[] args) {
//        System.out.println(countNegatives(5  ));
    }

}
