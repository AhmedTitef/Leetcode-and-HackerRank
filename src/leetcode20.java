public class leetcode20 {
    public static void main(String[] args) {

        System.out.println(judgeCircle(  "RLUURDDDLU"));

    }

    public static  boolean judgeCircle(String moves){

        int x = 0;
        int y = 0;

        char [] chars = moves.toCharArray();
        for (int i = 0 ; i < chars.length ; i++){
            if (chars[i] == 'R'){
                x ++;
            }else if (chars[i] == 'L'){
                x--;
            }else if (chars[i]== 'U'){
                y++;
            }else if (chars[i]== 'D'){
                y--;
            }

        }

        if (x  == 0 && y == 0 ){
            return true;
        }
        return false;
    }



}
