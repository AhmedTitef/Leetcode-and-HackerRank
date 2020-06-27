import java.util.Stack;

public class leetcode8 {

    public static void main(String[] args) {
        System.out.println( removeOuterParentheses( "())" ) );
    }

//    public static String removeOuterParentheses(String S) {
//
//        char[] chars = S.toCharArray();
//
//        Stack<Character> characters = new Stack<>();
//
//
//        for (int i = 0; i < chars.length; i++) {
//
////            System.out.println( characters);
//            if (characters.empty()) {
//                characters.push( chars[i] );
//
//            } else {
//                if (chars[i] == characters.peek()) {
//                    characters.pop();
//                    characters.push( chars[i] );
//
//                } else {
//                    characters.push( chars[i] );
//                }
//                if (chars[i] == ')' && characters.peek() == '(' ){
//
//                }
//            }
//
//
//        }
//
//        int size = characters.size();
//        // we start poping out all
//        char[] result = new char[size];
//
//        System.out.println( result.length );
//        for (int i = size; i > 0; i--) {
//
////
//
//            result[i - 1] = characters.pop();
//
//
//        }
//
//
//        return String.valueOf( result );
//
//    }

    public static String removeOuterParentheses(String S) {
        StringBuilder s = new StringBuilder();
        int opened = 0;
        for (char c : S.toCharArray()) {
//            System.out.println(opened);
            if (c == '(' && opened++ > 0){
                System.out.println(opened);
                s.append( c );

            }
            if (c == ')' && opened-- > 1) {
                s.append( c );

            }


        }
//        System.out.println(opened);
        return s.toString();
    }
}
