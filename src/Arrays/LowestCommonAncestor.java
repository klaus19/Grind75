package Arrays;

//Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.
//
//According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the l
// owest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

public class LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root == null || (p.val <= root.val && q.val >= root.val) || (p.val >= root.val && q.val <= root.val))
            return root;
        else if(root.val >= p.val)
            return lowestCommonAncestor(root.left, p, q);
        else
            return lowestCommonAncestor(root.right, p, q);
    }
}
