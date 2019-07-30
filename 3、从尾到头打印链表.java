/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> seqList  = new ArrayList();
        while(listNode!=null){
            seqList.add(listNode.val);
            listNode = listNode.next;
        }
         ArrayList<Integer> newList  = new ArrayList();
        for(int i=seqList.size()-1;i>=0;i--){
            newList.add(seqList.get(i));
        }
        return newList;
    }
}