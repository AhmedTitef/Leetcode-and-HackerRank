package leetcode46;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.merge( new int []{3,4,5,0,0,0 } , 3 , new int [] {2,5,6} , 3);

    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        // insert from the m+n-1 position at the bigger array
        // keep 3 pointers: one at the insertion point
        // one at the end of nums1; one at the end of nums2
        int insertP = m + n - 1;
        System.out.println(insertP);
        int nums1P = m - 1;
        System.out.println(nums1P);
        int nums2P = n - 1;
        System.out.println(nums2P);

        while (nums1P >= 0 && nums2P >= 0) {
            if (nums1[nums1P] > nums2[nums2P]) {
                nums1[insertP] = nums1[nums1P];
                insertP--;
                nums1P--;

                System.out.println( Arrays.toString( nums1 ) );
            } else {
                nums1[insertP] = nums2[nums2P];
                insertP--;
                nums2P--;

                System.out.println( Arrays.toString( nums1 ) );
            }
        }
        while (nums2P >= 0) {
            nums1[insertP] = nums2[nums2P];
            insertP--;
            nums2P--;

            System.out.println( Arrays.toString( nums1 ) );
        }
//        System.out.println( Arrays.toString( nums1 ) );
    }

}
