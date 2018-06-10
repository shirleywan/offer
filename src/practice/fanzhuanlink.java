package practice;

import java.util.*;

public class fanzhuanlink {
	public static ListNode fanzhuan1(ListNode n) {//注意放入stack中的节点next指针还没处理
		Stack<ListNode> stack= new Stack<ListNode>();
		if(n==null) {return null;}
		while(n!=null) {
			stack.push(n);
			n=n.next;
		}
		ListNode nnew=stack.pop();nnew.next=null;
		ListNode p=nnew;
		while(!stack.isEmpty()) {
			ListNode n1=stack.pop();
			p.next=n1;
			n1.next=null;
			p=p.next;
		}
		while(nnew!=null) {
			System.out.println(nnew.val);nnew=nnew.next;
		}
		return nnew;
	}
	/**
	 * 从原链表的头部一个一个取节点并插入到新链表的头部
	 * @param n
	 * @return
	 */
	public static ListNode fanzhuan2(ListNode n) {
		ListNode n1=null;
		ListNode p=n;
		while(p!=null) {
			ListNode node=p.next;
			p.next=n1;
			n1=p;//通过这句可以将n1移到新链表的头部
			p=node;
		}
		return n1;
	}
	/**
	 * 
	 * @param args
	 */
	public static ListNode fanzhuan3(ListNode n) {
		ListNode p=n;ListNode q=p.next;ListNode first=n;
		while(q!=null) {
			p=first;
			q.next=p.next;
			q.next=p;
			first=q;
			q=p.next;
		}
		return first;
	}
	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
		ListNode n=fanzhuan1(n1);
//		ListNode n=fanzhuan2(n1);
		while(n!=null) {
			System.out.println(n.val);n=n.next;
		}
	}
}
