/*
Problem Statement : Given a binary tree, find the maximum path sum.

       1
      / \
     2   3
Return 6.
 */
public class BinaryTreeMaximumPathSum {
    int max=Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

        findMax(root);

        return max;

    }

    public int findMax(TreeNode root)
    {
        if(root==null)
            return 0;

        int left=Math.max(0,findMax(root.left));
        int right=Math.max(0,findMax(root.right));
        if(left+right+root.val > max)
        {
            max=left+right+root.val;
        }
        return Math.max(left,right)+root.val;

    }


}
