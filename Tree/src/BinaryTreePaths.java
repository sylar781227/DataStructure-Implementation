import java.util.ArrayList;
import java.util.List;

/*
Problem Statement : Given a binary tree, return all root-to-leaf paths.

   1
 /   \
2     3     ----> ["1->2->5", "1->3"]
 \
  5
 */
public class BinaryTreePaths {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res= new ArrayList<>();
        String path="";
        if(root!=null)
            res=getPath(root,path,res);
        return res;



    }
    public List<String> getPath(TreeNode root,String path, List<String> res) {

        if(root.left==null && root.right==null)
        {
            res.add(path+root.val);
        }
        if(root.left!=null)
        {
            getPath(root.left,path+root.val+"->",res);
        }
        if(root.right!=null)
        {
            getPath(root.right,path+root.val+"->",res);
        }

        return res;

    }

}
