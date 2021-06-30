package pureStorage;

import java.util.*;

public class Result {

    public static void main(String[] args) {


        find_doubles_in_list();
    }


    public static void find_doubles_in_list() {

        List<Integer> values = Arrays.asList( 1,1,2);

        ArrayList<Integer> duplicates = new ArrayList<>();

        Collections.sort( values );
        HashSet<Integer> result = new HashSet<>( values ); //remove duplicates
        ArrayList<Integer> resultPlus = new ArrayList<>( result ); //convert it back to array

        ArrayList<Integer> resultArray = new ArrayList<>(); //answer




//        for (int i = 0 ; i< values.size() ; i++){
//
//
//            for (int  j = 0 ; j <values.size() -1 ; j++){
//
//                if ((values.get( i ) * 2 == values.get( j ) ) && (values.get( j ) != values.get( j+1 ))){
//                    System.out.println(values.get( j ));
//                    System.out.println(values.get( j+1 ));
//                        resultArray.add( values.get( i ) );
//
//                }else{
//
//                }
//            }
//
//        }



        for (int i = 0; i < values.size(); i++) {

            for (int j = i + 1; j < values.size(); j++) {
                if (values.get( i ).equals( values.get( j ) )) {
                    duplicates.add( values.get( i ) );
                }
            }
        }


        for (int i = 0; i < duplicates.size(); i++) {
            for (int j = 0; j < resultPlus.size(); j++) {

                if ((duplicates.get( i ) != (resultPlus.get( j ) * 2) ) && resultPlus.contains( (j * 2) )) { //6 ==
                    resultArray.add( resultPlus.get( j ) );

                }


//                if (((values.get( j ))*2) != ( duplicates.get( i ) )){
//
//                }
            }
        }

        System.out.println( duplicates );
        System.out.println(resultPlus);

        System.out.println( resultArray );
    }
}
