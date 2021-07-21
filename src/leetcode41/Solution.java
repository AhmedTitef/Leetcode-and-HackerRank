package leetcode41;


//https://leetcode.com/problems/count-items-matching-a-rule/



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;





public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> list = new ArrayList<>(  );

//        list.add(  )
//        System.out.println(Solution.countMatches(  ));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        // items[item1,item2]
        //item1 = [type , color, name]



        //rulekey = type //index 0
        //rulekey = color // index 1
        //rulekey = name //index 2

        //rulevalue =item1[rulevalue]

        int times = 0;

        for (int item = 0 ; item< items.size() ; item++){


            List<String> oneItem;
            oneItem = items.get( item );

            if (ruleKey.equals( "type" )){
                if (oneItem.get( 0 ).equals( ruleValue )){
                    times++;
                }
            }else if (ruleKey.equals( "color" )){
                if (oneItem.get( 1 ).equals( ruleValue )){
                    times++;
                }
            }else if (ruleKey.equals( "name" )){
                if (oneItem.get( 2 ).equals( ruleValue )){
                    times++;
                }
            }




//          if (  items.get( item ).contains( ruleValue )){
//              times ++;
//          }
        }


        return times;
    }
}
