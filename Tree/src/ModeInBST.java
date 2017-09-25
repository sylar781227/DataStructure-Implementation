// Given a binary search tree (BST) with duplicates, find all the mode(s) (the most frequently occurred element) in the given BST.

import java.util.ArrayList;
import java.util.List;

public class ModeInBST {

    int maxCount=1;
    List<Integer> list = new ArrayList<Integer>();
    int prevValue=Integer.MIN_VALUE;
    int currCount=1;
    public int[] findMode(TreeNode root) {
        helper(root);
        int [] result= new int[list.size()];
        for(int i=0; i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }

    void helper(TreeNode root)
    {
        if(root == null)
            return;

        helper(root.left);

        if(prevValue==root.val)
            currCount++;
        else
            currCount=1;

        if(currCount==maxCount){
            list.add(root.val);
        }
        if(currCount>maxCount){
            list.clear();
            list.add(root.val);
            maxCount=currCount;
        }



        prevValue=root.val;
        helper(root.right);
    }
}
