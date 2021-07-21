package codility;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        Solution answer   = new Solution();

        System.out.println(answer.solution( "baba" ));
    }

    public int solution(String s){
        char [] charArray = s.toCharArray();

        ArrayList <Integer> count = new ArrayList<>(  );

        for (int i = 0 ; i < charArray.length-1 ; i++){
            if (charArray[i] == charArray[i+1] ){
                System.out.println("yes");
                count.get( count.indexOf( charArray[i] ) );

            }
            else{
                System.out.println("no");
            }
        }
        return 0;
    }



}
