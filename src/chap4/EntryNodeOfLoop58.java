package chap4;
import java.util.*;
class Solution58 {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
    	if(pHead==null){return null;}
        List<ListNode> list=new ArrayList<ListNode>();
        while(pHead!=null){
        	if(!list.contains(pHead)){
            	list.add(pHead);
            }
            else{
            	return pHead;
            }
            pHead=pHead.next;
        }
        return null;
    }
}
public class EntryNodeOfLoop58 {
	public static void main(String[] args) {
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		n1.next=n2;n2.next=n3;n3.next=n4;n4.next=n2;
		System.out.println(new Solution58().EntryNodeOfLoop(n1).val);
		
	}
}
