import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Problem Statement :
Given a binary tree, return the zigzag level order traversal of its nodes' values.
(ie, from left to right, then right to left for the next level and alternate between).

Input:
    3
   / \
  9  20
    /  \
   15   7
Output:
[
  [3],
  [20,9],
  [15,7]
]

 */
public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        if(root==null)
            return finalList;
        List<Integer> res= new ArrayList<Integer>();
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();

        s1.push(null);
        s2.push(null);
        s1.push(root);


        while(!s1.isEmpty())
        {
            if(s1.peek()!=null)
            {
                res= new ArrayList<Integer>();
                while(s1.peek()!=null)
                {
                    TreeNode temp= s1.pop();
                    if(temp.left!=null)
                        s2.push(temp.left);
                    if(temp.right!=null)
                        s2.push(temp.right);
                    res.add(temp.val);
                }
                finalList.add(res);

            }
            if(s2.peek()!=null)
            {
                res= new ArrayList<Integer>();
                while(s2.peek()!=null)
                {
                    TreeNode temp=s2.pop();
                    if(temp.right!=null)
                        s1.push(temp.right);
                    if(temp.left!=null)
                        s1.push(temp.left);

                    res.add(temp.val);
                }
                finalList.add(res);
            }

            if(s1.peek()==null && s2.peek()==null)
            {
                break;
            }

        }
        return finalList;
    }
}
