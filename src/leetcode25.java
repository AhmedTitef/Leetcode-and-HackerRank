public class leetcode25 {
    public static void main(String[] args) {
        Solution25 solution = new Solution25();
        System.out.println(solution.defangIPaddr("1.1.1.1"  ));
    }
}
class Solution25{

    public String defangIPaddr(String address) {

        return address.replace( "." , "[.]" );
    }
}