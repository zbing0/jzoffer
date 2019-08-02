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
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if(root == null){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> dataList = new ArrayList();
        ArrayList<TreeNode> queueList = new ArrayList();
        queueList.add(root);
        
        while(queueList.size()>0){
            TreeNode tn = queueList.get(0);
            if(tn==null){
                queueList.remove(tn);
                continue;
            }
            queueList.add(tn.left);
            queueList.add(tn.right);
            queueList.remove(tn);
            dataList.add(tn.val);
        }
       return dataList;
    }
}