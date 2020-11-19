import java.util.Stack;

public class leetcode32 {
    public static void main(String[] args) {

    }
}
class Solution32{
    public int rangeSumBST(TreeNode root, int low, int high) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int count= 0 ;
        while (root!=null || !stack.isEmpty()){
            while (root!= null){
                stack.push( root );

                root = root.left;


            }

            root = stack.pop();
            if (root.val >= low && root.val <= high ){
                count = count + root.val;
            }
            root = root.right;



        }
        return count;

    }
}
 class TreeNode {
     int val;
     TreeNode left;TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }