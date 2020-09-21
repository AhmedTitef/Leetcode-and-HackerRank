import java.util.ArrayList;

public class StackswithArrays {

    ArrayList arrayList ;
    Object top = null;
    Object bottom = null;
    int length = 0;




    public static void main(String[] args) {


    }

    Object peek(){
       return arrayList.get( arrayList.size()-1 );
    }

    void push(Object value){

        arrayList.add( value );

    }

    void pop(){
        arrayList.remove( arrayList.size()-1 );
    }
}
