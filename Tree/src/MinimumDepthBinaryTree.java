/*
Problem Statement:
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node


 */
public class MinimumDepthBinaryTree {

    public int minDepth(TreeNode root) {

        if(root==null)
            return 0;
        int l=0;
        int r=0;
        if(root.left==null && root.right==null)
            return 1;
        if(root.left!=null)
            l= minDepth(root.left);
        if(root.right!=null)
            r= minDepth(root.right);

        return (l == 0 || r == 0) ? l + r + 1:1+Math.min(l,r);

    }

}
