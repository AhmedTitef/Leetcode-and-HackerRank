package leetcode38;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println( solution.luckyNumbers( new int[][]{{1,10,4,2}, {9,3,8,7}, {15,16,17,12}} ) );
    }

    public List<Integer> luckyNumbers(int[][] matrix) {


        // column
        //row

        List<Integer> smallestInRow = new ArrayList<>();
        List<Integer> largestInColumn = new ArrayList<>();

        List<Integer> results = new ArrayList<>();



        //getting smallest in rowss
        for (int i = 0; i < matrix.length; i++) {

            int smallestInRows = matrix[i][0];

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] < smallestInRows) {
                    smallestInRows = matrix[i][j];


//
                }



            }



            smallestInRow.add( smallestInRows );



        }

        //getting largest in column

        for (int i = 0; i < matrix[0].length; i++) {
            int largestInColumns = matrix[0][i];


            for (int j = 0; j < matrix.length; j++) {




                if (matrix[j][i] > largestInColumns) {
                    largestInColumns = matrix[j][i]; //
//                    System.out.println();
//                    largestInColumns = matrix[i][j];

                }


            }





            largestInColumn.add( largestInColumns );

        }



        //comparing to see any common numbers

        for (int i = 0 ; i < smallestInRow.size() ; i++){
            for (int  j = 0 ; j < largestInColumn.size(); j++){
                if (smallestInRow.get( i ).equals( largestInColumn.get( j ) )){
                    results.add( smallestInRow.get( i ) );
                }
            }
        }
        return results;

    }


}
