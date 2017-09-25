import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Problem Statement:
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

Input :
    3
   / \
  9  20
    /  \
   15   7


 Output:
[
  [3],
  [9,20],
  [15,7]
]
 */
public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> finalList= new ArrayList<>();

        if(root==null)
            return finalList;
        List<Integer> res= new ArrayList();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);


        while(!q.isEmpty())
        {
            TreeNode temp= q.poll();


            if(temp==null)
            {
                finalList.add(res);
                //res.clear();
                res=new ArrayList<>();
                if(q.isEmpty())
                    break;
                q.offer(null);
            }
            else
            {
                res.add(temp.val);
                if(temp.left!=null)
                {
                    q.offer(temp.left);
                }
                if(temp.right!=null)
                {
                    q.offer(temp.right);
                }
            }
        }
        return finalList;

    }
}
