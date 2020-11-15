import java.util.Arrays;

public class leetcode29 {

    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        System.out.println( Arrays.toString( solution29.sumZero( 5 ) ) );
    }
}

class Solution29{
    public int[] sumZero(int n) {
        int [] result = new int[n];

        if (n ==1 ){
            return new int[]{0};
        }

        else {

            for (int i = 0 ; i < n ; i+=2){

                if ((i + 1) < n) {
                    result[i] = i + 1;

                    result[i + 1] = result[i] * -1;
                }


            }


        }

        return result;

    }
}
