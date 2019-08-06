import java.util.ArrayList;


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
    ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> nums = new ArrayList();
        ArrayList<TreeNode>  tn = new ArrayList();
        
        if(pRoot ==null){
            return nums;
        }
        
        tn.add(pRoot);
        while(tn.size()>0){
            ArrayList<Integer> num = new ArrayList();
            ArrayList<TreeNode>  tmp = new ArrayList();
            for(int i=0;i<tn.size();i++){
                TreeNode t = tn.get(i);
                num.add(t.val);
                if(t.left != null)
                    tmp.add(t.left);
                if(t.right!=null){
                    tmp.add(t.right);
                }
            }
            tn.clear();
            tn.addAll(tmp);
            nums.add(num);
        }
        return nums;
    }
    
}