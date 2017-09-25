import java.util.*;

/*
Problem Statement : Given a binary tree, return the bottom-up level order traversal of its nodes' values.
 (ie, from left to right, level by level from leaf to root).

Input:
    3
   / \
  9  20
    /  \
   15   7

Output :
[
  [15,7],
  [9,20],
  [3]
]

 */
public class BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> q= new LinkedList<TreeNode>();
        Stack<Integer> s= new Stack<Integer>();
        List<List<Integer>> res= new ArrayList<List<Integer>>();
        if(root==null)
            return res;
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            TreeNode temp=q.poll();
            if(temp==null)
            {
                if(q.isEmpty())
                    break;
                s.push(null);
                q.offer(null);
            }
            else
            {
                s.push(temp.val);
                if(temp.right!=null)
                    q.offer(temp.right);
                if(temp.left!=null)
                    q.offer(temp.left);

            }

        }
        List<Integer> tempRes= new ArrayList<Integer>();
        while(!s.isEmpty())
        {

            Integer temp=s.pop();
            if(temp!=null)
                tempRes.add(temp);
            if(temp==null)
            {
                res.add(tempRes);
                tempRes=new ArrayList<Integer>();
            }
        }
        res.add(tempRes);
        return res;
    }
}
