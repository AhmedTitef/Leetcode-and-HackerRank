
import java.io.*;
import java.util.*;


//
//
//We define the following:
//        A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and
//        . Something like would not be a subarray as it's not a contiguous subsection of the original array.
//        The sum of an array is the total sum of its elements.
//        An array's sum is negative if the total sum of its elements is negative.
//        An array's sum is positive if the total sum of its elements is positive.
//        Given an array of integers, find and print its number of negative subarrays on a new line.
//        Input Format
//        The first line contains a single integer, , denoting the length of array
//        The second line contains space-separated integers describing each respective element,
//        .
//        , in array .
//        Constraints
//        Output Format
//        Print the number of subarrays of

public class subArray {


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner( System.in );

        int input = scanner.nextInt();
        int[] a = new int[input];
        int sum ;
        int count = 0;
        for (int i = 0; i < input; i++) {

            a[i] = scanner.nextInt();



        }

        for (int i = 0; i < a.length; i++) {
            sum = 0;

            for (int j = i; j < a.length; j++) {

                sum = sum + a[j];


                if (sum < 0) {
//                    System.out.println( "i : " + i + " and j : " + j + " and sum : " + sum );
                    count++;
                }


            }

        }


        System.out.println( count );


    }


}
