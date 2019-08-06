/*
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
    int index=0;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null){
            return null;
        }
        TreeNode t = KthNode(pRoot.left,k);
        if(t!=null){
            return t;
        }
        index++;
        if(index==k){
            return pRoot;
        }
        t=KthNode(pRoot.right,k);
        if(t!=null){
            return t;
        }
        return null;
    }


}