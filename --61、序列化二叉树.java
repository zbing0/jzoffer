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
import java.util.ArrayList;
public class Solution {
    
    String Serialize(TreeNode root) {
        String sb = "";
        if(root==null){
            sb+="#,";
            return sb;
        }
        sb+=root.val;
        sb+=",";
        sb+=Serialize(root.left);
        sb+=Serialize(root.right);
        return sb;
  }
    
    int index = -1;
    TreeNode Deserialize(String str) {
       if(str==null||str.length()==0){
           return null;
       }
       String[] cs = str.split(",");
        index++;
        if(cs[index].equals("#")){
            return null;
        }
       TreeNode tn = new TreeNode(Integer.valueOf(cs[index]));
       tn.left = Deserialize(str);
       tn.right = Deserialize(str);
        return tn;
  }
}