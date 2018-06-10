package chap4;

import java.awt.RadialGradientPaint;

class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
class Solution27 {
    public RandomListNode Clone(RandomListNode pHead)
    {
    	RandomListNode p=pHead;
    	while(p!=null) {
    		RandomListNode node=new RandomListNode(p.label);
    		node.next=p.next;
    		p.next=node;
    		p=node.next;
    	}
    	
    	while(p!=null) {
    		RandomListNode q=p.next;
    		q.random=p.random.next;
    		p=q.next;
    	}
    	RandomListNode head=new RandomListNode(pHead.label);
    	p=pHead;
    	RandomListNode t=head;
    	while(p.next.next!=null) {
    		RandomListNode q=p.next;
    		p.next=q.next;
//    		q.next=p.next.next;
    		t.next=q;
    		p=p.next;
    		t=t.next;
    	}
    	p.next=null;
        return head.next;
    }
}

public class Clone27 {
	public static void main(String[] args) {
		RandomListNode n1=new RandomListNode(1);
		RandomListNode n2=new RandomListNode(2);
		RandomListNode n3=new RandomListNode(3);
		n1.next=n2;
		n2.next=n3;
		n1.random=n3;
		n2.random=n3;
//		RandomListNode p=n1;
//		while(p!=null) {
//			System.out.print(p.label+",");
//			p=p.next;
//		}
		RandomListNode p=new Solution27().Clone(n1);
		while(p!=null) {
			System.out.println(p.label+",");
			p=p.next;
		}
	}
}
