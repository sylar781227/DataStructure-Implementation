/*
Problem Statement :
Given a binary tree, determine if it is height-balanced.
For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1
 */

public class BalancedBinaryTree {
    boolean flag=true;
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;

        int val= height(root);

        return flag;

    }

    public int height(TreeNode root)
    {
        if(root==null)
            return 0;

        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(Math.abs(leftHeight-rightHeight)> 1)
        {
            flag=false;
        }
        return Math.max(leftHeight,rightHeight)+1;
    }


}
