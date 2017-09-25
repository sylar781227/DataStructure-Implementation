/*
Problem Statement : Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL


Input :
        1
       /  \
      2    3
     / \  / \
    4  5  6  7

Output:

        1 -> NULL
       /  \
      2 -> 3 -> NULL
     / \  / \
    4->5->6->7 -> NULL
 */

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode {

    public void connect(TreeLinkNode root) {
        if(root==null)
            return;
        Queue<TreeLinkNode> q= new LinkedList<TreeLinkNode>();
        q.offer(root);
        q.offer(null);
        while(!q.isEmpty())
        {
            TreeLinkNode temp= q.poll();
            if(temp==null)
            {
                if(q.isEmpty())
                    break;
                q.offer(null);

            }
            else
            {
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
                temp.next=q.peek();
            }
        }

    }
}
