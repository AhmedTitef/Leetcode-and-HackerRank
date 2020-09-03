import java.util.ArrayList;
import java.util.Arrays;

public class leetcode21 {

    public static void main(String[] args) {
        System.out.println( largestTimeFromDigits( new int[]{0, 0, 0, 0} ) ); //17:36
    }

    public static String largestTimeFromDigits(int[] A) {


        ArrayList<Integer> arrayList = new ArrayList<>();
//
//

//
        int max = -1;
        boolean isValid = false;

        for (int i = 0; i < A.length; i++) {

            if (A[i] <= 2 && A[i] >= max) {
                max = A[i];
                isValid = true;


            }


        }
        arrayList.add( 0, max );

        if (!isValid) {


            return "";

        }
        isValid = false;
        max = -1;
        for (int i = 0; i < A.length; i++) {


            if (A[i] <= 3 && A[i] >= max && arrayList.get( 0 ) == 2 && !arrayList.contains( A[i] ) || A[i] <= 9 && A[i] >= max && arrayList.get( 0 ) == 1 && !arrayList.contains( A[i] )|| A[i] ==0  && A[i] >= max && arrayList.get( 0 ) == 0) {
                max = A[i];
                isValid = true;


            }


        }
        arrayList.add( 1, max );
        if (!isValid) {



            return "";

        }
        isValid = false;
        max = -1;
        for (int i = 0; i < A.length; i++) {


            if (A[i] <= 5 && A[i] >= max && !arrayList.contains( A[i] )|| A[i] ==0  && A[i] >= max && arrayList.get( 1 ) == 0) {
                max = A[i];
                isValid = true;


            }

        }
        arrayList.add( 2, max );
        if (!isValid) {


            return "";

        }
        isValid = false;
        max = -1;
        for (int i = 0; i < A.length; i++) {

//1,2,3,4
            if (A[i] <= 9 && A[i] >= max && !arrayList.contains( A[i] )|| A[i] ==0  && A[i] >= max && arrayList.get( 1 ) == 0) {
                max = A[i];
                isValid = true;


            }

        }
        arrayList.add( 3, max );
        if (!isValid) {

            return "";

        }
        System.out.println( Arrays.toString( arrayList.toArray() ) );
        return arrayList.get( 0 ).toString() + arrayList.get( 1 ).toString() + ":" + arrayList.get( 2 ).toString() + arrayList.get( 3 ).toString();

    }
}
