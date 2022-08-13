package Arrays;

public class InvertBinaryTree {

       public TreeNode invertTree(TreeNode node){
           if (node==null){
               return node;
           }

           TreeNode left = invertTree(node.left);
           TreeNode right = invertTree(node.right);

           //swap
           node.left = right;
           node.right=left;

           return node;

       }
}
