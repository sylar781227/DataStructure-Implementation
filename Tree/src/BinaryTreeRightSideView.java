import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Problem Statement : Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---

  return [1, 3, 4]

 */
public class BinaryTreeRightSideView {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list= new ArrayList<Integer>();
        if(root==null)
            return list;
        Queue<TreeNode> q= new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            TreeNode temp= q.poll();
            if(temp==null)
            {
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.offer(null);
                }

            }
            else
            {
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            if(q.peek()==null)
            {
                list.add(temp.val);
            }

        }
        return list;
    }
}
