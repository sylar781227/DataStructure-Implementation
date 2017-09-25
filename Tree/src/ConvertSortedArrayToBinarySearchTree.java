/*
Problem Statement :
Given an array where elements are sorted in ascending order, convert it to a height balanced BST
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {

        if(nums.length==0)
            return null;
        int low=0;
        int high=nums.length-1;
        TreeNode root=addNode(nums,low,high);
        return root;

    }

    public TreeNode addNode(int [] nums,int low,int high)
    {
        if(low>high)
        {
            return null;
        }
        int mid=(high+low)/2;
        TreeNode node= new TreeNode(nums[mid]);
        node.left=addNode(nums,low,mid-1);
        node.right=addNode(nums,mid+1,high);
        return node;

    }


}
