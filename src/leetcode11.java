import java.util.Arrays;

public class leetcode11 {
    public static void main(String[] args) {
        System.out.println( Arrays.toString( diStringMatch( "III" ) ) );
    }

    public static int[] diStringMatch(String S) {
        char[] array = S.toCharArray();
        int[] result = new int[array.length+1];
        int d = array.length;
        int i = 0;
        for (int x = 0; x < S.length(); x++) {

            if (array[x] == 'I') {
                result[x] = i;
                i++;
                System.out.println(i);
            } else if (array[x] == 'D') {
                result[x] = d;
                d--;

            }

            // now when we reach the end of the string
            if (x == S.length()-1){
                if (array[x] == 'I'){

                    result[x+1] = i;
                    i++;
                }else if (array[x] == 'D'){

                    result[x+1] = d;
                    d--;
                }
            }


        }
        return result;
    }

}
