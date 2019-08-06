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
    TreeNode p=null;
    TreeNode lastLeft=null;
    
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        Convert(pRootOfTree.left);
        pRootOfTree.left = p;
        if(p!=null){
            p.right=pRootOfTree;
        }
        if(lastLeft==null){
            lastLeft = pRootOfTree;
        }
        p=pRootOfTree;
        Convert(pRootOfTree.right);
        return lastLeft;
    }
}