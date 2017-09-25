/*
Problem Statement :
Given a binary tree, return the inorder traversal of its nodes' values.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<TreeNode>();
        List<Integer> result= new ArrayList<Integer>();

        while(true){
            if(root!=null){
                s.push(root);
                root=root.left;
            }
            else {
                if(s.isEmpty())
                    break;
                root=s.pop();
                result.add(root.val);
                root=root.right;
            }
        }
        return result;
    }

}

