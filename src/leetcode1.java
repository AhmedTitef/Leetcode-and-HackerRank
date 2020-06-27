public class leetcode1 {

//    Given a positive integer num consisting only of digits 6 and 9.
//
//    Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
//
//
//
//    Example 1:
//
//    Input: num = 9669
//    Output: 9969
//    Explanation:
//    Changing the first digit results in 6669.
//    Changing the second digit results in 9969.
//    Changing the third digit results in 9699.
//    Changing the fourth digit results in 9666.
//    The maximum number is 9969.
//    Example 2:
//
//    Input: num = 9996
//    Output: 9999
//    Explanation: Changing the last digit 6 to 9 results in the maximum number.
//            Example 3:
//
//    Input: num = 9999
//    Output: 9999
//    Explanation: It is better not to apply any change.

    public static int maximum69Number (int num) {
        String numm = Integer.toString(num);
        System.out.println(numm);
        char [] numbers = numm.toCharArray();// 9, 6, 6,9

        System.out.println(numbers);
        for (int i = 0 ; i< numm.length() ; i++){
            System.out.println("number is " + numbers[i]);
            if (numbers[i] == '6'){

                numbers[i] = '9';

                break;
            }


        }
        numm = new String(numbers);
        num = Integer.parseInt(numm);
        return num;
    }

    public static void main(String[] args) {
        System.out.println(maximum69Number( 9669 ));
    }

}
