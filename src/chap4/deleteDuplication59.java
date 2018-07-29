package chap4;
import java.lang.ref.PhantomReference;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

class Solution59 {
//    public ListNode deleteDuplication(ListNode pHead)
//    {
//        if (pHead == null || pHead.next==null) return pHead;
//        ListNode p=pHead;
//        ListNode q = pHead.next;
//        while(q!=null){
//            if(p.val==q.val){ p.next=q.next;q=q.next; }
//            else{
//            	p=p.next;q=q.next;
//            }
//        }
//        return pHead;
//    }
//	public ListNode deleteDuplication(ListNode pHead){
//		ListNode p = pHead;
//		while(p.val == p.next.val){
//			while(p!=null &&p.next!=null && p.val==p.next.val){
//				p=p.next;
//			}
//			pHead=p.next;
//			p=pHead;
//		}		
//		if(pHead==null || pHead.next==null){return pHead;}
//		
//		if(p.next.next==null){
//			if(p.val==p.next.val){return null;}
//			else{return pHead;}
//		}
//		ListNode q = p.next.next;
//		while(q!=null){
//			if(p.next.val==q.val){
//				p.next=q.next;
//				if(q.next!=null && q.next.next!=null){q=q.next.next;}
//				else{q=q.next;}
//			}
//			else{
//				p=p.next;
//				q=q.next;
//			}
//		}
//		
//		return pHead;
//	}
	public ListNode deleteDuplication(ListNode pHead){
		ListNode pNew= new ListNode(0);
		ListNode p=pHead;
		ListNode q = pNew; 
		while(p!=null && p.next!=null){
			if(p.val==p.next.val){p=p.next.next;}
			else{
				ListNode n=new ListNode(p.val);
				q.next = n; q = q.next;
				p=p.next;
			}
		}
//		if(p!=null && p.next!=null){
//		if(p.val != p.next.val){
//			ListNode n=new ListNode(p.next.val);
//			q.next = n;
//		}
//		}
		return pNew.next;
	}
}
public class deleteDuplication59 {
	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(3);
		ListNode n5=new ListNode(4);
		ListNode n6=new ListNode(4);
		ListNode n7=new ListNode(5);
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
		n5.next=n6;n6.next=n7;
		ListNode node=new Solution59().deleteDuplication(n1);
//		System.out.println(node);
		while(node!=null){
			System.out.println(node.val);node=node.next;
		}
	}
}
