import java.util.Arrays;

public class leetcode19 {

    public static void main(String[] args) {
        System.out.println( repeatedNTimes( new int[]{1,2,3,3} ) );
    }

    static public int repeatedNTimes(int[] A) {

        int[] count = new int[10];
        for (int a : A) {
//            System.out.println( "a : " + a );
//            System.out.println( "count: " + count[a] );

            if (count[a] == 1) {




                // the first element we see that he is equal 1



                return a;
            }else {
                count[a]++;
            }

            System.out.println( Arrays.toString( count ) );
        }



        return -1;
    }

}
