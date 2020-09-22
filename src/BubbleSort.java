import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort( new int[] {99, 44, 6, 2, 1, 5, 63, 87, 283, 4, 0} );
    }

    void sort(int [] array){

        for (int j = 0 ; j < array.length ; j++ ){
            for (int i = 0 ; i < array.length-1 ; i++){
                System.out.println(i);
                if (array[i] > array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }else {

                }


            }
        }


        System.out.println( Arrays.toString( array ) );
    }

    void swap(int a ,int b){

        int temp = a;
        a = b;
        b = temp;
    }
}
