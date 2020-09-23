import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        InsertionSort insertionSort = new InsertionSort();
        System.out.println( Arrays.toString( insertionSort.sort( new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0} ) ) );
    }

    int[] sort(int[] array) {


        // thats main for loop
        for (int i = 0; i < array.length; i++) { // i is the main number we gonna move around
            // thats inside for loop that loops thru previous items and place the index on top from prev loop to sorted position

            for (int j = 0; j < i; j++) {  //j is all number prior to i
                if (array[i] < array[j]) {
                    //shifting here
                    int temp = array[i];

                    for (int x = i; x > j; x--) { //x is the all number between i and j to shift
                        array[x] = array[x - 1];

                    }
                    array[j] = temp;

                }
            }


        }
        return array;
    }
}
