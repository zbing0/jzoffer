/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null || k<1){
            return null;
        }
        ListNode p = head;
        ListNode pk=head;
        for(int i=0;i<k-1;i++){
            if(pk.next!=null){
                pk=pk.next;
            }else{
                return null;
            }
        }
        pk=pk.next;
        while(pk!=null){
            p=p.next;
            pk=pk.next;
        }
        return p;
    }
}