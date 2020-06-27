import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//The first line contains an integer,  (the initial number of elements in ).
//        The second line contains  space-separated integers describing .
//        The third line contains an integer,  (the number of queries).
//        The  subsequent lines describe the queries, and each query is described over two lines:
//        If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
//        If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
//        Constraints
//
//
//        Each element in is a 32-bit integer.
//        Output Format
//        Print the updated list  as a single line of space-separated integers.
public class JavaList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int sizeOFInput = scanner.nextInt();
        ArrayList<Integer> elements = new ArrayList<>();

        for (int i = 0; i < sizeOFInput; i++) {
            elements.add( scanner.nextInt() );
        }
        int noOFqueries = scanner.nextInt();
        for (int i = 1; i <= noOFqueries; i++) {

            scanner.nextLine();
            String insertORdelete = scanner.nextLine();
            if (insertORdelete.equals( "Insert" )) {
                int index = scanner.nextInt();
                int numberToInsert = scanner.nextInt();
                elements.add( index, numberToInsert );
            } else if (insertORdelete.equals( "Delete" )) {

                elements.remove( scanner.nextInt() );


            }


        }
        for (Integer num : elements) {
            System.out.print( num + " " );
        }
    }
}
