/*
Problem Statement : Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
“The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants
(where we allow a node to be a descendant of itself).”

        _______6______
       /              \
    ___2__          ___8__
   /      \        /      \
   0      _4       7       9
         /  \
         3   5

The lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2
 */


public class LowestCommonAncestorOfBinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if(root==null)
            return null;
        if(root.val==p.val || root.val==q.val)
            return root;



        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);


        if(left==null && right==null)
            return null;
        if(left!=null && right!=null)
            return root;


        return left==null?right:left;


    }
}
