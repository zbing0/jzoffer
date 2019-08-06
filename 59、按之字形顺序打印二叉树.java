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
    
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<TreeNode> ln=new ArrayList();
        ArrayList<TreeNode> seq = new ArrayList();
        ArrayList<ArrayList<Integer> >  nums=new ArrayList();
        
        if(pRoot==null){
            return nums;
        }
        boolean left=true;
        ln.add(pRoot);
        while(ln.size()>0){
            ArrayList<Integer> num = new ArrayList();
            for(int i=0;i<ln.size();i++){
                TreeNode tmp = ln.get(i);
                num.add(tmp.val);
                if(ln.get(i).left!=null){
                    seq.add(ln.get(i).left);
                }
                if(ln.get(i).right!=null){
                    seq.add(ln.get(i).right);
                }
            }
            ln.clear();
            ln.addAll(seq);
            seq.clear();
            if(left){
                 nums.add(num);
            }else{
                ArrayList<Integer> num2 = new ArrayList();
                for(int i=num.size()-1;i>=0;i--){
                    num2.add(num.get(i));
                }
                nums.add(num2);
            }
            left=!left;
        }
        return nums;
    }
   
}