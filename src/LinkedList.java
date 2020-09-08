import java.util.ArrayList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    LinkedList(int value) {
        head = new Node( value );
        tail = head;
        length = 1;
    }


    public static void main(String[] args) {


        LinkedList linkedList = new LinkedList( 10 );
        linkedList.append( 4 );
        linkedList.append( 5 );
//        linkedList.insert( 3, 7 );
        System.out.println( linkedList.printList() );
        System.out.println(linkedList.head.value);
       ;
        System.out.println(  linkedList.reverse( linkedList ).printList() );


    }

    public LinkedList reverse(LinkedList linkedList) {
        LinkedList newList = new LinkedList(linkedList.head.value);
        Node current = linkedList.head;
        while (current.next != null) {
            current = current.next;
            Node newNode = new Node(current.value);
            newNode.next = newList.head;
            newList.head = newNode;
            newList.length++;
        }
        return newList;
    }

    ArrayList<Integer> printList() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Node currentNode = head;
        while (currentNode != null) {
            arrayList.add( currentNode.value );
            currentNode = currentNode.next;
        }
        return arrayList;
    }

    void insert(int index, int value) {

        if (index < 0 || index > length) {
            System.err.println( "Index Out Of Bounds For Length " + length );
        } else if (index == 0) {
            prepend( value );
        } else if (index == length) {
            append( value );
        } else {
            Node currentNode = head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node( value );
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            length++;
        }


    }


    // if no one is pointing to an element, it gets deleted. doesnt matter what the element is pointing to

    void remove(int index) {

        if (index == 0) {
            //delete first ones
            head = head.next;

            length--;
        } else {
            int i;
            Node currentNode = head;
            for (i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;

            length--;
            //assigning current node to be tail if condition is met
            if (i == length - 1) {
                tail = currentNode;
            }


        }


    }

    void prepend(int value) {
        Node newNode = new Node( value );
        newNode.next = head;
        head = newNode;
        length++;
    }

    void append(int value) { //adds element at the end after tail
        Node newNode = new Node( value );
        tail.next = newNode;
        tail = newNode; // this changes the tail from previous value to that "newNode" . so "newNode" is the new tail now;
        length++;


    }


    static class Node {
        int value;
        Node next;
        Node previous;

        Node(int value) {


            this.value = value;
            this.next = null;
            this.previous = null;



        }
    }
}
