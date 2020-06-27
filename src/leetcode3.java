import java.util.Arrays;
import java.util.Random;

/*
Given an integer n, return any array containing n unique integers such that they add up to 0.



Example 1:

Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4].

 */
public class leetcode3 {


    public static void main(String[] args) {
        System.out.println( Arrays.toString( sumZero( 5 ) ) );
    }

    public static int[] sumZero(int n) {
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        arr[n - 1] = -sum;
        return arr;
    }
}
