package practice;

public class wangyibishi{
    public static ListNode reverse(ListNode n){
        ListNode n1=null;
        ListNode p=n;
        while(p!=null){
            ListNode node=p.next;
            p.next=n1;
            n1=p;
            p=node;
        }
        
        return n1;
    }
    public static ListNode add(ListNode n1,ListNode n2){
        if(n1==null){return n2;}
        if(n2==null){return n1;}
        ListNode p1=reverse(n1);
        
        ListNode p2=reverse(n2);
        
        ListNode p=p1;ListNode q=p2;
        ListNode first=new ListNode(0);ListNode m1=first;
        boolean flag=false;
        while(p!=null && q!=null){
            if(flag==true){
                ListNode m2=new ListNode((p.val+q.val)%10+1);
                m1.next=m2;
                m1=m1.next;
            }
            else{
                 ListNode m2=new ListNode((p.val+q.val)%10);
                 m1.next=m2;
                 m1=m1.next;
            }
            if(p.val+q.val>=10){
                flag=true;
            }
            else{
                flag=false;
            }
            p=p.next;
            q=q.next;
        }
        if(p!=null){
            while(p!=null){
                ListNode m2=new ListNode(p.val);
                m2=m1.next;
                m1=m1.next;
            }
        }
        else{
            while(q!=null){
                ListNode m2=new ListNode(q.val);
                m2=m1.next;
                m1=m1.next;
            }
        }
        return reverse(first.next);
    }
    public static void main(String[] args){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(5);
        n1.next=n2;n2.next=n3;
        
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);
        ListNode n6=new ListNode(6);
        n4.next=n5;n5.next=n6;
        
        
        ListNode p=add(n1,n4);
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
        
    }
}
