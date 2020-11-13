import java.util.List;

public class leetcode23 {



    class Solution {
        public List<Integer> postorder(Node root) {

            return null;
        }
    }


    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
}
