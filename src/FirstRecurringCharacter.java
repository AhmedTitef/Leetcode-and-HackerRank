import java.util.ArrayList;
import java.util.HashSet;

public class FirstRecurringCharacter {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>(  );// we could use array list of hashset but ArrayList allows duplicate values in its collection. On other hand duplicate elements are not allowed in Hashset.
        int [] array = new int []{2,3,5,2,3,5,1,2,4};
        HashSet<Integer> hashSet = new HashSet<>(  );
        for (int i = 0 ; i < array.length ; i++){
            if(arrayList.contains( array[i] )){
                System.out.println(array[i]);
                break;
            }
            else {
                arrayList.add( array[i] );
            }

        }
    }



}
