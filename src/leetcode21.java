import java.util.ArrayList;
import java.util.Arrays;

public class leetcode21 {

    public static void main(String[] args) {
        System.out.println(largestTimeFromDigits( new int [] {5,5,5,5} ));
    }

    public static String largestTimeFromDigits(int[] A) {


        ArrayList<Integer> arrayList = new ArrayList<>(  );
        int [] subarray = new int[4];
        System.out.println( Arrays.toString( subarray ) );
        int max = A[0];
        for (int i = 0 ; i< A.length ; i++){


            if (A[i] <= 2  && A[i] >= max && !arrayList.contains( A[i] )){
                max = A[i];
                arrayList.add( 0 , max );
                subarray [0] = max;
            }else {

                return "";


            }
        }
        max = A[0];
        for (int i = 0 ; i< A.length ; i++){


            if (A[i] <= 3  && A[i] >= max && !arrayList.contains( A[i] )){
                max = A[i];
                arrayList.add( 1 , max );
                subarray [1] = max;
            }else {
                System.exit( 1 );
                return "";
            }
        }
        max = A[0];
        for (int i = 0 ; i< A.length ; i++){


            if (A[i] <= 5  && A[i] >= max && !arrayList.contains( A[i] )){
                max = A[i];
                arrayList.add( 2 , max );
                subarray [2] = max;
            }else {
                return "";
            }
        }
        max = A[0];
        for (int i = 0 ; i< A.length ; i++){


            if (A[i] <= 9  && A[i] >= max  && !arrayList.contains( A[i] )){
                max = A[i];
                arrayList.add( 3 , max );
                subarray [3] = max;
            }else {
                return "";
            }
        }
        return String.valueOf( arrayList );

    }
}
