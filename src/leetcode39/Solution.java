package leetcode39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println( solution.commonChars( new String[]{"cool", "cook", "lock" , } ) );

    }

    public List<String> commonChars1(String[] A) {

        String firstString = A[0];
        String secondString = A[1];
        String thirdString = A[2];


        boolean found = true;

        int satisfiedTimes = 0;


        List<String> results = new ArrayList<>();

        System.out.println('c' - 'a');
//        for (String value : A) {

        // cool
        // lock
        //roller

        String value = A[0];

        for (int i = 0; i < value.length(); i++) {

            satisfiedTimes = 0;
            //"c"
            // o
            // o
            //l
            value.charAt( i );

            for (int x = 0; x < A.length; x++) {
//                    System.out.println(A[x]);
              //loop 1
                // cool.contains(c)
                //lock.contains(c)
                //cook.contains(c)
            //loop 2
                //cool.contains(o)
                //lock.contains(o)
                //cook.contains(o)


                if (A[x].contains( String.valueOf( value.charAt( i ) ) )) {



                    satisfiedTimes++;
                }else {
                    break;
                }


            }
            if (satisfiedTimes == A.length) {
                results.add( String.valueOf( value.charAt( i ) ) );
            }

        }

//        }


//        for (int i = 0; i < firstString.length(); i++) {
//            if (firstString.contains( String.valueOf( secondString.charAt( i ) ) ) && thirdString.contains( String.valueOf( secondString.charAt( i ) ) )) {
//
//                results.add( String.valueOf( secondString.charAt( i ) ) );
//            }
//        }


        return results;
    }


    public List<String> commonChars(String[] A) {
        List<String> ans = new ArrayList<>();
        int[] count = new int[26];
        Arrays.fill(count, Integer.MAX_VALUE);
//        System.out.println( Arrays.toString( count ) );
        for (String str : A) {
            int[] cnt = new int[26];
            str.chars().forEach(c -> ++cnt[c - 'a']); // count each char's frequency in string str.


            for (int i = 0; i < 26; ++i) {
                count[i] = Math.min(cnt[i], count[i]);

            } // update minimum frequency.

            System.out.println( str + " " + Arrays.toString( count ) );
        }


        for (char c = 'a'; c <= 'z'; ++c) {
            System.out.println(c - 'a');
            while (count[c - 'a']-- > 0) {

                ans.add("" + c);
            }

        }
        return ans;
    }
}
