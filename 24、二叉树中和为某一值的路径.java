import java.util.ArrayList;
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
    ArrayList<ArrayList<Integer>> paths = new ArrayList();
    ArrayList<Integer> path = new ArrayList();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null){
            return paths;
        }
        path.add(root.val);
        target-=root.val;
        if(target==0&& root.left==null && root.right==null){
            paths.add(new ArrayList<Integer>(path));
        }
        FindPath(root.left,target);
        FindPath(root.right,target);
        path.remove(path.size()-1);
        return paths;
    }
}