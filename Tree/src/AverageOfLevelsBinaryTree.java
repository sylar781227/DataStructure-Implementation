import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Problem Statement:
Given a non-empty binary tree, return the average value of the nodes on each level in the form of an array.

Input:
    3
   / \
  9  20
    /  \
   15   7
Output: [3, 14.5, 11]
 */
public class AverageOfLevelsBinaryTree {

    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        List<Double> list= new ArrayList<Double>();
        if(root==null)
            return list;
        int count=0;
        Double sum= new Double(0);
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            TreeNode temp= q.poll();
            if(temp==null)
            {
                list.add(sum/count);
                if(q.isEmpty())
                {
                    break;
                }
                sum=0.0;
                count=0;
                q.offer(null);
            }
            else
            {
                sum=sum+temp.val;
                count++;
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }

        }
        return list;
    }
}
