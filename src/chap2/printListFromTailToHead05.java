package chap2;

import java.util.ArrayList;
import java.util.Stack;
import practice.ListNode;

public class printListFromTailToHead05 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack=new Stack<Integer>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode!=null){
        	stack.push(listNode.val);
        	listNode=listNode.next;
        }
        while(!stack.isEmpty()){list.add(stack.pop());}
        return list;
    }
    public static void main(String[] args) {  
        ListNode node1 = new ListNode(1);  
        ListNode node2 = new ListNode(2);  
        ListNode node3 = new ListNode(3);  
        node1.next = node2;  
        node2.next = node3;  
        System.out.println(printListFromTailToHead(node1));
//        System.out.println();  
//        printReverseListRecursive(node1);  
          
    }
}
