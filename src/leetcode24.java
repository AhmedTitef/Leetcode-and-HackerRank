import java.util.Arrays;

public class leetcode24 {
    public static void main(String[] args) {
        Solution solution = new Solution() ;
        System.out.println(solution.restoreString( "codeleet" ,  new int[]{4,5,6,7,0,2,1,3}));

    }

}

  class Solution{
      public String restoreString(String s, int[] indices) {
    char[] chars = s.toCharArray();
    char [] newChars = new char[s.length()];

    for (int i = 0 ; i< indices.length ; i++){
    newChars[indices[i]] = chars[i];
}

return String.valueOf( newChars );
      }
}