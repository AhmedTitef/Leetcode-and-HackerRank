public class QeuewithLinkedLists {

    Node first;
    Node last;
    int length;

    QeuewithLinkedLists(){
        first = null;
        last = null;
        length = 0;
    }

    public static void main(String[] args) {

        QeuewithLinkedLists qeuewithLinkedLists = new QeuewithLinkedLists();
        qeuewithLinkedLists.enqueue( "Ahmed" );
        qeuewithLinkedLists.enqueue( "Zeyad" );
        qeuewithLinkedLists.enqueue( "Karim" );
        System.out.println(qeuewithLinkedLists.peek());
        System.out.println(qeuewithLinkedLists.length);
        qeuewithLinkedLists.dequeue(); qeuewithLinkedLists.dequeue(); 
        System.out.println(qeuewithLinkedLists.length);
        System.out.println(qeuewithLinkedLists.peek());

    }

    Object peek(){

       return first.value;

    }

    void enqueue(Object value){
        Node newNode = new Node( value );
        if (length == 0){
            first = newNode;
            last = newNode;

        }else {
            last.next = newNode;
            last = newNode;

        }

        length ++;
    }

    void dequeue(){

        if (length == 0){
            System.out.println("nothing to dequeue");

        }else {
            Node temp = first.next;
            first.next = null;
            first = temp;


        }

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
