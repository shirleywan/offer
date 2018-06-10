package chap2;

import java.io.IOException;

import practice.ListNode;

public class FindKthToTail17 {
    public static ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null || k==0){return null;}
    	ListNode m=head;
    	ListNode n=head;
    	int count=1;int num=0;
    	
    		while(count<=k && m.next!=null){
    			count++;
    			m=m.next;
    		}
    		while(m.next!=null){
    			count++;
    			m=m.next;
    			n=n.next;
    		}
    	
    	if(k==count){return head;}
    	if(k>count){return null;}
    	return n.next;
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
    public static void main(String[] args) throws IOException{
    	ListNode l1=stringToListNode("[1,3,4]");
    	ListNode m=FindKthToTail(l1,3);
    	System.out.println(m);
	}
}
