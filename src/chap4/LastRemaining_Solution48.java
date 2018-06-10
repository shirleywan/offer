package chap4;
import java.util.*;

class Solution48 {
    public int LastRemaining_Solution(int n, int m) {
    	ListNode p=null;
    	ListNode k=p;
    	for(int i=0;i<n;i++) {
    		ListNode q=new ListNode(i);
    		k.next=q;k=k.next;
    	}
    	k.next=p.next;
    	int i=0;
    	while(k.next!=null) {
    		while(i<m-1) {
    			k=k.next;
    		}
    		
    	}
        return 0;
    }
}

public class LastRemaining_Solution48 {
	public static void main(String[] args) {
		
	}
}
