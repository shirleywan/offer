package chap4;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import chap2.stackQueue07;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution38{
	//method-1:Stack
//    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
//    	Stack<ListNode> stack1=new Stack<ListNode>();
//    	Stack<ListNode> stack2=new Stack<ListNode>();
//    	ListNode p=pHead1;
//    	while(p!=null) {stack1.push(p);p=p.next;}
//    	p=pHead2;
//    	ListNode q=null;
//    	while(p!=null) {stack2.push(p);p=p.next;}
//    	while(!stack1.isEmpty() && !stack2.isEmpty()) {
//    		if(stack1.peek()!=stack2.peek()) {break;}
//    		else {q=stack1.pop();stack2.pop();}
//    	}
//    	return q;
//    }

	//offer-method-3:
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	int n=findLength(pHead1);
    	int m=findLength(pHead2);
    	ListNode p=pHead1;
    	ListNode q=pHead2;
    	if(n>m) {
    		for(int i=0;i<n-m;i++) { p=p.next; }
    	}
    	else {for(int i=0;i<m-n;i++) { q=q.next; }}
    	while(p!=null && q!=null) {
    		if(p==q) {break;}
    		else {p=p.next;q=q.next;}
    	}
    	return p;
    	
    }
    public int findLength(ListNode pHead1) {
    	ListNode p=pHead1;
    	int count=0;
    	while(p!=null) {
    		count++; p = p.next;
    	}
    	return count;
    }
    /**
     * method-2:reference
     */
//    public ListNode FindFirstCommonNodeII(ListNode pHead1, ListNode pHead2) {
//            ListNode current1 = pHead1;// 链表1
//            ListNode current2 = pHead2;// 链表2
//            if (pHead1 == null || pHead2 == null)
//                return null;
//            int length1 = getLength(current1);
//            int length2 = getLength(current2);
//            // 两连表的长度差
//             
//            // 如果链表1的长度大于链表2的长度
//            if (length1 >= length2) {
//                int len = length1 - length2;
//                // 先遍历链表1，遍历的长度就是两链表的长度差
//                while (len > 0) {
//                    current1 = current1.next;
//                    len--;
//                }
//     
//            }
//            // 如果链表2的长度大于链表1的长度
//            else if (length1 < length2) {
//                int len = length2 - length1;
//                // 先遍历链表1，遍历的长度就是两链表的长度差
//                while (len > 0) {
//                    current2 = current2.next;
//                    len--;
//                }
//     
//            }
//            //开始齐头并进，直到找到第一个公共结点
//            while(current1!=current2){
//                current1=current1.next;
//                current2=current2.next;
//            }
//            return current1;
//     
//        }
//     
//        // 求指定链表的长度
//        public static int getLength(ListNode pHead) {
//            int length = 0;
//     
//            ListNode current = pHead;
//            while (current != null) {
//                length++;
//                current = current.next;
//            }
//            return length;
//        }

} 

public class FindFirstCommonNode38 {
	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(6);
		ListNode n5=new ListNode(7);
		ListNode n6=new ListNode(4);
		ListNode n7=new ListNode(5);
		
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n5;
//		n6.next=n7;n7.next=n4;n4.next=n5;
		ListNode p=new Solution38().FindFirstCommonNode(n1,n1);
		System.out.println(p.val);
		
	}
}
