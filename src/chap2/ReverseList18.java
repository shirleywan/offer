package chap2;

import java.awt.image.PackedColorModel;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import practice.ListNode;

public class ReverseList18 {
//    public static ListNode ReverseList(ListNode head) {
//    	Map<Integer,Integer> map=new HashMap<Integer,Integer>();
//    	ListNode m=head;
//    	int count=1;
//    	while(m!=null){
//    		map.put(count,m.val);
//    		count++;
//    	}
//    	m=head;count--;
//    	while(m!=null){
//    		m.val=map.get(count);
//    		count--;
//    		m=m.next;
//    	}
//    	return head;
//    }
	public static ListNode ReverseList(ListNode head) {
		ListNode p=head;ListNode m=null;ListNode list=null;
		while(p!=null){
			ListNode n=p.next;
			if(n==null){list=p;} //当n为null时，当前p即为新链表的起始节点
			p.next=m; //赋值，即p.next=上一个节点
			m=p; //将m记录为本次循环的节点
			p=n;
		}
		return list;
	}
	public static ListNode reverse(ListNode pre,ListNode cur,ListNode t)//递归实现链表倒置
	{
	    cur.next = pre;
	    if(t == null)

	        return cur;
	    reverse(cur,t,t.next);
	    return null;
	}
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    public static void main(String[] args) throws IOException{
    	ListNode l1=stringToListNode("[1,3,4]");
    	ListNode l=ReverseList(l1);
        String out = listNodeToString(l);
        System.out.print(out);
        String p=listNodeToString(reverse(null,l1,l1.next));
        System.out.print(p);
	}
}
