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
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode p = pHead;
        ListNode lastNode = null;
        ListNode head=null;
        
        while(p!=null && p.next!=null){
            if(p.val==p.next.val){
                int val=p.val;
                while(p!=null && p.val==val){
                    p=p.next;
                }
                
            }else{
                if(head==null){
                    head=p;
                    lastNode=p;
                    p=p.next;
                }else{
                    lastNode.next=p;
                    lastNode=lastNode.next;
                    p=p.next;
                }
            }
        }
        
        if(p!=null){
            if(head==null){
                head=p;
            }else{
                lastNode.next=p;
            }
        }else{
            if(lastNode!=null){
                lastNode.next=null;
            }
        }
        return head;
    }
}






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
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode p = pHead;
        ListNode head=new ListNode(-1);
        ListNode lastNode = head;
        head.next=pHead;
        
        while(p!=null && p.next!=null){
            if(p.val==p.next.val){
                int val=p.val;
                while( p!=null && p.val==val){
                    p=p.next;
                }
                lastNode.next=p;
            }else{
                    lastNode=p;
                    p=p.next;
            }
        }
        return head.next;
    }
}