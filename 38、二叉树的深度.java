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
    public int TreeDepth(TreeNode root) {
        int deep = 0;
        if(root==null){
            return deep;
        }
        deep++;
        int leftDeep = TreeDepth(root.left);
        int rightDeep= TreeDepth(root.right);
        return deep+Math.max(leftDeep,rightDeep);
    }
}