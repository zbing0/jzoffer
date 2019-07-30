/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0){
            return null;
        }
        int val = pre[0];
        TreeNode rootNode = new TreeNode(val);
        List<Integer> leftIn = new ArrayList();
        List<Integer> rightIn = new ArrayList();
        List<Integer> leftPre = new ArrayList();
        List<Integer> rightPre = new ArrayList();
        int i=0;
        for(;i<in.length;i++){
            if(in[i]==val){
                break;
            }
            leftIn.add(in[i]);
            leftPre.add(pre[i+1]);
        }
        i++;
        for(;i<in.length;i++){
            rightIn.add(in[i]);
            rightPre.add(pre[i]);
        }
        rootNode.left = reConstructBinaryTree(leftPre.stream().mapToInt(Integer::valueOf).toArray(),leftIn.stream().mapToInt(Integer::valueOf).toArray());
        rootNode.right = reConstructBinaryTree(rightPre.stream().mapToInt(Integer::valueOf).toArray(),rightIn.stream().mapToInt(Integer::valueOf).toArray());
        return rootNode;
    }
}