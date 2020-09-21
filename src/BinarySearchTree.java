public class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert( 1 );
        binarySearchTree.insert( 3 );
        binarySearchTree.insert( 0 );
        System.out.println( binarySearchTree.root.left.value );
        System.out.println( binarySearchTree.lookup( 13 ) );

    }


    void insert(int value) {
        Node newNode = new Node( value );
        if (root == null) {
            root = newNode;

        } else {
            Node currentNode = root;
            while (true) {
                if (value < currentNode.value) {
                    //left
                    if (currentNode.left == null) { //if left node is empty then insert it there right away
                        currentNode.left = newNode;
                        break;
                    } else { // if not, then keep moving
                        currentNode = currentNode.left;
                    }
                } else if (value > currentNode.value) {
                    //right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    } else { // if not, then keep moving
                        currentNode = currentNode.right;
                    }
                }
            }


        }

    }

    boolean lookup(int value) {
        if (root == null) {
            return false;
        }
        Node currentNode = root;
        while (currentNode != null) {
            if (value == currentNode.value) {
                return true;
            } else if (value > currentNode.value) {
                //right
                currentNode = currentNode.right;

            } else if (value < currentNode.value) {
                currentNode = currentNode.left;
            }
        }

        return false;

    }


    void transverse(Node node) {

    }
}

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;

    }


}