import java.lang.reflect.Array;
import java.util.Arrays;

public class leetcode12 {
    public static void main(String[] args) {
        System.out.println( Arrays.toString( sortedSquares( new int[]{-4, -1, 0, 3, 10} ) ) );
    }

    public static int[] sortedSquares(int[] A) {

        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            result[i] = (int) Math.pow( A[i], 2 );

        }
        Arrays.sort( result );
        return result;


    }
}
