package leetcode45;

import java.util.Arrays;

public class Solution {
    public String longestCommonPrefix(String[] strs) {

        Arrays.sort(strs);
        System.out.println( Arrays.toString( strs ) );
         if (strs.length == 0) return "";
    String pre = strs[0];
    for (int i = 1; i < strs.length; i++)
        while(strs[i].indexOf(pre) != 0)
            pre = pre.substring(0,pre.length()-1);
    return pre;
//

    }

//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0)
//            return "";
//
//        Arrays.sort(strs);
//        String first = strs[0];
//        String last = strs[strs.length - 1];
//        int c = 0;
//        while(c < first.length())
//        {
//            if (first.charAt(c) == last.charAt(c))
//                c++;
//            else
//                break;
//        }
//        return c == 0 ? "" : first.substring(0, c);
//    }
//}


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.longestCommonPrefix( new String[] {"flower" , "flow","flight" } ));


    }
}
