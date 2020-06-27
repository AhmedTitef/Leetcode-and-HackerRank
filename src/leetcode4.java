import java.util.Arrays;

public class leetcode4 {

    public static void main(String[] args) {


        System.out.println( Arrays.toString( shuffle( new int[]{2, 5, 1, 3, 4, 7}, 3 ) ) );
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] array = new int[2 * n];

        for (int i = 0; i < nums.length / 2; i++) {

            array[2 * i] = nums[i];
            array[2 * i + 1] = nums[n];

            n++;
        }

        return array;

    }
}
