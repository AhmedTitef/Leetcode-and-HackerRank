import java.util.ArrayList;

public class RecursionFibonacci {

    public static void main(String[] args) {
        RecursionFibonacci recursionFibonacci = new RecursionFibonacci();

//        System.out.println( recursionFibonacci.fibonacciIterative( 12 ) );
        System.out.println( recursionFibonacci.fibonacciRecursive( 4 ) );
    }

    int fibonacciIterative(int number) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add( 0 );
        arrayList.add( 1 );

        int answer = 0;
        for (int i = 1; i < number; i++) {
            answer = arrayList.get( i - 1 ) + arrayList.get( i );
            arrayList.add( answer );
        }
        return answer;
    }

    int  fibonacciRecursive(int number) {

//        System.out.println(number);
        if (number <2){
            return number;
        }

        return fibonacciRecursive( number - 1 ) + fibonacciRecursive( number - 2 );

    }
}
