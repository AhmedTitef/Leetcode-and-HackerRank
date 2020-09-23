import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        System.out.println( Arrays.toString( selectionSort.sort( new int[]{99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0} ) ) );

    }

    int[] sort(int [] array){ //from smallest to largest

        for (int i = 0 ; i < array.length ; i++){
            for (int j = i+1 ; j < array.length ; j++){
                if (array[i] > array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }

}
