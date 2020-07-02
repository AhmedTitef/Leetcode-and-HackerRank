import java.util.Arrays;
import java.util.Random;

public class leetcode13 {
    public static void main(String[] args) {
        System.out.println(generateTheString( 4 ));
    }
    public static String generateTheString(int n) {
//        String AlphaNumericString = "abcdefghijklmnopqrstuvxyz";
//        char [] chars = AlphaNumericString.toCharArray();
//        char [] result = new char[n];
//
//        Random random = new Random(  );
//        for (int i = 0 ; i< n ; i++){
//            int index = random.nextInt( chars.length );
//            System.out.println(chars[index]);
//            result[i] = chars[index];
//
//        }
//        for (int i = 0 ; i <result.length ; i++){
//
//        }
//
//        return "";
//
//    }

        char[] str = new char[n];
        Arrays.fill( str, 'a' );
        if (n % 2 == 0) {
            str[0] = 'b';
        }
        return new String( str );
    }
}
