public class leetcode9 {

    public static void main(String[] args) {

        System.out.println(sortString( "rbt" ));
    }

    public static String sortString(String s) {




        char secondLargest = 'b';


        char [] chars = s.toCharArray();
        char [] result = new char[chars.length];

        int n = 0;
        char smallest = chars[0];
        for (int x = 0 ; x< chars.length ; x++){


            for (int i = 0 ; i< chars.length ; i++){
                if (chars[i] < smallest ){


                    smallest = chars[i];
                    result[n] = smallest;
                    n++;





                }


            }
            System.out.println(chars);
        }

//        for (int i = 0 ; i< chars.length ; i++){
//            for (int j = i+1 ; j < chars.length ; j++){
//
//                if (chars[i] < chars[j]){
//                    if (chars[i] < smallest){
//                        smallest = chars[i];
//                        result[i] = smallest;
//                    }
//
//                }else{
//                    if (chars[j] < smallest){
//                        smallest = chars[j];
//                        result[i] = smallest;
//                    }
//
//                }
//            }
//        }
        System.out.println(smallest);


        return String.valueOf( result );
    }
}
