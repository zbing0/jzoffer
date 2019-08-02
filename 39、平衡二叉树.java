public class Solution {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        int deepM = Math.abs(getDeep(root.left)-getDeep(root.right));
        if(deepM>1){
            return false;
        }
        boolean isB=true;
        isB = IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
        return isB;
    }
    
    int getDeep(TreeNode root){
        int deep=0;
        if(root==null){
            return deep;
        }
        return deep+Math.max(getDeep(root.left),getDeep(root.right))+1;
        
    }
}