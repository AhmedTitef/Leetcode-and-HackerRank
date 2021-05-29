package leetcode42;

//https://leetcode.com/problems/goal-parser-interpretation/submissions/

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.interpret( "()()()" ));
    }

    public String interpret(String command) {

       //if command has () replace it with o if not then just add it to the new string
        StringBuilder newString = new StringBuilder();
//
//
//
//
        for (int i = 0 ; i< command.length() ;i++){
//            System.out.println("before : " +i);
            if (command.charAt( i ) == '(' && command.charAt( i+1 ) == ')' && (i+1) <command.length()){
                newString.append( "o" );
                i++;
//                System.out.println("after =" + i);
            }
            else if (command.charAt( i ) == 'G'){
                newString.append( "G" );
            }
//
            else {
                newString.append( "al"  ); //go(al)
                i = i+3;
            }




        }

//        newString = command.replaceAll( "()" , "o" )  + command.replace( "G" , "G" );
//       newString =  command.replace( "G" , "G" );
//        newString = command.replace( "(al)" , "al" );

        return newString.toString();

    }
}
