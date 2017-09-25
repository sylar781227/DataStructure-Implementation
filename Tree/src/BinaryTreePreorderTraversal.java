/*
Problem Statement : Given a binary tree, return the Iterative pre-order traversal of its nodes' values

 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> s = new Stack<TreeNode>();

        if(root==null)
            return res;

        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp=s.pop();
            res.add(temp.val);

            if(temp.right!=null)
                s.push(temp.right);
            if(temp.left!=null)
                s.push(temp.left);

        }


        return res;
    }
}
