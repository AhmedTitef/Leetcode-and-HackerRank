public class StacksWithLinkedLists {
    Node top;
    Node bottom;
    int length = 0;

    StacksWithLinkedLists() {
        this.top = null;
        this.bottom = null;
    }


    public static void main(String[] args) {

        StacksWithLinkedLists stacks = new StacksWithLinkedLists();
        stacks.push( "Ahmed" );
        stacks.push( "sadsda" );
        stacks.push( "dsadasad" );

        System.out.println(stacks.length);

    }

    Object peek(){

        return top;
    }

    void push(Object value){

        //google(top

        //udemy(top) => google

        //discord(top => udemy => google
// discord(top) -> udemy -> google
        Node newNode = new Node( value );
        if (length == 0){
            top = newNode;
            bottom = newNode;
        }else {
            top.next = newNode;
            top = newNode;



        }
        length ++;


    }

    void pop(){
        // discord(top) -> udemy -> google

        //udemy(top) -> google

        if(length == 0){
            bottom =null;
        }
        top = top.next;
        length --;

    }

    class Node {
        Object value;
        Node next;

        Node(Object value) {
            this.value = value;
            this.next = null;
        }
    }
}
