import java.util.ArrayList;
import java.util.Stack;

public class leetcode34 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();

    }
}


class Solution34 {
    public TreeNode1 increasingBST(TreeNode1 root) {

        Stack<TreeNode1> stack = new Stack<>();
        ArrayList<Integer> arrayList = new ArrayList<>(  );
        while (root != null || !stack.isEmpty() ){
            while (root!=null){
                stack.push( root );
                root = root.left;

            }
            root = stack.pop();
            arrayList.add( root.val );
            root =root.right;

        }

        TreeNode1 treeNode1 = new TreeNode1( arrayList.get( 0 ) );
        for (int value : arrayList){

            treeNode1.right = new TreeNode1( value );
            treeNode1 = treeNode1.right;


        }

        return treeNode1;
    }
}
 class TreeNode1 {
     int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }


  }