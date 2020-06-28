import java.util.Arrays;

public class leetcode10 {
    public static void main(String[] args) {
        System.out.println( Arrays.toString( replaceElements( new int [] {17,18,5,4,6,1} )));
    }

    public static int[] replaceElements(int[] arr) {


//        int [] result = new int [arr.length];
//        for (int x = 0 ; x < arr.length ; x++){
//            int max = 0;
//            for (int i = x+1; i < arr.length ; i++){
//                if (arr[i]  >= max){
//                    max = arr[i];
//
//                }
//
//
//            }
//            result [x] = max;
//        }
//
//
//        result[arr.length - 1] = -1;
//        return  result;
//        int  [] result = new int [arr.length];
//        int end = arr.length;
//        int endvalue = -1;
//
//        for (int i = 0 ; i < arr.length ; i++){
//            int max = 0;
//            if ((i+1) < arr.length  ){
//                if (arr[i] > arr[i+1]){
//                    result[i] = arr[i];
//                }else if (arr[i] < arr[i+1]){
//                    result[i] = arr[i+1];
//                }
//            }
//
//        }
//        return result;
        int[] newElements = new int[arr.length];
        int maxValue = -1;

        // traverse string backward
        for (int j = arr.length-1; j >=0; j--) {

            newElements[j] = maxValue;
            maxValue = Math.max(arr[j], maxValue);
            System.out.println(maxValue);
        }

        return newElements;
    }
}
