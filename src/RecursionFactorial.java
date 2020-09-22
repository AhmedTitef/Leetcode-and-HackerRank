public class RecursionFactorial {

    public static void main(String[] args) {

        RecursionFactorial recursionFactorial = new RecursionFactorial();
//        System.out.println(recursionFactorial.findFactorialIterative( 5 )) ;
        System.out.println(recursionFactorial.findFactorialRecursive( 5 )) ;
//
    }


    int findFactorialRecursive(int number){
        if (number == 1){
            return 1;
        }
        else {


            return number * findFactorialRecursive( number - 1 );
        }

    }
    int  findFactorialIterative(int number){
        int answer = 1;
                for (int i = number ; i >= 1 ; i --){
                    answer = answer * i ;
                }
        return answer;
    }
}
