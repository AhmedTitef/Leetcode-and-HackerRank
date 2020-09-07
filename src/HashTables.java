
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class HashTables {


    public static void main(String[] args) {
        HashTables hashTables = new HashTables( 50 );
        hashTables.set( "grapes", 1000 );
        hashTables.set( "apples", 121 );
        hashTables.set( "apples", 1213 );
        hashTables.set( "apples", 1211 );
        hashTables.set( "apples", 1251 );
        System.out.println( "value : " + hashTables.get( "apples" ) );
        System.out.println(hashTables.getAllKeys());

    }

    ArrayList<KeyValue>[] arrayList;

    HashTables(int size) {
        arrayList = new ArrayList[size];
//        array = new Object[size];


    }

    private int _hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.codePointAt( i ) * i) % arrayList.length;
        }
        return hash;
    }




    private void set(String key, int value) {

        ArrayList<KeyValue> smallerArray = new ArrayList<>();


        int address = _hash( key );


        if (arrayList[address] == null) {
            KeyValue pair = new KeyValue( key, value );
            smallerArray.add( pair );
            arrayList[address] = smallerArray;
        } else {
            KeyValue pair = new KeyValue( key, value );
            arrayList[address].add( pair );
        }


//        if (arrayList[address] !=null){
//            arrayList[address].add( pair );
//        }


    }

    private ArrayList<Integer> get(String key) {

        int address = _hash( key );
        ArrayList<Integer> values = new ArrayList<>(  );

        if (arrayList[address] != null) {
            for (int i = 0; i < arrayList[address].size(); i++) {
                if (arrayList[address].get( i ).getKey().equals( key )) {
                    values.add( arrayList[address].get( i ).getValue() );

                }

            }
            return values;
        }


        return null;
    }

    private ArrayList<String> getAllKeys (){

        ArrayList<String> keys = new ArrayList<>(  );

        for (int i = 0 ; i < arrayList.length ; i++){
            if (arrayList[i] != null){
                for (int j = 0 ; j < arrayList[i].size() ; j++){
                    keys.add( arrayList[i].get( j ).getKey() );
                }

//                keys.add( arrayList[i]. )
            }

        }

        return keys;
    }
}



class KeyValue {
    private String key;
    private int value;

    public KeyValue(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
