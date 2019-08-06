/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode p1= pHead;
        ListNode p2=pHead;
        if(p1==null||p1.next==null){
            return null;
        }
        while(p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2){
                p2=pHead;
                while(p1!=p2){
                    p1=p1.next;
                    p2=p2.next;
                }
                return p1;
            }
        }
        return null;
    }
}