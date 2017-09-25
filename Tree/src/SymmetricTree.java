/*
Problem Statement : Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
    1
   / \
  2   2        -> Symmetric
 / \ / \
3  4 4  3

    1
   / \
  2   2        -> Not Symmetric
   \   \
   3    3
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;

        return helper(root.left,root.right);

    }
    public boolean helper(TreeNode t1, TreeNode t2){
        if(t1==null && t2==null)
            return true;
        if(t1==null || t2==null)
            return false;

        return t1.val==t2.val && helper(t1.left,t2.right) && helper(t1.right,t2.left);
    }
}
