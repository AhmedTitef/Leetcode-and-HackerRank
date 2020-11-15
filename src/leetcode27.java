public class leetcode27 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        System.out.println( solution27.romanToInt( "IX" ) );
    }
}

class Solution27 {
    public int romanToInt(String s) {

        int total = 0;
        for (int i = 0 ; i < s.toCharArray().length ; i++) {



            switch (s.charAt( i )){
                case 'I':

                    total = total + 1;
                    break;
                case 'V':
                    total = total + 5;
                case 'X':
                    total = total + 10;
                    break;
                case 'L':
                    total = total + 50;
                case 'C':
                    total = total + 100;
                    break;
                case 'D':
                    total = total + 500;
                    break;
                case 'M':
                    total = total + 1000;
                    break;

            }

            if (s.charAt( i ) == 'V');

        }
        return total;

    }
}
