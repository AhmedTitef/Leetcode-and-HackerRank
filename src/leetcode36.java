public class leetcode36 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
//        System.out.println( solution36.removeElements() );
    }
}

class Solution36 {
    public ListNode removeElements(ListNode head, int val) {


        while (head != null && head.val == val) { //example like [1,1,1,5] and val is 1, so keep deleting all the 1's by moving pointer to next and next to get garabage collected
            head = head.next;
        }
        ListNode currentNode = head;
        while (currentNode != null && currentNode.next != null) {
            if (currentNode.next.val == val) {
                currentNode.next = currentNode.next.next;

            } else {
                currentNode = currentNode.next;
            }
        }


        return head;
    }


}

//  Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
