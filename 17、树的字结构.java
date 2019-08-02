/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null){
            return false;
        }
        if(root1.val==root2.val){
            if(equal_tree(root1,root2)){
               return true;
            }
        }
        return HasSubtree(root1.left,root2)||HasSubtree(root1.right,root2);
    }
    
    boolean equal_tree(TreeNode r1,TreeNode r2){
        if(r2==null){
            return true;
        }
        if(r1==null){
            return false;
        }
        if(r1.val != r2.val){
            return false;
        }
        return equal_tree(r1.left,r2.left) && equal_tree(r1.right,r2.right);
    }
}