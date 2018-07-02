import java.util.*;
/**
 * Created by c84104080 on 2018/7/2.
 */
class Solution59 {
    public ListNode deleteDuplication1(ListNode pHead)
    {
        if (pHead == null || pHead.next==null){return pHead;}
        ListNode p = pHead;
        ListNode first = new ListNode(0);
        ListNode q =first;
        int val=0;
        while(p!=null) {
            while (p.next != null && p.val == p.next.val ) {
                p = p.next;
            }

            if (p.next != null) {
                ListNode node = new ListNode(p.next.val);
                q.next = node;
                q=q.next;
                p = p.next;
            }
            else{ return first.next; }
        }


        return first.next;
    }

    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode first = new ListNode(-1);
        first.next = pHead;
        ListNode last = first;
        ListNode p = pHead;

        while(p!=null&&p.next!=null){
            if(p.val==p.next.val){
                int val = p.val;
                while(p!=null&&p.val==val){
                    p = p.next;
                    last.next = p;
                }
            }else{
                last = p;
                p = p.next;
            }
        }

        return first.next;
    }

}
public class deleteDuplication59 {
    public static void main(String[] args){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(1);
        ListNode n3=new ListNode(1);
        ListNode n4=new ListNode(1);
        ListNode n5=new ListNode(1);
        ListNode n6=new ListNode(2);
        n1.next=n2;n2.next=n3;n3.next=n4;
        n4.next=n5;n5.next=n6;
        ListNode node=new Solution59().deleteDuplication(n1);
//        System.out.println(node);
        while(node!=null){
            System.out.println(node.val);
            node = node.next;
        }

    }

}
