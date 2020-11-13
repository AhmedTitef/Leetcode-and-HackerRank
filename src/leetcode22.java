public class leetcode22 {


    public static void main(String[] args) {
        leetcode22 leetcode22 = new leetcode22();
//        leetcode22.searchBST( new TreeNode( 0 ) );
    }

     class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }


        public TreeNode searchBST(TreeNode root, int val) {
            TreeNode currentNode = root;

             while (true){
                 if (val < currentNode.val){
                   currentNode = currentNode.left;

                 }else if (val > currentNode.val){
                     currentNode = currentNode.right;


                 }else if (val  == currentNode.val){
                     return currentNode;
                 }
                 else {
                     return null;
                 }


         }





    }

}
