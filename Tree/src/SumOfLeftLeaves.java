/*
Problem Statement :
Find the sum of all left leaves in a given binary tree.

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24

 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode root) {

        if(root==null)
        {
            return 0;
        }
        int sum=0;
        if(root.left!=null)
        {
            if(root.left.left==null && root.left.right==null)
            {
                sum=sum+root.left.val;
            }

        }
        sum=sum+sumOfLeftLeaves(root.left);
        sum=sum+sumOfLeftLeaves(root.right);

        return sum;


    }
}
