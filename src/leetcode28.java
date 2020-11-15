public class leetcode28 {

    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        System.out.println(solution28.sumOddLengthSubarrays( new int[]{1,4,2,5,3} ));
    }

}

class Solution28 {
//    public int sumOddLengthSubarrays(int[] arr) {
//
//        int sum = 0;
//        for (int value : arr) {
//            sum = sum + value;
//
//        }
//
//        int arraylength = arr.length;
//        // 1 we keep increasing 2n -1 , 1 , 3 , 5 ,8 and has to be smaller than arr.length
//
//
//        for (int x = 0 ; x < 3  ;x++){
//            for (int i = x; i < 3  +x ; i++){
//                System.out.println(i);
//                sum = sum + arr[i];
//            }
//
//        }
//
//
//        return sum;
//    }


    public int sumOddLengthSubarrays(int[] A) {
        int res = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            res += ((i + 1) * (n - i) + 1) / 2 * A[i];
        }
        return res;
    }

}