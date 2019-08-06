/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead==null){
            return null;
        }
        RandomListNode p = pHead;
        while(p!=null){
            RandomListNode current = new RandomListNode(p.label);
            current.next = p.next;
            p.next = current;
            p = current.next;
        }
        
        p=pHead;
        while(p!=null){
            if(p.random!=null){
                p.next.random = p.random.next;
            }
            p=p.next.next;
        }
        
        p=pHead;
        RandomListNode head = pHead.next;
        RandomListNode tmp;
        while(p.next!=null){
            tmp=p.next;
            p.next = tmp.next;
            p=tmp;
        }
        
        return head;
    }
}