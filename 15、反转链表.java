/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode p=head;
        ListNode q=head.next;
        p.next=null;
        ListNode k = q.next;
        while(k!=null){
            q.next=p;
            p=q;
            q=k;
            k=k.next;
        }
        q.next=p;
        p=q;
        return p;
    }
}