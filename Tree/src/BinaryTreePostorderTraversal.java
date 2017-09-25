import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Problem Statement : Given a binary tree, return the postorder traversal of its nodes' values.
 */
public class BinaryTreePostorderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {

        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        List<Integer> result= new ArrayList<Integer>();
        if(root==null)
            return result;

        s1.push(root);
        while(!s1.isEmpty()){
            TreeNode temp= s1.pop();
            s2.push(temp);

            if(temp.left!=null)
                s1.push(temp.left);
            if(temp.right!=null)
                s1.push(temp.right);
        }
        while(!s2.isEmpty()){
            TreeNode temp= s2.pop();
            result.add(temp.val);
        }

        return result;
    }
}
