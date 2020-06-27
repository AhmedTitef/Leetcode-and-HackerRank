public class leetcode6 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit( "RLRRLLRLRL" ));
    }

    public static int balancedStringSplit(String s) {
         char [] array = s.toCharArray();
        int res=0, ct=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]=='L') ct--;
            else ct++;
            if(ct==0) res++;
        }
        return res;
    }
}
