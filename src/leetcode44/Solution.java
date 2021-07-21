package leetcode44;

public class Solution {
    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isPalindrome( 11 ));

    }

    public boolean isPalindrome(int x) {
        if (x < 0 ) {
            return false;

        }else if (x%10 == 0 && x!=0){
            return false;
        }else{


            char [] charcters = String.valueOf( x ).toCharArray();

            for (int i = 0 ; i < charcters.length ; i++){
                if (charcters[i] == charcters[charcters.length-1-i]){
                    if (i == charcters.length-i-1){
                        return true;

//                    System.out.println(i);
//                    System.out.println(charcters.length);
                    }


                }else{
                    return false;
                }
            }

        }

        return true;
    }
}
