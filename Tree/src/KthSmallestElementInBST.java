/*
Problem Statement :Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.

 */

public class KthSmallestElementInBST {
    int result=-1;
    int val=0;
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)
            return result;

        kthSmallest(root.left,k);
        val++;
        if(val==k)
            result=root.val;
        kthSmallest(root.right,k);

        return result;

    }

}
