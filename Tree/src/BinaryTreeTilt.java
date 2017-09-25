/*
Problem Statement:
iven a binary tree, return the tilt of the whole tree.

The tilt of a tree node is defined as the absolute difference between the sum of all left subtree node values and
 the sum of all right subtree node values. Null node has tilt 0.
 */

public class BinaryTreeTilt {

    int tilt=0;
    public int findTilt(TreeNode root) {
        helper(root);
        return tilt;


    }

    public int helper(TreeNode root){
        if(root==null)
            return 0;
        int left=helper(root.left);
        int right=helper(root.right);

        tilt=tilt+Math.abs(left-right);

        return left+right+root.val;
    }

}
