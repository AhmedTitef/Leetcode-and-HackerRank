public class reverseArray {
    public static void main(String[] args) {
        System.out.println(reverseString( "My name is Ahmed" ));
    }

    public static String reverseString(String string){

        char [] chars = string.toCharArray();
        for (int i = 0 ; i < string.length()/2 ; i++){
            char temp = chars[string.length() - 1 - i];
            chars [string.length()- 1-i] = chars[i];
            chars[i] = temp;
        }
        return java.util.Arrays.toString( chars );
    }
}
